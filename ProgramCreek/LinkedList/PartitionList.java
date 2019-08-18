import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { 
        val = x; 
    }
}

class Solution {

    public ListNode partitionList(ListNode head, int x) {

        ListNode fakehead1 = new ListNode(0);
        ListNode fakehead2 = new ListNode(0);
        if(head == null) {
            return null;
        }

        fakehead1.next = head;
        ListNode prev =  fakehead1;
        ListNode gr_node = fakehead2;
        ListNode curr_node = head;
        while(curr_node != null) {
            if(curr_node.val < x) {
                prev = prev.next;
                curr_node = curr_node.next;
            }

            else {
                gr_node.next = curr_node;
                prev.next = curr_node.next;

                gr_node = gr_node.next;
                curr_node = prev.next;
            }
        }
        gr_node.next = null;
        prev.next = fakehead2.next;
        return fakehead1.next;

    }

}

public class PartitionList {

    public static void main(String args[]) {

        int x = 3;
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);
        ListNode fakehead = head;
        System.out.println("Original List: ");
        while(fakehead != null) {
            System.out.print(fakehead.val + " ");
            fakehead = fakehead.next;
        }

        ListNode result_head = new Solution().partitionList(head, x);
        System.out.println();
        System.out.println("Partitioned List: ");
        while(result_head != null) {
            System.out.print(result_head.val + " ");
            result_head = result_head.next;
        }

    }

}