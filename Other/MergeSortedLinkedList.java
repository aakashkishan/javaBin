import java.util.*;

class ListNode {
    int data;
    ListNode next;
    public ListNode(int x) {
        this.data = x;
    }

    public ListNode() {

    }
}

public class MergeSortedLinkedList {

    public static ListNode mergeLists(ListNode head1, ListNode head2) {
        ListNode dummy_head = new ListNode(0);
        ListNode sorted_list = dummy_head;

        while(head1 != null && head2 != null) {
            if(head1.data <= head2.data) {
                sorted_list.next = head1;
                head1 = head1.next;
            } else {
                sorted_list.next = head2;
                head2 = head2.next;
            }
            sorted_list = sorted_list.next;
        }

        if(head1 != null) {
            sorted_list.next = head1;
        }

        if(head2 != null) {
            sorted_list.next = head2;
        }

        return dummy_head.next;
    }

    public static void main(String args[])  {
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(1);

        head1.next = new ListNode(2);
        head1.next.next = new ListNode(4);

        head2.next = new ListNode(3);
        head2.next.next = new ListNode(4);

        ListNode sorted = mergeLists(head1, head2);
        System.out.print("head");
        while(sorted != null) {
            System.out.print(" -> " + sorted.data);
            sorted = sorted.next;
        }
    }   

}



























