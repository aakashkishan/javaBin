import java.util.*;

public class RemoveDuplicateFromSortedArray {

    public static int removeDuplicates(int[] nums) {

        // Base Conditions
        if(nums == null || nums.length == 0) {
            return 0;
        }
        if(nums.length < 2) {
            return nums.length;
        }

        int j = 0;
        int i = 1;
        while(i < nums.length) {
            // In case of no duplicates
            if(nums[i] != nums[j]) {
                j += 1;
                nums[j] = nums[i];
            }
            i += 1;
        }

        return j + 1;

    }

    public static void main(String args[]) {

        int[] nums = new int[] {1, 3, 5, 7, 7, 7, 8, 10, 12, 12, 13};
        int length = removeDuplicates(nums);
        System.out.println("The length of non-duplicate Array: " + length);
        System.out.println("The non-duplicate Array: ");
        for(int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }

    }

}



























