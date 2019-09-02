import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
    }

    ListNode(int x) { 
        val = x; 
    }
}

public class RemoveSameElement {

    public static void printListOne(ListNode head1) {

        while(head1.next != null) {
            System.out.print(head1.val + " -> ");
            head1 = head1.next;
        }
        System.out.print(head1.val);

        return;

    }

    public static void printListTwo(ListNode head2) {

        while(head2.next != null) {
            System.out.print(head2.val + " -> ");
            head2 = head2.next;
        }
        System.out.print(head2.val);

        return;

    }

    public static void removeCommonElements(ListNode head1, ListNode head2) {

        if(head1 == null && head2 == null) {
            return;
        }

        HashSet<Integer> temp_set = new HashSet<Integer>();
        HashSet<Integer> common_set = new HashSet<Integer>();
        ListNode fakehead1 = head1;
        ListNode fakehead2 = head2;
        while(fakehead1 != null) {
            temp_set.add(fakehead1.val);
            fakehead1 = fakehead1.next;
        }
        while(fakehead2 != null) {
            if(temp_set.contains(fakehead2.val)) {
                common_set.add(fakehead2.val);
            }
            fakehead2 = fakehead2.next;
        }

        fakehead1 = new ListNode(0);
        fakehead1.next = head1;
        ListNode curr1 = head1;
        ListNode dummyhead1 = fakehead1;

        fakehead2 = new ListNode(0);
        fakehead2.next = head2;
        ListNode curr2 = head2;
        ListNode dummyhead2 = fakehead2;

        while(curr1 != null) {
            if(common_set.contains(curr1.val)) {
                fakehead1.next = curr1.next;
                curr1 = curr1.next;
            }
            else {
                curr1 = curr1.next;
                fakehead1 = fakehead1.next;
            }
        }

        while(curr2 != null) {
            if(common_set.contains(curr2.val)) {
                fakehead2.next = curr2.next;
                curr2 = curr2.next;
            }
            else {
                curr2 = curr2.next;
                fakehead2 = fakehead2.next;
            }
        }

        dummyhead1 = dummyhead1.next;
        dummyhead2 = dummyhead2.next;
        System.out.println("Lists with Common Elements removed: ");
        printListOne(dummyhead1);
        System.out.println();
        printListTwo(dummyhead2);
        return;

    }

    public static void main(String args[]) {

        ListNode head1 = new ListNode(3);
        head1.next = new ListNode(4);
        head1.next.next = new ListNode(6);
        head1.next.next.next = new ListNode(2);

        ListNode head2 = new ListNode(2);
        head2.next = new ListNode(5);
        head2.next.next = new ListNode(6);
        head2.next.next.next = new ListNode(1);
        
        removeCommonElements(head1, head2);

    }

}














