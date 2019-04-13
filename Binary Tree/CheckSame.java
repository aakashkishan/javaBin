import java.util.*;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int x) {
        this.data = x;
    }
}

public class CheckSame {

    public static boolean checkSame(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) {
            return true;
        }
        if(root1 != null && root2 != null) {
            if(root1.data == root2.data && checkSame(root1.left, root2.left) && checkSame(root1.right, root2.right)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {

        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(2);
        root1.left.left = new TreeNode(3);
        root1.left.right = new TreeNode(4);
        root1.right.left = new TreeNode(4);
        root1.right.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(2);
        root2.left.left = new TreeNode(3);
        root2.left.right = new TreeNode(4);
        root2.right.left = new TreeNode(4);
        root2.right.right = new TreeNode(3);

        boolean isSame = checkSame(root1, root2);
        if(isSame == true) {
            System.out.println("The Trees are Same!");
        } else {
            System.out.println("The Trees are not Same :(");
        }

    }

}





















