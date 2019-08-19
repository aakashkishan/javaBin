import java.util.*;

class Node{
    int key;
    int value;
    Node prev;
    Node next;
 
    public Node(int key, int value){
        this.key=key;
        this.value=value;
    }
}

public class LRUCache {

    Node head;
    Node tail;
    HashMap<Integer, Node> map = null;
    int cap = 0;

    public LRUCache(int capacity) {
        this.cap = capacity;
        this.map = new HashMap<>();
    }

    public int get(int key) {
        if(map.get(key) == null) {
            return -1;
        }
        Node temp = map.get(key);
        removeNode(temp);
        offerNode(temp);

        return t.value;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)) {
            Node t = map.get(key);
            t.value = value;
            removeNode(t);
            offerNode(t);
        }
        else {
            if(map.size() >= cap) {
                // Remove head in case of a cap exceed
                map.remove(head.key);
                removeNode(head);
            }
            // Add the new Node to the tail
            Node node = new Node(key, value);
            offerNode(node);
            map.put(key, node);
        }
    }

    public void removeNode(Node t) {
        // Handle the Prev Forward Pointers of the LinkedList
        if(t.prev != null) {
            t.prev.next = t.next;
        }
        else {
            head = t.next;
        }

        // Handle the Next Backward Pointers of the LinkedList
        if(t.next != null) {
            t.next.prev = t.prev;
        }
        else {
            tail = t.prev;
        }
    }

    public void offerNode(Node t) {
        if(tail != null) {
            tail.next = t;
        }

        tail = t.prev;
        t.next = null;
        tail = t;

        if(head == null) {
            head = tail;
        }
    }

}




















