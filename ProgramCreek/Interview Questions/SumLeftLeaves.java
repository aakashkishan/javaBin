import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { 
        val = x; 
    }
}

public class SumLeftLeaves {

    public static int getLeftLeafSum(TreeNode root) {

        int sum = 0;
        if(root == null) {
            return sum;
        }

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if(node.left != null) {
                stack.push(node.left);
                if(node.left.left == null && node.left.right == null) {
                    sum += node.left.val;
                }
            }
            if(node.right != null) {
                stack.push(node.right);
            }
        }
        return sum;

    }

    public static void main(String args[]) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.right = new TreeNode(27);
        root.right.left = new TreeNode(15);
        int left_sum = getLeftLeafSum(root);
        System.out.println("The Sum of the Left Leaves: " + left_sum);

    }

}












