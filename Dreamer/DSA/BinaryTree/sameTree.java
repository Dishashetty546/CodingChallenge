package Dreamer.DSA.BinaryTree;

import java.util.*;

public class sameTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        TreeNode leave = new TreeNode(1);
        leave.left = new TreeNode(2);
        leave.right = new TreeNode(3);
        System.out.println(same(root, leave));

    }

    public static boolean same(TreeNode p, TreeNode r) {
        if (p == null && r == null) {
            return true;
        }
        if ((p == null && r != null) || (p != null && r == null)) {
            return false;
        }
        if (p.val != r.val) {
            return false;
        }
        return same(p.left, r.left) && same(p.right, r.right);

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            x = val;
        }

    }

}
