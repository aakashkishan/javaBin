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
    public ArrayList<Integer> preOrderTraversal(TreeNode root) {
        ArrayList<Integer> result_list = new ArrayList<Integer>();
        if(root == null) {
            return result_list;
        }

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            result_list.add(node.val);

            if(node.right != null) {
                stack.push(node.right);
            }
            if(node.left != null) {
                stack.push(node.left);
            }
        }
        return result_list;
    }
}

public class PreOrder {

    public static void main(String args[]) {

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        ArrayList<Integer> pre_order_list = new Solution().preOrderTraversal(root);
        System.out.print("The PreOrder Traversal: ");
        for(int i: pre_order_list) {
            System.out.print(i + " ");
        }

    }

}






















