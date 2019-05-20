import java.util.*;

public class IncreasingTripletSequence {

    public static boolean increasingTriplet(int[] nums) {

        int small = Integer.MAX_VALUE;
        int big = Integer.MAX_VALUE;

        // Base Condition
        if(nums == null || nums.length == 0) {
            return false;
        }

        for(int i : nums) {
            if(i <= small) {
                small = i; // Update small if element is less than small
            }
            else if(i <= big) {
                big = i; // Update big if element is less than big
            }
            else {
                return true;
            }
        }

        return false;

    }

    public static void main(String args[]) {

        int[] nums = new int[] {1, 2, 4, 5, 6};
        boolean isTriplet = increasingTriplet(nums);
        if(isTriplet == true) {
            System.out.println("The Array has Triplets!");
        }
        else {
            System.out.println("The Array does not have Triplets :(");
        }

    }

}































