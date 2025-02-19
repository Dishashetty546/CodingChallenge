package Dreamer.DSA.BinaryTree;

public class maximumdepth {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.right = new TreeNode(7);
        root.right.left = new TreeNode(20);
        System.out.println(max(root));

    }

    public static int max(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int l = max(root.left);
            int r = max(root.right);
            return 1 + Math.max(l, r);
        }

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
