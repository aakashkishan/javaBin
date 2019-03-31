import java.util.*;

import com.sun.security.jgss.InquireSecContextPermission;


public class UnionIntersectionOfLinkedLists {

    public static LinkedList<Integer> intersectionLinkedList(LinkedList<Integer> ll1, LinkedList<Integer> ll2) {

        HashSet<Integer> hs = new HashSet<Integer>();
        LinkedList<Integer> result_ll = new LinkedList<Integer>();

        for(int i : ll1) {
            hs.add(i);
        }

        for(int j : ll2) {
            if(hs.contains(j)) {
                result_ll.add(j);
            }
        }

        return result_ll;

    }

    public static LinkedList<Integer> unionLinkedList(LinkedList<Integer> ll1, LinkedList<Integer> ll2) {

        LinkedList<Integer> result_ll = new LinkedList<Integer>();
        HashSet<Integer> hs = new HashSet<Integer>();

        for(int i : ll1) {
            hs.add(i);
            result_ll.add(i);
        }

        for(int j : ll2) {
            if(hs.contains(j)) {
                continue;
            }
            result_ll.add(j);
        }

        return result_ll;

    }

    public static void main(String args[]) {

        LinkedList<Integer> ll1 = new LinkedList<Integer>();
        LinkedList<Integer> ll2 = new LinkedList<Integer>();

        // Linked List Initialization
        ll1.add(10);
        ll1.add(15);
        ll1.add(4);
        ll1.add(20);

        ll2.add(8);
        ll2.add(4);
        ll2.add(2);
        ll2.add(10);


        LinkedList<Integer> union_ll = unionLinkedList(ll1, ll2);
        LinkedList<Integer> intersection_ll = intersectionLinkedList(ll1, ll2);

        System.out.println("The Union Linked List:");
        System.out.print("head");
        for(int i : union_ll) {
            System.out.print(" -> " + i);
        }
        System.out.println();


        System.out.println("The Intersection Linked List:");
        System.out.print("head");
        for(int j : intersection_ll) {
            System.out.print(" -> " + j);
        }
        System.out.println();

    }

}













