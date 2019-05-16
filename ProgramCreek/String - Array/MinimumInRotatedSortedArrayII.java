import java.util.*;

public class MinimumInRotatedSortedArrayII {

    public static int findMinElement(int[] nums) {

        // Base Condition
        if(nums == null || nums.length == 0) {
            return -1;
        }

        int i = 0; // Left Pointer
        int j = nums.length - 1; // Right Pointer
        // Use Binary Search Methodology
        while(i <= j) {
            // Check for duplicates
            if(nums[i] == nums[j] && i != j) {
                i += 1;
            }

            if(nums[i] <= nums[j]) {
                return nums[i];
            }
            int mid = (i + j) / 2;
            if(nums[mid] >= nums[i]) {
                i = mid + 1;
            }
            else {
                j = mid;
            }
        }
        
        return -1;

    }

    public static void main(String args[]) {

        // Duplicates Allowed
        int[] nums = new int[] {3, 1, 2, 3};
        int min_element = findMinElement(nums);
        System.out.println("The Minimum Element in the Rotated Sorted Array with Duplicates: " + min_element);

    }

}

























