import java.util.*;

public class PascalsTriangle {

    public static ArrayList<ArrayList<Integer>> generatePascal(int rows) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(rows <= 0) {
            return result;
        }

        ArrayList<Integer> pre = new ArrayList<Integer>();
        pre.add(1);
        result.add(pre);
        for(int i = 2; i <= rows; i++) {
            ArrayList<Integer> current = new ArrayList<Integer>();
            // First Element in that row
            current.add(1);
            for(int j = 0; j < pre.size() - 1; j++) {
                // Middle Elements
                current.add(pre.get(j) + pre.get(j + 1));
            }
            // Last Element of the row
            current.add(1);

            result.add(current);
            pre = current;

        }

        return result;

    }

    public static void main(String args[]) {

        int rows = 5;
        ArrayList<ArrayList<Integer>> pascal_triangle = new ArrayList<ArrayList<Integer>>();
        pascal_triangle = generatePascal(rows);
        int space = pascal_triangle.size();
        for(int i = 0; i < pascal_triangle.size(); i++) {
            // Spaces
            for(int k = 0; k < space; k++) {
                System.out.print(" ");
            }
            // Pascal Triangle Elements
            for(int j = 0; j < pascal_triangle.get(i).size(); j++) {
                System.out.print(pascal_triangle.get(i).get(j) + " ");
            }
            space -= 1;
            System.out.println();
        }

    }

}
























