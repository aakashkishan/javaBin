import java.util.*;


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { 
        val = x; 
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode head1 = l1;
        ListNode head2 = l2;
        
        ListNode fake = new ListNode(0);
        ListNode result = fake;
        
        while(head1 != null && head2 != null) {
            if(head1.val <= head2.val) {
                ListNode result_element = new ListNode(head1.val);
                result.next = result_element;
                result = result.next;
                head1 = head1.next;
            }
            else {
                ListNode result_element = new ListNode(head2.val);
                result.next = result_element;
                result = result.next;
                head2 = head2.next;
            }
        }
        
        if(head1 != null) {
            result.next = head1;
        }
        else if(head2 != null) {
            result.next = head2;
        }
        
        return fake.next;
        
    }
}


public class MergeSortedLinkedLists {

    public static void main(String args[]) {

        // Create the Linked Lists
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(6);

        ListNode head2 = new ListNode(3);
        head2.next = new ListNode(5);
        head2.next.next = new ListNode(9);

        ListNode merge_result = new Solution().mergeTwoLists(head1, head2);
        System.out.println("The Merged Sorted LinkedList: ");
        while(merge_result.next != null) {
            System.out.print(merge_result.val + " -> ");
            merge_result = merge_result.next;
        }
        System.out.print(merge_result.val);

    }

}

















