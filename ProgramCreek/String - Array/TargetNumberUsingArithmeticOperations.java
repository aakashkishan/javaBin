import java.util.*;

public class TargetNumberUsingArithmeticOperations {

    public static ArrayList<Integer> getResults(int[] nums, int left, int right) {

        ArrayList<Integer> result = new ArrayList<Integer>();
        if(left > right) {
            return result;
        }
        else if(left == right) {
            result.add(nums[left]);
            return result;
        }

        for(int i = left; i < right; i++) {
            ArrayList<Integer> result1 = getResults(nums, left, i);
            ArrayList<Integer> result2 = getResults(nums, i + 1, right);

            for(int x: result1) {
                for(int y: result2) {
                    result.add(x + y);
                    result.add(x - y);
                    result.add(x * y);
                    if(y != 0) {
                        result.add(x / y);
                    }
                }
            }
        }

        return result;

    }

    public static boolean reachTarget(int[] nums, int target) {

        // Base Condition
        if(nums == null || nums.length == 0) {
            return false;
        }

        int left = 0;
        int right = nums.length - 1;
        ArrayList<Integer> results = getResults(nums, left, right);
        for(int num : results) {
            if(num == target) {
                return true;
            }
        }

        return false;

    }

    public static void main(String args[]) {

        int[] nums = new int[] {1, 2, 3, 4};
        int target = 21;
        boolean isTarget = reachTarget(nums, target);
        if(isTarget == true) {
            System.out.println("The Target is Achievable!");
        }
        else {
            System.out.println("The Target is not Achievable :(");
        }

    }

}





























