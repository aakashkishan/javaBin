import java.util.*;

public class ContainsDuplicatesIII {

    public static boolean containsDup3(int[] nums, int index_diff, int element_diff) {

        if(nums == null || nums.length == 0 || index_diff < 0 || element_diff < 0) {
            return false;
        }

        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(i != j) {
                    if((Math.abs(nums[j] - nums[i]) < element_diff) && (Math.abs(j - i) < index_diff)) {
                        return true;
                    }
                } 
            }
        }

        return false;

    }

    public static void main(String args[]) {

        int[] nums = new int[] {1, 3, 4, 5, 7, 8, 9};
        int index_diff = 4;
        int element_diff = 2;
        boolean isExists = containsDup3(nums, index_diff, element_diff);
        if(isExists == true) {
            System.out.println("There exists two distinct indices!");
        } else {
            System.out.println("There does not exist two distinct indices :(");
        }

    }

}























