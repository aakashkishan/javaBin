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

public class MergeSortedLists {

    public static ListNode mergeTwoLists(ListNode head1, ListNode head2) {

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
        ListNode fakehead = new ListNode(0);
        ListNode prev = fakehead;

        while(fakehead1 != null && fakehead2 != null) {
            if(fakehead1.val > fakehead2.val) {
                ListNode curr = new ListNode(fakehead2.val);
                prev.next = curr;
                prev = prev.next;
                fakehead2 = fakehead2.next; 
            }
            else {
                ListNode curr = new ListNode(fakehead1.val);
                prev.next = curr;
                prev = prev.next;
                fakehead1 = fakehead1.next;
            }
        }

        if(fakehead1 != null) {
            prev.next = fakehead1;
        }

        if(fakehead2 != null) {
            prev.next = fakehead2;
        }
        return fakehead.next;

    }

    public static void main(String args[]) {

        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(4);

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(4);

        ListNode merge_list = mergeTwoLists(head1, head2);
        System.out.println("The Merged Sorted Lists: ");
        while(merge_list.next != null) {
            System.out.print(merge_list.val + " -> ");
            merge_list = merge_list.next;
        }
        System.out.print(merge_list.val);

    }

}









