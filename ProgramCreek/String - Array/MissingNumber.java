import java.util.*;

public class MissingNumber {

    public static int findMissingNumber(int[] nums) {

        // Base Condition
        if(nums == null || nums.length == 0) {
            return 0;
        }

        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int n = nums.length;
        int missing_number = ((n * (n + 1)) / 2) - sum;
        return missing_number;

    }

    public static void main(String args[]) {

        int[] nums = new int[] {0, 1, 3};
        int missing_number = findMissingNumber(nums);
        System.out.println("The Missing Number: " + missing_number);

    }

}





























