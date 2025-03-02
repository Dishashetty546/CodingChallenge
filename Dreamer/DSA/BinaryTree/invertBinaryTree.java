package Dreamer.DSA.BinaryTree;

public class invertBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root = invert(root);

        printTree(root);
    }

    public static TreeNode invert(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invert(root.left);
        TreeNode right = invert(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    public static void printTree(TreeNode root) {
        if (root != null) {
            System.out.println(root.val);
            printTree(root.left);
            printTree(root.right);
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int x) {
            val = x;
        }
    }
}
