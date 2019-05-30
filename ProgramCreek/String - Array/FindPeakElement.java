import java.util.*;

public class FindPeakElement {

    public static int findPeakElement(int[] nums) {

        if(nums == null || nums.length == 0) {
            return -1;
        }
        
        // Max Element and Max Element Index
        int max = nums[0];
        int max_index = 0;
        
        for(int i = 1; i < nums.length - 1; i++) {
            // Set the prev, curr and next elements
            int prev = nums[i - 1];
            int curr = nums[i];
            int next = nums[i + 1];
            
            if(curr > prev && curr > next && curr > max) {
                max = curr;
                max_index = i;
            }
        }
        
        if(nums[nums.length - 1] > max) {
            return nums.length - 1;
        }
        
        return max_index;
        
    }

    public static void main(String args[]) {

        int[] nums = new int[] {1, 2, 3, 4, 2, 1, 3, 1};
        int max_index = findPeakElement(nums);
        System.out.println("The Max Element Index: " + max_index);
 
    }

}























