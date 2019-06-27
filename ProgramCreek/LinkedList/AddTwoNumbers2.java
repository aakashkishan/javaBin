import java.util.*;


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { 
        val = x; 
    }
}


class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        Stack<ListNode> s1 = new Stack<>();
        Stack<ListNode> s2 = new Stack<>();
        
        while(l1 != null || l2 != null) {
            // Push the entire LinkedList l1 into Stack s1
            if(l1 != null) {
                s1.push(l1);
                l1 = l1.next;
            }
            
            // Push the entire LinkedList l2 into Stack s2
            if(l2 != null) {
                s2.push(l2);
                l2 = l2.next;
            }
        }
        
        ListNode result = new ListNode(0);
        ListNode dummy = null;
        int carry = 0;
        while(!s1.isEmpty() || !s2.isEmpty()) {
            int sum = carry;
            // Add the Sum of the Numbers by popping them from both stacks
            if(!s1.isEmpty()) {
                sum += s1.pop().val;
            }
            if(!s2.isEmpty()) {
                sum += s2.pop().val;
            }
            
            if(sum > 9) {
                carry = 1;
                sum = sum - 10;
            }
            else {
                carry = 0;
            }
            
            ListNode result_element = new ListNode(sum);
            result_element.next = dummy;
            dummy = result_element;
        }
        
        if(carry > 0) {
            ListNode result_element = new ListNode(carry);
            result_element.next = dummy;
            dummy = result_element;
        }
        
        result.next = dummy;
        return result.next;
        
    }
}


public class AddTwoNumbers2 {

    public static void main(String args[]) {

        // Create LinkedList 1
        ListNode l1 = new ListNode(7);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(3);

        // Create LinkedList l2
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = new Solution().addTwoNumbers(l1, l2);
        System.out.println("The Addition of 2 LinkedLists: ");
        while(result.next != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
        System.out.print(result.val);

    }

}




















