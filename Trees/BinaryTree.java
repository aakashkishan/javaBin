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

public class BinaryTree {

    Node root;

    // The Binary Tree has 2 construtors
    // One parameterised constrcutor and another non-parameterised
    public BinaryTree() {
        root = null;
    }

    public BinaryTree(int item) {
        root = new Node(item);
    }

    public static Node getLeft(Node node) {
        return node.left;
    }

    public static int getLeftValue(Node node) {
        return node.left.key;
    }

    public static Node getRight(Node node) {
        return node.right;
    }

    public static int getRightValue(Node node) {
        return node.right.key;
    }

    public static Node getCurr(Node node) {
        return node;
    }

    public static int getCurrValue(Node node) {
        return node.key;
    }

    // Just creating a mock tree
    public static void main(String args[]) {

        BinaryTree bTree = new BinaryTree(1);

        // Level 1 children of root
        bTree.root.left = new Node(2);
        bTree.root.right = new Node(3);

        // Level 2 children of root
        bTree.root.left.left = new Node(4);

        System.out.println(getCurrValue(bTree.root));
        System.out.println(getLeftValue(bTree.root));
        System.out.println(getRightValue(bTree.root));
        System.out.println(getLeftValue(getLeft(bTree.root)));

    }


}