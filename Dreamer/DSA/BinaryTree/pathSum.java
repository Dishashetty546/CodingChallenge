package Dreamer.DSA.BinaryTree;

import java.util.Stack;

public class pathSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(2);
        int targetSum = 5;
        System.out.println(hasPathSum(root, targetSum));
    }

    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }

        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> sumStack = new Stack<>();

        stack.push(root);
        sumStack.push(root.val);

        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            int tempVal = sumStack.pop();

            if (temp.left == null && temp.right == null && tempVal == sum) {
                return true;
            }

            if (temp.right != null) {
                stack.push(temp.right);
                sumStack.push(temp.right.val + tempVal);
            }
            if (temp.left != null) {
                stack.push(temp.left);
                sumStack.push(temp.left.val + tempVal);
            }
        }
        return false;
    }

    static class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        TreeNode(int x) {
            val = x; // Corrected assignment
        }
    }
}
