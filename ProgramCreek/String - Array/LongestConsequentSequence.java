import java.util.*;

public class LongestConsequentSequence {

    public static int findLongestSequence(int[] nums) {

        // Null check
        if(nums == null || nums.length == 0) {
            return 0;
        }

        Set<Integer> hs = new HashSet<Integer>();
        int max_length = 1;
        // Add all the elements of the array to the Set
        for(int element: nums) {
            hs.add(element);
        }

        for(int element: nums) {
            int left = element - 1;
            int right = element + 1;
            int count = 1;

            while(hs.contains(left)) {
                count += 1;
                hs.remove(left);
                left -= 1;
            }

            while(hs.contains(right)) {
                count += 1;
                hs.remove(right);
                right += 1;
            }

            max_length = Math.max(max_length, count);
        }

        return max_length;

    }

    public static void main(String args[]) {

        int[] nums = new int[] {100, 4, 400, 1, 3, 2};
        int sequence_length = findLongestSequence(nums);
        System.out.println("The Length of the Consequent Sequence: " + sequence_length);

    }

}































