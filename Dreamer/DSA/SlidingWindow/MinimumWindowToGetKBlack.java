package Dreamer.DSA.SlidingWindow;

public class MinimumWindowToGetKBlack {
    public static void main(String[] args) {
        String blocks = "WBBWWBBWBW";
        int k = 7;
        System.out.println(MinimumRecolors(blocks, k));

    }

    public static int MinimumRecolors(String blocks, int k) {
        int i = 0;
        int j = 0;
        int n = blocks.length();
        int ops = Integer.MAX_VALUE;

        int w = 0;
        while (j < n) {
            if (blocks.charAt(j) == 'W') {
                w++;

            }
            if (j - i + 1 == k) {
                ops = Math.min(ops, w);
                if (blocks.charAt(i) == 'w') {
                    w--;
                }
                i++;
            }
            j++;
        }
        return ops;

    }

}
