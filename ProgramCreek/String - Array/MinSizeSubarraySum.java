import java.util.*;

public class MinSizeSubarraySum {

    public static int findMinSize(int[] nums, int sum_limit) {

        if(nums == null || nums.length == 0) {
            return 0;
        }

        int min_size = nums.length;
        int start = 0;
        int sum = 0;
        int i = 0;
        boolean isExists = false;

        while(i <= nums.length) {
            if(sum >= sum_limit) {
                // Mark if there exists such a subarray
                isExists = true;
                if(start == i-1) {
                    return 1;
                }
                min_size = Math.min(min_size, i - start);
                sum = sum - nums[start];
                start += 1;
            }
            else {
                if(i == nums.length) {
                    break;
                }
                sum = sum + nums[i];
                i += 1;
            }
        }

        if(isExists == true) {
            return min_size;
        }
        else {
            return 0;
        }

    }

    public static void main(String args[]) {

        int[] nums = new int[] {2, 1, 3, 2, 4, 3};
        int sum_limit = 7;
        int min_size = findMinSize(nums, sum_limit);
        System.out.println("The Min Size of Subarray Sum: " + min_size);

    }

}

























