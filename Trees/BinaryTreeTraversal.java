










// Simple class definition for a Binary Tree Node

// Since it is a binary tree, the tree node has its data along with 2 pointers for its children
class Node {
    int key;
    Node left, right;

    // Constructor to initialize the class
    public Node(int item) {
        key = item;
        left = right = null;
    }

}

public class BinaryTreeTraversal {

    Node root;

    // The Binary Tree has 2 construtors
    // One parameterised constrcutor and another non-parameterised
    public BinaryTreeTraversal() {
        root = null;
    }

    public BinaryTreeTraversal(int item) {
        root = new Node(item);
    }


    public static void printPostOrder(Node node) {

        if(node == null) {
            return;
        }

        // In Post Order, The order of traversal is Left Child, Right Child and Root Node
        printPostOrder(node.left);
        printPostOrder(node.right);        
        System.out.print(node.key + " ");

    }
    
    public static void printInOrder(Node node) {

        if(node == null) {
            return;
        }

        // In Post Order, The order of traversal is Left Child, Root Node and Right Child
        printInOrder(node.left);
        System.out.print(node.key + " ");
        printInOrder(node.right);

    }

    public static void printPreOrder(Node node) {

        if(node == null) {
            return;
        }

        // In Post Order, The order of traversal is Root Node, Left Child and Right Child
        System.out.print(node.key + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);

    }


    // Just creating a mock tree
    public static void main(String args[]) {

        BinaryTree bTree = new BinaryTree(1);

        // Level 1 children of root
        bTree.root.left = new Node(2);
        bTree.root.right = new Node(3);

        // Level 2 children of root
        bTree.root.left.left = new Node(4);
        bTree.root.left.right = new Node(5);

        // Traverse the Binary in the three orders
        System.out.print("\nPreOrder: ");
        printPreOrder(bTree.root);

        System.out.print("\nInOrder: ");
        printInOrder(bTree.root);

        System.out.print("\nPostOrder: ");
        printPostOrder(bTree.root);

    }


}



