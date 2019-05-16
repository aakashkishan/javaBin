import java.util.*;

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {

        // Double Pointer Method
        int i = 0;
        int j = 0;
        while(j < nums.length) {
            // When not Zero
            if(nums[j] != 0) {
                nums[i] = nums[j];
                i += 1;
            }
            j += 1;
        }

        // Once the Elements are moved to the left, set the remaining elements to Zero
        while(i < nums.length) {
            nums[i] = 0;
            i += 1;
        }

    }

    public static void main(String args[]) {

        int[] nums = new int[] {0, 1, 0, 3, 12};
        System.out.println("Original Array: ");
        for(int i: nums) {
            System.out.print(i + " ");
        }
        
        moveZeroes(nums);
        System.out.println();
        System.out.println("When Zeroes Moved: ");
        for(int i: nums) {
            System.out.print(i + " ");
        }

    }

}




























