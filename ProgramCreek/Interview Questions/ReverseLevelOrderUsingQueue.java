import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class ReverseLevelOrderUsingQueue {

    public static void levelOrder(TreeNode root) {

        if(root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        Stack<TreeNode> temp_stack = new Stack<TreeNode>();
        Stack<TreeNode> final_stack = new Stack<TreeNode>();
        queue.add(root);
        // Null signifies and change in level
        queue.add(null);
        while(!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            if(curr == null) {
                if(!queue.isEmpty()) {
                    queue.add(null);
                }
                while(!temp_stack.isEmpty()) {
                    final_stack.push(temp_stack.pop());
                }
                final_stack.push(null);
            }
            else {
                if(curr.left != null) {
                    queue.add(curr.left);
                }
                if(curr.right != null) {
                    queue.add(curr.right);
                }
                temp_stack.push(curr);
            }
        }

        while(!final_stack.isEmpty()) {
            TreeNode curr = final_stack.pop();
            if(curr == null) {
                System.out.println();
            }
            else {
                System.out.print(curr.val + " ");
            }
        }
        return;

    }

    public static void main(String args[]) {

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);

        System.out.println("The Level Order traversal of Tree using Queue: ");
        levelOrder(root);

    }

}










