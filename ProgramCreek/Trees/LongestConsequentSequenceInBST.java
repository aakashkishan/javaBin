import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {

    public int longestConsecutive(TreeNode root) {

        if(root == null) {
            return 0;
        }

        LinkedList<TreeNode> node_queue = new LinkedList<TreeNode>();
        LinkedList<Integer> size_queue = new LinkedList<Integer>();
        node_queue.offer(root);
        size_queue.offer(1);
        int max = 1;

        while(!node_queue.isEmpty()) {
            TreeNode head = node_queue.poll();
            int size = size_queue.poll();

            if(head.left != null) {
                int left_size = size;
                if(head.val == head.left.val + 1) {
                    left_size += 1;
                    max = Math.max(max, left_size);
                }
                else {
                    left_size = 1;
                }

                node_queue.offer(head.left);
                size_queue.offer(left_size);
            }
            if(head.right != null) {    
                int right_size = size;
                if(head.val == head.right.val - 1) {
                    right_size += 1;
                    max = Math.max(max, right_size);
                }
                else {
                    right_size = 1;
                }

                node_queue.offer(head.right);
                size_queue.offer(right_size);
            }
        }
        return max;

    }

}

public class LongestConsequentSequenceInBST {

    public static void main(String args[]) {

        TreeNode root = new TreeNode(9);
        root.left = new TreeNode(2);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(11);
        root.right.right.right = new TreeNode(12);
        int longest_consecutive_path = new Solution().longestConsecutive(root);
        System.out.println("The Longest Consecutive Sequence in a BST: " + longest_consecutive_path);

    }

}



















