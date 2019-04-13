import java.util.*;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        this.data = x;
    }
}

public class BinaryTreeLevelOrder {

    public static List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if(root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(queue.isEmpty() == false) {
            int level_size = queue.size();
            List<Integer> level = new ArrayList<>();

            // Loop through that level nodes
            for(int i = 0 ; i < level_size; i++) {
                TreeNode curr_node = queue.poll();
                level.add(curr_node.data);

                if(curr_node.left != null) {
                    queue.offer(curr_node.left);
                }

                if(curr_node.right != null) {
                    queue.offer(curr_node.right);
                }
            }
            result.add(level);
        }

        return result;

    }

    public static void main(String args[]) {
        TreeNode tn = new TreeNode(3);
        tn.left = new TreeNode(9);
        tn.right = new TreeNode(20);
        tn.right.left = new TreeNode(15);
        tn.right.right = new TreeNode(7);

        List<List<Integer>> result_list = new ArrayList<>();
        result_list = levelOrder(tn);
        System.out.println(result_list);
    }

}
































