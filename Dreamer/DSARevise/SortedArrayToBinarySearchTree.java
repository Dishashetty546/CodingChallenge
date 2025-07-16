package Dreamer.DSARevise;
//Sorted Array into Binary Search tree

//EX: [-10,-3,0,5,9]
//         0   
//       -3 9
//     -10    5 
//o/p: [0,-3,9,-10,null,5]
import java.util.*;

//approach
//take middle element and create it as root node - get
//create a recursive function to get right and left element
//steps
//1. find the middle element of the array
//2. create a new TreeNode with the middle element
//3. recursively call the func for left and right subarrays
//4. return the root node
//complexity
//time: 0(n)
//space : O(n) for the tree structure
public class SortedArrayToBinarySearchTree {
    public static void main(String[] args) {
        int[] nums = { -10, -3, 0, 5, 9 };
        TreeNode root = Converting(nums);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        List<String> output = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if (current != null) {
                output.add(String.valueOf(current.val));
                queue.offer(current.left);
                queue.offer(current.right);
            } else {
                output.add("null");
            }
        }

        // Trim trailing "null" values for correct output format
        int i = output.size() - 1;
        while (i >= 0 && output.get(i).equals("null")) {
            i--;
        }

        // Print final output
        for (int j = 0; j <= i; j++) {
            System.out.println(output.get(j));
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static TreeNode Converting(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        return getBST(nums, 0, nums.length - 1);
    }

    public static TreeNode getBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int middle = (start + end) / 2;
        final TreeNode bst = new TreeNode(nums[middle]);
        bst.left = getBST(nums, start, middle - 1);
        bst.right = getBST(nums, middle + 1, end);
        return bst;
    }
}
