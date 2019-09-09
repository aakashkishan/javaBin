import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { 
        val = x; 
    }
}

public class ZigZagTraversal {

    public static List<Integer> getZigZag(TreeNode root) {

        List<Integer> list = new ArrayList<Integer>();
        LinkedList<TreeNode> nodes = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        if(root == null) {
            return list;
        }

        nodes.add(root);
        nodes.add(null);
        while(!nodes.isEmpty()) {
            TreeNode curr_node = nodes.poll();
            if(curr_node == null) {
                if(!nodes.isEmpty()) {
                    nodes.add(null);
                }
                while(!stack.isEmpty()) {
                    list.add(stack.pop());
                }
            }
            else {
                stack.push(curr_node.val);
                if(curr_node.left != null) {
                    nodes.offer(curr_node.left);
                }
                if(curr_node.right != null) {
                    nodes.offer(curr_node.right);
                }
            }
        }
        return list;

    }

    public static void main(String args[]) {

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(6);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        List<Integer> result_list = getZigZag(root);
        ListIterator itr = result_list.listIterator();
        System.out.println("The Zig Zag Tree Traversal: ");
        while(itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

    }

}









