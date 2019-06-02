import java.util.*;

public class MovingAverageDataStream {

    public static float[] getMovingAverage(int[] nums, int k) {

        // Base Condition
        if(nums == null || nums.length == 0) {
            return new float[0];
        }

        float[] result = new float[nums.length - k + 1];
        for(int i = 0; i < nums.length - k + 1; i++) {
            result[i] = average(nums, i, k);
        }
        return result;
    }

    public static float average(int[] nums, int start, int k) {

        float avg = 0;
        for(int i = start; i < start + k; i++) {
            avg += nums[i];
        }
        return avg / k;

    }

    public static void main(String args[]) {

        int[] nums = new int[] {-1, 3, 1, -3, 5, 3, 6, 7};
        int k = 3;
        float[] result = getMovingAverage(nums, k);
        System.out.println("The Moving Average from Data Stream: ");
        for(float i: result) {
            System.out.print(i + " ");
        }

    }

}





























