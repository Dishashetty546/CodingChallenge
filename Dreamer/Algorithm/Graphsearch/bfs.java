package Algorithm.Graphsearch;

import java.util.LinkedList;
import java.util.Queue;
import java.util.HashSet;

class Node {
    int val;
    LinkedList<Node> children;

    public Node(int val) {
        this.val = val;
        this.children = new LinkedList<>();
    }

}

public class bfs {
    public static void main(String[] args) {
        Node root = new Node(1);
        Node child1 = new Node(2);
        Node chil2 = new Node(3);
        root.children.add(child1);
        root.children.add(chil2);
        System.out.println(bfss(root, 7));

    }

    public static boolean bfss(Node start, int end) {
        HashSet<Node> visited = new HashSet<>();
        Queue<Node> adjacency = new LinkedList<>();
        adjacency.add(start);
        visited.add(start);

        while (!adjacency.isEmpty()) {
            Node current = adjacency.remove();
            if (current.val == end) {
                return true;
            }
            for (Node adjacencyNode : current.children) {

                if (!visited.contains(adjacencyNode)) {
                    adjacency.add(adjacencyNode);
                    visited.add(adjacencyNode);
                }
            }
        }
        return false;
    }

}
