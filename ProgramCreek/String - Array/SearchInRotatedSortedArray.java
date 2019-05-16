import java.util.*;

public class SearchInRotatedSortedArray {

    public static int searchElement(int[] nums, int search_target) {

        // Base Condition
        if(nums == null || nums.length == 0) {
            return -1;
        }

        int left = 0; // Left Pointer
        int right = nums.length - 1; // Right Pointer
        while(left <= right) {

            int mid = left + (right - left) / 2;
            // Loop Exit Condition
            if(search_target == nums[mid]) {
                return mid + 1;
            }

            if(nums[left] <= nums[mid]) {
                if(nums[left] <= search_target && search_target < nums[mid]) {
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }
            else {
                if(nums[mid] < search_target && search_target <= nums[right]) {
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }

        }

        return -1;

    }

    public static void main(String args[]) {

        int[] nums = new int[] {5, 6, 1, 2, 3, 4};
        int search_target = 2;
        int result_index = searchElement(nums, search_target);
        System.out.println("Search Index of the target element in Rotated Sorted Array: " + result_index);

    }
    
}






























