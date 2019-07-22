import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {

    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode p = root;
        int kth_min = 0;

        while(!stack.isEmpty() || p != null) {
            if(p != null) {
                stack.push(p);
                p = p.left;
            }
            else {
                TreeNode temp = stack.pop();
                k -= 1;
                if(k == 0) {
                    kth_min = temp.val;
                }
                p = temp.right;
            }
        }

        return kth_min;
    }

}

public class KthSmallestElementInBST {

    public static void main(String args[]) {

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(9);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(8);
        int k = 5;
        int kth_min = new Solution().kthSmallest(root, k);
        System.out.println("The Kth Smallest Element in the Binary Search Tree: " + kth_min);

    }

}
















