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

    public ListNode altGetIntersectionNode(ListNode headA, ListNode headB) {

        if(headA == null || headB == null) {
            return null;
        }

        int len1 = 0;
        int len2 = 0;
        ListNode ptr1 = headA;
        ListNode ptr2 = headB;
    
        while(ptr1 != null) {
            len1 += 1;
            ptr1 = ptr1.next;
        }

        while(ptr2 != null) {
            len2 += 1;
            ptr2 = ptr2.next;
        }

        if(len1 > len2) {
            int difference = len1 - len2;
            int i = 0;
            while(i < difference) {
                headA = headA.next;
                i += 1;
            }
        }
        else {
            int difference = len2 - len1;
            int i = 0;
            while(i < difference) {
                headB = headB.next;
                i += 1;
            }
        }

        while(headA != null && headB != null) {
            if(headA.val == headB.val) {
                return headA;
            }
            headA = headA.next;
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
        ListNode intersection_node = new Solution().altGetIntersectionNode(headA, headB);
        System.out.println("The Intersection Node of the Two Linked Lists: " + intersection_node.val);

    }

}














