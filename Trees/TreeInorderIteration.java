import java.lang.*;
import java.util.*;

class Node {
    int key;
    Node left, right;

    // Constructor to initialize the class
    public Node(int item) {
        key = item;
        left = right = null;
    }
}


public class TreeInorderIteration {

    Node root;

    public void inorderIteration() {

        // Check for NULL tree
        if( root == null ) {
            return;
        }

        Stack<Node> stack = new Stack<Node>();
        Node current= root;

        while(current != null || stack.size() > 0) {

            // This will traverse into the most left node in the tree
            // And push only the node leading up to that left most node
            while(current != null) {
                stack.push(current);
                current = current.left;
            }

            // Pop the current node in the stack
            current = stack.pop();
            System.out.println(current.key + " ");

            // then traverse the right nodes and check for their null property in the next recurse
            current = current.right;

        }

    }

    public static void main(String args[]) {

        // Create a binary tree
        TreeInorderIteration tree = new TreeInorderIteration(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 

        // Do the inorder traversal using iteration
        tree.inorderIteration(); 

    }

}
















