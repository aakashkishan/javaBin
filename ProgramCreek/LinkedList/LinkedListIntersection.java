import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { 
        val = x; 
    }
}

class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        HashSet<ListNode> hs = new HashSet<>();
        // ListNode result = null;
        
        while(headA != null) {
            hs.add(headA);
            headA = headA.next;
        }
        
        while(headB != null) {
            if(hs.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
        
    }
}

public class LinkedListIntersection {

    public static void main(String args[]) {

        ListNode headA = new ListNode(0);
        headA.next = new ListNode(9);
        headA.next.next = new ListNode(1);
        ListNode intersection = new ListNode(2);
        headA.next.next.next = intersection;
        headA.next.next.next.next = new ListNode(4);
        headA.next.next.next.next.next = new ListNode(6);

        ListNode headB = new ListNode(3);
        headB.next = intersection;
        ListNode intersection_node = new Solution().getIntersectionNode(headA, headB);
        System.out.println("The Intersection Node of the Two Linked Lists: " + intersection_node.val);

    }

}














