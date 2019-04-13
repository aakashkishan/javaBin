import java.util.*;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int x) {
        this.data = x;
    }
}

public class MaximumDepth {

    public static int findMaxDepth(TreeNode root) {
        int max_depth = 0;
        if(root == null) {
            return max_depth;
        }
        int left_depth = findMaxDepth(root.left);
        int right_depth = findMaxDepth(root.right);

        // return the max of two depths
        return Math.max(left_depth, right_depth) + 1;
    }

    public static void main(String args[]) {

        TreeNode tn = new TreeNode(3);
        tn.left = new TreeNode(9);
        tn.right = new TreeNode(20);
        tn.right.left = new TreeNode(15);
        tn.right.right = new TreeNode(7);

        int maximum_depth = findMaxDepth(tn);
        System.out.println("The Maximum Depth: " + maximum_depth);

    }

}


























