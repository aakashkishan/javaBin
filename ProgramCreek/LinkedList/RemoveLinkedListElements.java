import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { 
        val = x; 
    }
}

class Solution {

    public ListNode removeElement(ListNode head, int x) {
        if(head == null) {
            return null;
        }

        ListNode fakehead = new ListNode(0);
        fakehead.next = head;

        while(fakehead.next != null) {
            if(fakehead.next.val == x) {
                fakehead.next = fakehead.next.next;
            }
            else {
                fakehead = fakehead.next;
            }
        }
        return head;
    }

}

public class RemoveLinkedListElements {

    public static void main(String args[]) {

        int x = 6;
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(6);
        ListNode fakehead = head;
        System.out.println("Original List: ");
        while(fakehead != null) {
            System.out.print(fakehead.val + " ");
            fakehead = fakehead.next;
        }

        ListNode result_head = new Solution().removeElement(head, x);
        System.out.println();
        System.out.println("Modified List after Removal: ");
        while(result_head != null) {
            System.out.print(result_head.val + " ");
            result_head = result_head.next;
        }

    }

}

























