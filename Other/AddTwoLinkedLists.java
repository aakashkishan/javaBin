import java.util.*;

class ListNode {
    int data;
    ListNode next;
    public ListNode(int x) {
        this.data = x;
    }
}

public class AddTwoLinkedLists {

    public static ListNode getSum(ListNode head1, ListNode head2) {

        ListNode dummy_head = new ListNode(0);
        ListNode sum_list = dummy_head;

        String num1= new String();
        String num2 = new String();
        int sum = 0;
        ArrayList<Integer> sum_al = new ArrayList<Integer>();

        while(head1 != null) {
            num1 = num1 + Integer.toString(head1.data);
            head1 = head1.next;
        }

        while(head2 != null) {
            num2 = num2 + Integer.toString(head2.data);
            head2 = head2.next;
        }

        sum = Integer.parseInt(num1) + Integer.parseInt(num2);
        while(sum != 0) {
            int remainder = sum % 10;
            sum_al.add(remainder);
            sum = sum / 10;
        }

        for(int i = 0; i < sum_al.size(); i++) {
            sum_list.next = new ListNode(sum_al.get(i));
            sum_list = sum_list.next;
        }

        return dummy_head.next;

    }

    public static void main(String args[]) {
        ListNode head1 = new ListNode(2);
        ListNode head2 = new ListNode(5);

        head1.next = new ListNode(4);
        head1.next.next = new ListNode(3);

        head2.next = new ListNode(6);
        head2.next.next = new ListNode(4);

        ListNode sum_list = getSum(head1, head2);
        System.out.print("head");
        while(sum_list != null) {
            System.out.print(" -> " + sum_list.data);
            sum_list = sum_list.next;
        }
    }

}



































