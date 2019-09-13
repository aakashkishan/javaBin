import java.util.*;

public class TwoSum {

    public static int[] getTwoSum(int[] nums, int sum) {

        int[] two_sums = new int[2];
        if(nums == null || nums.length < 2) {
            return null;
        }

        int left = 0;
        int right = nums.length - 1;
        Arrays.sort(nums);

        while(left < right) {
            if(nums[left] + nums[right] == sum) {
                two_sums[0] = nums[left];
                two_sums[1] = nums[right];
                return two_sums;
            }
            else if(nums[left] + nums[right] < sum) {
                left += 1;
            }
            else {
                right -= 1;
            }
        }
        return null; 

    }

    public static void main(String args[]) {

        int[] nums = new int[] {2, 7, 11, 15};
        int sum = 9;
        int[] two_nums = getTwoSum(nums, sum);
        System.out.println("The Two Sum Elements: " + two_nums[0] + ", " + two_nums[1]);

    }

}












