import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { 
        val = x; 
    }
}

class Solution {
    public ArrayList<Integer> postOrderTraversal(TreeNode root) {
        ArrayList<Integer> result_list = new ArrayList<Integer>();
        if(root == null) {
            return result_list;
        }

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);

        while(!stack.isEmpty()) {
            TreeNode temp = stack.peek();
            if(temp.left == null && temp.right == null) {
                TreeNode pop = stack.pop();
                result_list.add(pop.val);
            }
            else {
                if(temp.right != null) {
                    stack.push(temp.right);
                    temp.right = null;
                }
                if(temp.left != null) {
                    stack.push(temp.left);
                    temp.left = null;
                }
            }
        }

        return result_list;
    }
}

public class PostOrder {

    public static void main(String args[]) {

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        ArrayList<Integer> post_order_list = new Solution().postOrderTraversal(root);
        System.out.print("The Post Order Traversal: ");
        for(int i: post_order_list) {
            System.out.print(i + " ");
        }

    }

}






















