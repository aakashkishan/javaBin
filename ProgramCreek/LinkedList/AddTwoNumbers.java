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
        
        ListNode fake = new ListNode(0);
        ListNode result = fake;
        
        int carry = 0;
        while(l1 != null || l2 != null) {
            int sum = carry;
            // Get the Current Value of the ListNode l1 and add it to sum
            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            // Get the Current Value of the ListNode l2 and add it to sum
            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            
            // Handle carry in the sum
            if(sum > 9) {
                carry = 1;
                sum = sum - 10;
            }
            else {
                carry = 0;
            }
            
            ListNode result_element = new ListNode(sum);
            result.next = result_element;
            result = result.next;
        }
        
        // If carry at the end of the sum of both LinkedLists
        if(carry > 0) {
            int sum = carry;
            ListNode result_element = new ListNode(sum);
            result.next = result_element;
        }
        
        return fake.next;
        
    }
}

public class AddTwoNumbers {

    public static void main(String args[]) {

        // Create LinkedList 1
        ListNode l1 = new ListNode(6);
        l1.next = new ListNode(5);
        l1.next.next = new ListNode(9);

        // Create LinkedList 2
        ListNode l2 = new ListNode(4);
        l2.next = new ListNode(7);
        l2.next.next = new ListNode(2);

        ListNode result = new Solution().addTwoNumbers(l1, l2);
        System.out.println("The Additions of 2 LinkedLists: ");
        while(result.next != null) {
            System.out.print(result.val+ " -> ");
            result = result.next;
        }
        System.out.print(result.val);

    }

}








