import java.io.*;

class Solution {

    public ListNode swapElements(ListNode head) {

        if(head == null || head.next == null) {
            return head;
        }

        ListNode fakehead = new ListNode(0);
        fakehead.next = head;
        ListNode prev = fakehead;
        ListNode curr = head;
        ListNode next = head.next;

        while(prev.next != null && prev.next.next != null) {
            prev.next = next;
            ListNode next_to_next = next.next;
            next.next = curr;
            prev = curr;
            curr.next = next_to_next;

            curr = curr.next;
            if(next_to_next != null) {
                next = curr.next;
            }
        }

        return fakehead.next;

    }

}


public class SwapLinkedListElements {

    public static void main(String args[]) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        ListNode fakehead = head;
        System.out.println("Original List: ");
        while(fakehead != null) {
            System.out.print(fakehead.val + " ");
            fakehead = fakehead.next;
        }

        ListNode result_head = new Solution().swapElements(head);
        System.out.println();
        System.out.println("Swapped List: ");
        while(result_head != null) {
            System.out.print(result_head.val + " ");
            result_head = result_head.next;
        }

    }

}













