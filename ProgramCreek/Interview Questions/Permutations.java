import java.util.*;

public class Permutations {

    public static void swap(int[] nums, int index1, int index2) {

        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;

    }

    public static void helper(int start, int[] nums, List<List<Integer>> result) {

        if(start == nums.length - 1) {
            List<Integer> list = new ArrayList<>();
            for(int i: nums) {
                list.add(i);
            }
            result.add(list);
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            swap(nums, start, i);
            helper(start + 1, nums, result);
            swap(nums, start, i);
        }

    }

    public static List<List<Integer>> getPermutations(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        helper(0, nums, result);
        return result;

    }

    public static void main(String args[]) {

        int[] nums = new int[] {1, 3, 5};
        List<List<Integer>> permutations = getPermutations(nums);
        System.out.println("The Permutations: ");
        for(List<Integer> list: permutations) {
            for(int i: list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

}















