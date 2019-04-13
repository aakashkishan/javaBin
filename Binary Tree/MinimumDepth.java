import java.util.*;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int x) {
        this.data = x;
    }
}


public class MinimumDepth {

    public static int findMinDepth(TreeNode root) {
        if(root.left == null && root.right == null) {
            return 1;
        }
        return Math.min(findMinDepth(root.left), findMinDepth(root.right)) + 1;
    }

    public static int findDepth(TreeNode root) {
        int min_depth = 0;
        if(root == null) {
            return min_depth;
        }

        min_depth = findMinDepth(root);
        return min_depth;
    }

    public static void main(String args[]) {

        TreeNode tn = new TreeNode(3);
        tn.left = new TreeNode(9);
        tn.right = new TreeNode(20);
        tn.right.left = new TreeNode(15);
        tn.right.right = new TreeNode(7);

        int minimum_depth = findDepth(tn);
        System.out.println("The Minimum Depth: " + minimum_depth);

    }

}


























