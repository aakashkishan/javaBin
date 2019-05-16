import java.util.*;

public class ContainsDuplicatesI {

    public static boolean checkDuplicate(int[] nums) {

        if(nums == null || nums.length == 0) {
            return false;
        }

        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i : nums) {
            // Check if the element has been already added
            if(!hs.add(i)) {
                return true;
            }
        }

        return false;

    }

    public static void main(String args[]) {

        int[] nums = new int[] {2, 4, 5, 6, 3, 1, 2};
        boolean isDuplicate = checkDuplicate(nums);
        if(isDuplicate == true) {
            System.out.println("There are Duplicates :(");
        }
        else {
            System.out.println("There are no Duplicates!");
        }

    }

}






























