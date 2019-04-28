import java.util.*;

public class KthLargestElement {

    public static int findKthLargest(int[] nums, int k) {

        int kth_largest = 0;
        iF(nums == null || nums.length == 0) {
            return kth_largest;
        }

        // Use a MinHeap or a Priority Queue to help with the polling of the small elements
        PriorityQueue<Integer> p_queue = new PriorityQueue<Integer>();
        for(int i : nums) {
            p_queue.offer(i);
            if(p_queue.size() > k) {
                p_queue.poll();
            }
        }

        return p_queue.peek();

    }

    public static void main(String args[]) {

        int[] nums = new int[] {3, 2, 7, 5, 9, 1, 0};
        int k = 4;
        int kth_largest = findKthLargest(nums, k);
        System.out.print("The " + k + "th largest element: " + kth_largest);

    }

}





























