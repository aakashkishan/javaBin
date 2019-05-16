import java.util.*;

public class ContainsDuplicatesII {

    public static boolean checkDuplicate(int[] nums, int k_diff) {

        // Base Condition
        if(nums == null || nums.length == 0) {
            return false;
        }

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(hm.containsKey(nums[i])) {
                int prev = hm.get(nums[i]);
                if(i - prev <= k_diff) {
                    return true;
                }
            }
            hm.put(nums[i], i);
        }

        return false;

    }

    public static void main(String args[]) {

        int[] nums = new int[] {9, 1, 2, 5, 6, 7, 8, 3, 9};
        int k_diff = 5;
        boolean isDuplicate = checkDuplicate(nums, k_diff);
        if(isDuplicate == true) {
            System.out.println("There are Dulicates within K :(");
        }
        else {
            System.out.println("There are no Duplicates within K!");
        }

    }

}
































