package Algorithm.Knapsack_problem;

import java.util.*;

public class greedy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of values:");
        int n = sc.nextInt();
        System.out.println("Enter the weights :");
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }
        System.out.println("Enter the profit:");
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        System.out.println("Enter the capacity");
        int cap = sc.nextInt();
        Item[] Items = new Item[n];
        for (int i = 0; i < n; i++) {
            Items[i] = new Item(w[i], v[i]);
        }
        Arrays.sort(Items);
        double div = 0;
        int rc = cap;
        for (int i = 0; i < n; i++) {
            if (rc <= 0) {
                break;
            } else if (Items[i].w < rc) {
                div += Items[i].v;
                rc -= Items[i].w;

            } else {
                div += Items[i].v * ((double) rc / Items[i].w);
                rc = 0;
                break;
            }

        }
        System.out.println("Total: \n" + div);

    }

    public static class Item implements Comparable<Item> {
        int w;
        int v;
        double r;

        public Item(int w, int v) {
            this.w = w;
            this.v = v;
            this.r = ((double) v / w);
        }

        public int compareTo(Item o) {
            return Double.compare(o.r, this.r);

        }
    }
}