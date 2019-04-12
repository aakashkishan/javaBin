import java.util.*;

public class LargestPositiveDifference {

    public static int findMaxDiff(int[] numbers) {

        int max_diff = 0;
        int min_value = Integer.MAX_VALUE;

        for(int i = 0; i < numbers.length; i++) {
            min_value = Math.min(min_value, numbers[i]);
            max_diff = Math.max(max_diff, numbers[i] - min_value);
        }

        return max_diff;

    }

    public static void main(String args[]) {

        int[] numbers = new int[] {7, 1, 5, 3, 6, 4};
        int max_diff = 0;

        max_diff = findMaxDiff(numbers);
        System.out.println("The Maximum Difference: " + max_diff);

    }

}

































