import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { 
        val = x; 
    }
}

class Solution {
    public ListNode oddEvenList(ListNode head) {
        
        ListNode fake = new ListNode(0);
        if(head == null) {
            return fake.next;
        }
        
        ListNode odd = head;
        ListNode even = head.next;
        ListNode even_start = head.next;
        
        if(head.next == null) {
            return head;
        }
        
        while(even.next != null && odd.next != null) {
            if(odd.next.next != null) {
                odd.next = odd.next.next;
                odd = odd.next;
            }
            
            if(even.next.next != null) {
                even.next = even.next.next;
                even = even.next;
            }
        }
        
        odd.next = even_start;
        even.next = null;
        return head;
        
    }
}

public class OddEvenLinkedList {

    public static void main(String args[]) {

        // Create a LinkedList
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode odd_even_list = new Solution().oddEvenList(head);
        System.out.println("The Odd Even LinkedList: ");
        while(odd_even_list.next != null) {
            System.out.print(odd_even_list.val + " -> ");
            odd_even_list = odd_even_list.next;
        }
        System.out.print(odd_even_list.val);

    }

}




















