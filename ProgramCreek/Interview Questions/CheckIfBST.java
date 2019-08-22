import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class CheckIfBST {

    public static boolean checkBST(TreeNode root, Integer min, Integer max) {

        if(root == null) {
            return true;
        }

        if((max != null && root.val > max) || (min != null && root.val < min)) {
            return false;
        }

        if(!checkBST(root.left, min, root.val) || !checkBST(root.right, root.val, max)) {
            return false;
        }

        return true;

    }

    public static void main(String args[]) {

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);

        boolean isBST = checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if(isBST == true) {
            System.out.println("It is a Binary Search Tree!");
        }
        else {
            System.out.println("It is not a Binary Search Tree :(");
        }

    }

}




