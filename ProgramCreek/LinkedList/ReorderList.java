import java.util.*;


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { 
        val = x; 
    }
}


class Solution {
    public ListNode reorderList(ListNode head) {
        
        Stack<ListNode> stack = new Stack<>();
        Queue<ListNode> queue = new LinkedList<ListNode>();
        int length = 0;
        
        ListNode fake = new ListNode(0);
        ListNode result = fake;
        
        while(head != null) {
            length += 1;
            stack.push(head);
            queue.add(head);
            head = head.next;
        }

        System.out.println(length);
        
        int result_length = 0;
        while(result_length < length) {
            // Add the elements from the front to the Result LinkedList
            ListNode result_element = new ListNode(queue.poll().val);
            result.next = result_element;
            result = result.next;
            // Increment the Result LinkedList length
            result_length += 1;

            if(result_length < length) {
                // Add the elements from the back to the Result LinkedList
                result_element = new ListNode(stack.pop().val);
                result.next = result_element;
                result = result.next;
                // Increment the Result LinkedList length
                result_length += 1;
            }
            else {
                break;
            }
        }
        return fake.next;
        
    }
}


public class ReorderList {

    public static void main(String args[]) {

        // Create a LinkedList
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        // head.next.next.next.next.next = new ListNode(6);

        ListNode result = new Solution().reorderList(head);
        System.out.println("The Reordering of the List: ");
        while(result.next != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
        System.out.print(result.val);

    }

}

















