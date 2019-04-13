import java.util.*;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int x) {
        this.data = x;
    }
}

public class CheckSymmetric {

    public static boolean isMirror(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null) {
            return true;
        }

        if(root1 == null || root2 == null) {
            return false;
        }

        if(root1.data != root2.data) {
            return false;
        }

        boolean mirrorCheck = root1.data == root2.data && isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left);
        return mirrorCheck;
    }

    public static boolean checkSymmetry(TreeNode root) {
        if(root == null) {
            return true;
        }

        return isMirror(root.left, root.right);
    }

    public static void main(String args[]) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        boolean isSymmetric = checkSymmetry(root);
        if(isSymmetric == true) {
            System.out.println("The Trees are Symmetric!");
        } else {
            System.out.println("The Trees are not Symmetric :(");
        }

    }

}




























