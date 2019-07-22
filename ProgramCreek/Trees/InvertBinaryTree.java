import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {

    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return root;
        }
     
        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;

        invertTree(root.left);
        invertTree(root.right);
     
        return root;
    }

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

public class InvertBinaryTree {

    public static void main(String args[]) {

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        TreeNode invert_tree_root = new Solution().invertTree(root);
        ArrayList<ArrayList<Integer>> invert_tree_list = new Solution().levelOrderTraversal(invert_tree_root);
        for(ArrayList<Integer> level_nodes: invert_tree_list) {
            for(int i: level_nodes) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

}

























