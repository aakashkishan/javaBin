import java.util.*;

public class MinSumTriangle {

    public static int findMinPath(ArrayList<ArrayList<Integer>> triangle) {

        // Create an array to hold all the path value
        // Declaration & Initialization
        int[] total = new int[triangle.size()];
        int length = triangle.size() - 1;

        // Bottom-Up Solution
        for(int i = 0; i < triangle.get(length).size(); i++) {
            total[i] = triangle.get(length).get(i);
        }

        // Iterate from the pen-ultimate row
        for(int i = triangle.size() - 2; i >= 0; i--) {
            for(int j = 0; j < triangle.get(i + 1).size() - 1; j++) {
                // A Path can be made from only the adjancent blocks from the bottom row to the top row
                total[j] = triangle.get(i).get(j) + Math.min(total[j], total[j+1]);
            }
        }

        return total[0];

    }

    public static void main(String args[]) {

        ArrayList<ArrayList<Integer>> triangle = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.addAll(Arrays.asList(2));
        ArrayList<Integer> l2 = new ArrayList<Integer>();
        l2.addAll(Arrays.asList(3, 4));
        ArrayList<Integer> l3 = new ArrayList<Integer>();
        l3.addAll(Arrays.asList(6, 5, 7));
        ArrayList<Integer> l4 = new ArrayList<Integer>();
        l4.addAll(Arrays.asList(4, 1, 8, 3));
        triangle.add(l1);
        triangle.add(l2);
        triangle.add(l3);
        triangle.add(l4);
        int min_sum = findMinPath(triangle);
        System.out.println("The Minimum Path from Top to Bottom: " + min_sum);

    }

}



























