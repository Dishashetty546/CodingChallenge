package Dreamer.DSA.BinaryTree;

public class SymmetricTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        System.out.println(symmetry(root));

    }

    public static boolean symmetry(TreeNode root) {
        if (root == null) {
            return true;

        }
        return ismirror(root, root);
    }

    public static boolean ismirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }
        if (t1 == null || t2 == null) {
            return false;
        }
        return (t1.val == t2.val) && ismirror(t1.left, t2.right) && ismirror(t1.right, t2.left);

    }

    public static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int x) {
            val = x;
        }
    }
}
