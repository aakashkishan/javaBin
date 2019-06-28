import java.util.*;

// Definition for a Node.
class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val) {
        val = _val;
        next = null;
        random = null;
    }
}


class Solution {
    public Node copyRandomList(Node head) {
        
        if(head == null) {
            return null;
        }
        
        Node result = new Node(0);
        
        Node first = head;
        Node second = head;
        Node copy_first = new Node(first.val);
        Node copy_prev = copy_first;
        
        while(second.next != null) {
            // Set the Copy structure
            Node copy_next = new Node(second.next.val);
            copy_prev.next = copy_next;
            first = second;
            second = second.next;
            
            // Set Original Prev Next to Copy Prev
            // Also Set Copy Prev Random to Original Prev Random
            first.next = copy_prev;
            copy_prev.random = first;
                
            // Update the Copy Prev
            copy_prev = copy_next;
        }
        second.next = copy_prev;
        copy_prev.random = second;
        
        first = head;
        Node copy_curr = copy_first;
        while(first.next != null && copy_curr.next != null) {
            copy_curr.random = copy_curr.random.random.next;
            copy_curr = copy_curr.next;
            first = first.next;
        }
        
        result.next = copy_first;
        return result.next;
        
    }
}


public class DeepCopyRandomLinkedList {

    public static void main(String args[]) {

        // Create the LinkedList
        Node head = new Node(1);
        Node second_element = new Node(2);
        Node third_element = new Node(3);
        Node fourth_element = new Node(4);

        head.next = second_element;
        head.random = third_element;

        second_element.next = third_element;
        second_element.random = head;

        third_element.next = fourth_element;
        third_element.random = second_element;

        fourth_element.next = null;
        fourth_element.random = fourth_element;

        Node deep_copy_result = new Solution().copyRandomList(head);
        Node dummy = deep_copy_result;
        System.out.println("The Deep Copy of the Random LinkedList: ");
        while(deep_copy_result.next != null) {
            System.out.print(deep_copy_result.val + " -> ");
            deep_copy_result = deep_copy_result.next;
        }
        System.out.print(deep_copy_result.val);

        System.out.println();
        System.out.println("The Random Order: ");
        while(dummy != null) {
            System.out.println(dummy.val + " -> " + dummy.random.val);
            dummy = dummy.next;
        }

    }

}






















