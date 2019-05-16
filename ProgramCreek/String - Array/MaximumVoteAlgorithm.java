import java.util.*;

public class MaximumVoteAlgorithm {

    public static int findMaxVote(int[] nums) {

        int result = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(count == 0) {
                result = nums[i];
                count = 1;
            }
            else if(result == nums[i]) {
                count += 1;
            }
            else {
                count -= 1;
            }
        }
        return result;

    }

    public static void main(String args[]) {

        int[] nums = new int[] {1, 2, 3, 2, 2};
        int max_element = findMaxVote(nums);
        System.out.println("The Element with the Maximum Vote: " + max_element);

    }

}



























