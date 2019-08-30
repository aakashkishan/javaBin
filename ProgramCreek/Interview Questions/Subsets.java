import java.util.*;

public class Subsets {

    public static ArrayList<ArrayList<Integer>> getSubsets(int[] nums) {

        if(nums == null) {
            return null;
        }

        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {

            ArrayList<ArrayList<Integer>> temp = new ArrayList<>();
            for(ArrayList<Integer> list: result) {
                temp.add(new ArrayList<Integer>(list));
            }

            for(ArrayList<Integer> a: temp) {
                a.add(nums[i]);
            }

            ArrayList<Integer> single = new ArrayList<>();
            single.add(nums[i]);
            temp.add(single);
            result.addAll(temp);

        }

        result.add(new ArrayList<Integer>());
        return result;

    }

    public static void main(String args[]) {

        int[] nums = new int[] {1, 2, 3};
        ArrayList<ArrayList<Integer>> subsets = getSubsets(nums);
        System.out.println("The Subsets: ");
        for(ArrayList<Integer> list: subsets) {
            for(int i: list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

}
















