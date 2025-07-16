package Algorithm.Graphsearch;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;

class Node {
    int val;
    LinkedList<Node> children;

    public Node(int val) {
        this.val = val;
        this.children = new LinkedList<>();
    }
}

public class dfs {
    public static void main(String[] args) {
        Node root = new Node(1);
        Node child1 = new Node(2);
        Node child2 = new Node(3);
        root.children.add(child1);
        root.children.add(child2);
        System.out.println(dfss(root, 7));

    }

    public static boolean dfss(Node startNode, int end) {
        HashSet<Node> visited = new HashSet<>();
        Stack<Node> stack = new Stack<>();
        stack.push(startNode);
        visited.add(startNode);

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            if (current.val == end) {
                return true;
            } else {
                // Iterate over children in reverse order
                for (int i = current.children.size() - 1; i >= 0; i--) {
                    Node adjacencyNode = current.children.get(i);
                    if (!visited.contains(adjacencyNode)) {
                        stack.push(adjacencyNode);
                        visited.add(adjacencyNode);
                    }
                }
            }
        }
        return false;
    }
}
