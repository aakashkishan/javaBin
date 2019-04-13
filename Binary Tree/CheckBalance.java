import java.util.*;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int x) {
        this.data = x;
    }
}

public class CheckBalance {

    public static Integer maxDepthDifference(TreeNode root) {
        int depth_difference = 0;
        if(root == null) {
            return depth_difference;
        }
        Integer left_depth = maxDepthDifference(root.left);
        Integer right_depth = maxDepthDifference(root.right);
        // If the different between subtrees is > 1, 
        // then the root of that subtree is also not balanced 
        if(left_depth == null || right_depth == null) {
            return null;
        }
        // If difference between subtrees is > 1
        if(Math.abs(left_depth - right_depth) > 1) {
            return null;
        }
        // Return the maximum difference between the subtrees 
        return Math.max(left_depth, right_depth) + 1;
    }

    public static boolean balanceCheck(TreeNode root) {
        return maxDepthDifference(root) != null;
    }

    public static void main(String args[]) {

        TreeNode tn = new TreeNode(3);
        tn.left = new TreeNode(9);
        tn.right = new TreeNode(20);
        tn.right.left = new TreeNode(15);
        tn.right.right = new TreeNode(7);
        tn.right.right.left = new TreeNode(13);

        boolean isBalanced = balanceCheck(tn);
        if(isBalanced == true) {
            System.out.println("The Tree is Balanced!");
        } else {
            System.out.println("The Tree not is Balanced :(");
        }

    }

}










































