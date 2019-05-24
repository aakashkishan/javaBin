import java.util.*;

public class FindTheDuplicate {

    public static int findDuplicate(int[] nums) {
        
        int slow = 0; // Slow Pointer
        int fast = 0; // Fast Pointer
        
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);
            
        int find = 0;
        while(find != slow) {
            find = nums[find];
            slow = nums[slow];
        }
        
        return find;
        
    }

    public static void main(String args[]) {

        int[] nums = new int[] {4, 2, 1, 3, 2};
        int duplicate = findDuplicate(nums);
        System.out.println("The Duplicate Element: " + duplicate);

    }

}