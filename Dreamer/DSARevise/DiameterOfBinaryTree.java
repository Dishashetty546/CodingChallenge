package Dreamer.DSARevise;
//Given a binary tree

//of some height
//find the longest heightt that will be called as diameter

//approach
//create Map and a stack
//first iterative through the binary tree
//keep on pushing on to the stack
//once we reach end of binary tree of that section
//we'll peek last one
//check if left and right are not null
//if not , push them to stack
//if they are null, then pop 
//and check the l and r diameter
//and update the map
//and diamter

//complexity
//Time:O(N)
//space:O(n) 
//what about hashmap and stack we used in this dont they count in space?why are they not considerd in complexity?
//yes they do
//hashmap - O(n)  stack - O(n)

import java.util.*;

public class DiameterOfBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.l = new TreeNode(2);
        root.r = new TreeNode(4);
        root.l.l = new TreeNode(4);
        root.l.r = new TreeNode(5);
        System.out.println(Binary(root));

    }

    static class TreeNode {
        int val;
        TreeNode l, r;

        public TreeNode(int x) {
            val = x;
            l = r = null;
        }

    }

    public static int Binary(TreeNode n) {
        HashMap<TreeNode, Integer> map = new HashMap<>();
        Stack<TreeNode> stack = new Stack<>();
        int diamter = 0;
        if (n != null) {
            stack.push(n);
        }
        while (!stack.isEmpty()) {
            TreeNode node = stack.peek();
            if (node.l != null && !map.containsKey(node.l)) {
                stack.push(node.l);
            } else if (node.r != null && !map.containsKey(node.r)) {
                stack.push(node.r);
            } else {
                stack.pop();
                int ld = map.getOrDefault(node.l, 0);
                int rd = map.getOrDefault(node.r, 0);

                map.put(node, 1 + Math.max(ld, rd));
                diamter = Math.max(diamter, ld + rd);
            }

        }
        return diamter;

    }

}
