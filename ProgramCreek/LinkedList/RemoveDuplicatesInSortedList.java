import java.util.*;


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { 
        val = x; 
    }
}


class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head == null || head.next == null) {
            return head;
        }
        
        ListNode curr = head.next;
        ListNode prev = head;
        while(curr != null) {
            if(curr.val == prev.val) {
                prev.next = curr.next;
                curr = curr.next;
            }
            else {
                prev = prev.next;
                curr = curr.next;
            }
        }
        
        return head;
        
    }
}


public class RemoveDuplicatesInSortedList {

    public static void main(String args[]) {

        // Create a LinkedList
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(4);

        ListNode no_duplicate_list = new Solution().deleteDuplicates(head);
        System.out.println("The No-Duplicate Sorted LinkedList: ");
        while(no_duplicate_list.next != null) {
            System.out.print(no_duplicate_list.val + " -> ");
            no_duplicate_list = no_duplicate_list.next;
        }
        System.out.print(no_duplicate_list.val);

    }

}






































