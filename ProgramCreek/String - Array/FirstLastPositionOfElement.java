import java.util.*;

public class FirstLastPositionOfElement {

    public static int[] searchRange(int[] nums, int target) {

        // Use Binary Search for O(logN) complexity
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }

        int first = left;
        // If left in boundary and target is found
        if(left < nums.length && nums[left] == target) {
            left = 0;
            right = nums.length - 1;
            while(left < right) {
                int mid = left + (right - left + 1) / 2;
                if(nums[mid] > target) {
                    right = mid - 1;
                }
                else {
                    left = mid;
                }
            }
            return new int[] {first, right};
        }

        return new int[] {-1, -1};

    }

    public static void main(String args[]) {

        int[] nums = new int[] {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] range = searchRange(nums, target);
        System.out.println("The Searhc Range of the target: ");
        for(int i: range) {
            System.out.print(i+ " ");
        }

    }

}
































