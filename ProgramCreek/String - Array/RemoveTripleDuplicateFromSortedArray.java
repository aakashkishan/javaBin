import java.util.*;

public class RemoveTripleDuplicateFromSortedArray {

    public static int removeTripleDuplicates(int[] nums) {

        // Base Condition
        if(nums == null || nums.length == 0) {
            return 0;
        }
        if(nums.length < 3) {
            return nums.length;
        }

        int i = 1; // Point to previous
        int j = 2; // Point to current
        while(j < nums.length) {
            // Check for triple duplicates
            if(nums[i] == nums[j] && nums[i - 1] == nums[j]) {
                j += 1;
            }
            else {
                i += 1;
                nums[i] = nums[j];
                j += 1;
            }
        }

        return i + 1;

    }

    public static void main(String args[]) {

        int[] nums = new int[] {1, 3, 5, 7, 7, 7, 8, 10, 12, 12, 13};
        int length = removeTripleDuplicates(nums);
        System.out.println("The length of non-duplicate Array: " + length);
        System.out.println("The non-duplicate Array: ");
        for(int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }

    }

}



























