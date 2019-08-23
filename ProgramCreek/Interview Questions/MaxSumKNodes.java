import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { 
        val = x; 
    }
}

public class MaxSumKNodes {

    public static int getMaxSum(ListNode head, int k) {

        if(head == null) {
            return -1;
        }

        ListNode start = head;
        ListNode end = head;
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += end.val;
            end = end.next;
        }
        
        int max_sum = sum;
        while(end != null) {
            sum -= start.val;
            start = start.next;
            
            sum += end.val;
            end = end.next;

            max_sum = Math.max(sum, max_sum);
        }
        return max_sum;

    }

    public static void main(String args[]) {

        // Create a LinkedList
        ListNode head = new ListNode(2);
        head.next = new ListNode(5);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(6);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next.next = new ListNode(7);

        int k = 4;
        int max_sum = getMaxSum(head, k);
        System.out.println("The Maximum Sum of K Consecutive Nodes: " + max_sum);

    }

}











