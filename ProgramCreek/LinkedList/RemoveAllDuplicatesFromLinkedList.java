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
        
        ListNode fake = new ListNode(0);
        ListNode temp = fake;
        temp.next = head;
        while(temp.next != null && temp.next.next != null) {
            if(temp.next.val == temp.next.next.val) {
                int duplicate_val = temp.next.val;
                while(temp.next != null && temp.next.val == duplicate_val) {
                    temp.next = temp.next.next;
                }
            }
            else {
                temp = temp.next;
            }
        }
        
        return fake.next;
        
    }
}


public class RemoveAllDuplicatesFromLinkedList {

    public static void main(String args[]) {

        // Create a LinkedList
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(3);

        ListNode no_duplicate_list = new Solution().deleteDuplicates(head);
        System.out.println("The No-Duplicate Sorted LinkedList: ");
        while(no_duplicate_list.next != null) {
            System.out.print(no_duplicate_list.val + " -> ");
            no_duplicate_list = no_duplicate_list.next;
        }
        System.out.print(no_duplicate_list.val);

    }

}

















