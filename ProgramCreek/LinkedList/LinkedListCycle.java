import java.util.*;


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { 
        val = x; 
    }
}


class Solution {
    public boolean hasCycle(ListNode head) {
        
        if(head == null) {
            return false;
        }
    
        ListNode slow = head;
        ListNode fast = head.next;
        
        while(fast != null && slow != null) {
            if(fast == slow) {
                return true;
            }
            if(fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
        }
        return false;
    
    }
}

public class LinkedListCycle {

    public static void main(String args[]) {

        // Create a Cyclar Linked List
        ListNode head = new ListNode(3);
        head.next = new ListNode(6);
        head.next.next = new ListNode(7);
        ListNode temp = new ListNode(2);
        head.next.next.next = temp;
        head.next.next.next.next = new ListNode(-4);
        head.next.next.next.next.next = new ListNode(-6);
        head.next.next.next.next.next.next = temp;

        boolean isCyclic = new Solution().hasCycle(head);
        if(isCyclic == true) {
            System.out.println("The Linked List is Cyclic!");
        }
        else {
            System.out.println("The Linked List is Acyclic :(");
        }

    }

}





























