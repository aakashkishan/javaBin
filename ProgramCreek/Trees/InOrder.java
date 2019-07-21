import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}


class Solution {
    public ArrayList<Integer> inOrderTraversal(TreeNode root) {
        ArrayList<Integer> result_list = new ArrayList<Integer>();
        if(root == null) {
            return result_list;
        }

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;
        while(node != null) {
            stack.push(node);
            node = node.left;
        }

        while(!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            result_list.add(temp.val);

            temp = temp.right;
            while(temp != null) {
                stack.push(temp);
                temp = temp.left;
            }
        }

        return result_list;
    }
}


public class InOrder {

    public static void main(String args[]) {

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        ArrayList<Integer> in_order_list = new Solution().inOrderTraversal(root);
        System.out.print("The InOrder Traversal: ");
        for(int i: in_order_list) {
            System.out.print(i + " ");
        }

    }

}













