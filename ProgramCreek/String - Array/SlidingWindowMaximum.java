import java.util.*;

public class SlidingWindowMaximum {

    public static int[] altMaxSlidingWindow(int[] nums, int k) {
        
        if(nums == null || nums.length == 0) {
            return new int[0];
        }
        
        int[] result = new int[nums.length - k + 1];
        LinkedList<Integer> deque = new LinkedList<Integer>();
        for(int i = 0; i < nums.length; i++) {
            
            // Poll after the sliding window moves the particular index
            if(!deque.isEmpty() && deque.peekFirst() == i - k) {
                deque.poll();
            }
            
            // Remove the last element until the max element is at the peek position
            while(!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.removeLast();
            } 
            
            deque.offer(i);
            // Query the Maximum Element for every sliding window move
            if(i + 1 >= k) {
                result[i + 1 - k] = nums[deque.peek()];
            }
            
        }
        return result;
        
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        
        if(nums == null || nums.length == 0) {
            return new int[0];
        }
        
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < nums.length - k + 1; i++) {
            list.add(getMax(nums, i, k));
        }
        
        int[] sliding_window_max = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            sliding_window_max[i] = list.get(i);
        }
        
        return sliding_window_max;
        
    }
    
    public static int getMax(int[] nums, int start, int k) {
        int max = nums[start];
        for(int i = start; i < start + k; i++) {
            if(nums[i] > max) {
                max = nums[i];
            }
        }
        
        return max;
    }

    public static void main(String args[]) {

        int[] nums = new int[] {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] max_sliding_window = maxSlidingWindow(nums, k);
        System.out.println("The Maxmimum Values in the Sliding Window: ");
        for(int i: max_sliding_window) {
            System.out.print(i + " ");
        }

        System.out.println();
        max_sliding_window = altMaxSlidingWindow(nums, k);
        System.out.println("Alternate Method: The Maxmimum Values in the Sliding Window: ");
        for(int i: max_sliding_window) {
            System.out.print(i + " ");
        }

    }

}
























