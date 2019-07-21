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
    public ArrayList<ArrayList<Integer>> levelOrderTraversal(TreeNode root) {
        ArrayList<ArrayList<Integer>> result_list = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> level_nodes = new ArrayList<Integer>();
        if(root == null) {
            return result_list;
        }

        LinkedList<TreeNode> current_level = new LinkedList<TreeNode>();
        LinkedList<TreeNode> next_level = new LinkedList<TreeNode>();
        current_level.add(root);

        while(!current_level.isEmpty()) {
            TreeNode node = current_level.remove();

            if(node.left != null) {
                next_level.add(node.left);
            }
            if(node.right != null) {
                next_level.add(node.right);
            }

            level_nodes.add(node.val);
            if(current_level.isEmpty()) {
                current_level = next_level;
                next_level = new LinkedList<TreeNode>();
                result_list.add(level_nodes);
                level_nodes = new ArrayList<Integer>();
            }
        }

        return result_list;
    }
}

public class LevelOrder {

    public static void main(String args[]) {

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        ArrayList<ArrayList<Integer>> level_order_list = new Solution().levelOrderTraversal(root);
        System.out.print("The Level Order Traversal: ");
        for(ArrayList<Integer> level_nodes: level_order_list) {
            for(int i: level_nodes) {
                System.out.print(i + " ");
            }
        }

    }

}






















