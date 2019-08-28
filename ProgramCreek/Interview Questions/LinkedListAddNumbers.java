import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
    }

    ListNode(int x) { 
        val = x; 
    }
}

public class LinkedListAddNumbers {

    public static ListNode getListSum(ListNode head1, ListNode head2) {

        if(head1 == null && head2 == null) {
            return null;
        }

        if(head1 == null) {
            return head2;
        }

        if(head2 == null) {
            return head1;
        }

        ListNode fakehead1 = head1;
        ListNode fakehead2 = head2;
        ListNode result_head = new ListNode();
        ListNode result_fake = result_head;
        int carry = 0;

        while(fakehead1 != null && fakehead2 != null) {
            int sum = (fakehead1.val + fakehead2.val) % 10;
            result_head.val = carry + sum;
            carry = (fakehead1.val + fakehead2.val + carry) / 10;

            ListNode temp = new ListNode();
            result_head.next = temp;
            fakehead1 = fakehead1.next;
            fakehead2 = fakehead2.next;
            result_head = result_head.next;
        }

        if(fakehead1 == null) {
            while(fakehead2 != null) {
                result_head.val = carry + fakehead2.val;
                carry = (fakehead2.val + carry) / 10;
                ListNode temp = new ListNode();
                result_head.next = temp;
                fakehead2 = fakehead2.next;
                result_head = result_head.next;
            }
        }

        if(fakehead2 == null) {
            while(fakehead1 != null) {
                result_head.val = carry + fakehead1.val;
                carry = (fakehead1.val + carry) / 10;
                ListNode temp = new ListNode();
                result_head.next = temp;
                fakehead1 = fakehead1.next;
                result_head = result_head.next;
            }
        }

        return result_fake;
    }

    public static void main(String args[]) {

        ListNode head1 = new ListNode(2);
        head1.next = new ListNode(4);
        head1.next.next = new ListNode(3);

        ListNode head2 = new ListNode(5);
        head2.next = new ListNode(6);
        head2.next.next = new ListNode(4);

        ListNode sum_head = getListSum(head1, head2);
        System.out.println("The Sum of the Linked Lists: ");
        while(sum_head.next != null) {
            System.out.print(sum_head.val + " -> ");
            sum_head = sum_head.next;
        }
        if(sum_head.val == 0) {
            System.out.print("null");
        }

    }

}













