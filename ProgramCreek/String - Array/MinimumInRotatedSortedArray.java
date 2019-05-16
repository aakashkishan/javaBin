import java.util.*;

public class MinimumInRotatedSortedArray {

    public static int findMinElement(int[] nums) {

        if(nums == null || nums.length == 0) {
            return -1;
        }

        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i + 1] < nums[i]) {
                return nums[i+1];
            }
        }
        return nums[0];

    }

    public static int altFindMinElement(int[] nums) {

        // Base Condition
        if(nums == null || nums.length == 0) {
            return -1;
        }

        int i = 0; // Left Pointer
        int j = nums.length - 1; // Right Pointer
        // Using Binary Search Methodology
        while(i <= j) {
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

        int[] nums = new int[] {4, 5, 1, 2, 3};
        int min_element = -1;
        min_element = findMinElement(nums);
        System.out.println("The Minimum Element in the Rotated Sorted Array: " + min_element);

        min_element = altFindMinElement(nums);
        System.out.println("The Minimum element in the Rotated Sorted array [ALT]: " + min_element);

    }

}





























