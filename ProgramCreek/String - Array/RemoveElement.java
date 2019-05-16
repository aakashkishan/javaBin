import java.util.*;

public class RemoveElement {

    public static int removeElement(int[] nums, int remove_element) {

        // Base condition
        if(nums == null || nums.length == 0) {
            return 0;
        }

        // Double Pointer Method
        int i = 0;
        int j = 0;
        while(j < nums.length) {
            // In case of no-match with remove element
            if(nums[j] != remove_element) {
                nums[i] = nums[j];
                i += 1;
            }
            j += 1;
        }

        return i;

    }

    public static void main(String args[]) {

        int[] nums = new int[] {1, 3, 5, 7, 7, 8, 10, 12, 12, 13};
        int remove_element = 12;
        int length = removeElement(nums, remove_element);
        System.out.println("The Length of the Filtered array: " + length);
        System.out.println("The Filtered Array: ");
        for(int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }

    }

}






















