import java.util.*;

public class SummaryRange {

    public static List<String> summaryRange(int[] nums) {

        List<String> result = new ArrayList<String>();
        // Base Condition
        if(nums == null || nums.length == 0) {
            return result;
        }
        if(nums.length == 1) {
            result.add(nums[0] + "");
        }

        int prev = nums[0]; // Previous Element
        int first = prev; // First Element of each range
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == prev + 1) {
                if(i == nums.length - 1) {
                    result.add(first + "->" + nums[i]);
                }
            }
            else {
                if(first == prev) {
                    result.add(first + "");
                }
                else {
                    result.add(first + "->" + prev);
                }

                if(i == nums.length - 1) {
                    result.add(nums[i] + "");
                }
                first = nums[i];
            }
            prev = nums[i];
        }

        return result;

    }

    public static void main(String args[]) {

        int[] nums = new int[] {0, 1, 2, 4, 5, 7};
        List<String> result_range = summaryRange(nums);
        System.out.println("The Summary of the Range: ");
        for(String str: result_range) {
            System.out.println(str);
        }

    }

}


























