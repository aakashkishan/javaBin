import java.util.*;

class ListNode {

    int data;
    ListNode next;
    
    public ListNode(int x) {
        data = x;
    }

}

public class RemoveNthNodeFromEnd {

    public static ListNode removeNode(ListNode head, int n) {

        if( n <= 0) {
            return head;
        }

        ListNode dummy_head = new ListNode(0);
        dummy_head.next = head;

        ListNode nth_node_pointer = dummy_head;
        for(int i = 0; i < n; i++) {
            if(head == null) {
                return null;
            }
            head = head.next;
        }

        while(head != null) {
            nth_node_pointer = nth_node_pointer.next;
            head = head.next;
        }

        nth_node_pointer .next = nth_node_pointer.next.next;

        return dummy_head.next;

    }

    public static void main(String args[]) {

        ListNode head = new ListNode(1);
        ListNode dummy = head;
        int n = 2;

        for(int i = 2; i < 6; i++) {
            dummy.next = new ListNode(i);
            dummy = dummy.next;
        }

        head = removeNode(head, n);
        while(head != null) {
            System.out.print(" " + head.data);
            head = head.next;
        }

    }

}




























