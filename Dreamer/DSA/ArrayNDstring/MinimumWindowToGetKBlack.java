package Dreamer.DSA.ArrayNDstring;

public class MinimumWindowToGetKBlack {
    public static void main(String[] args) {
        String blocks = "WBBWWBBWBW";
        int k = 7;
        System.out.println(MinimumRecolors(blocks, k));

    }

    public static int MinimumRecolors(String blocks, int k) {

        int minRecords = Integer.MAX_VALUE;
        for (int i = 0; i <= blocks.length() - k; i++) {
            int recolors = 0;
            for (int j = i; j < i + k; j++) {
                if (blocks.charAt(j) == 'W') {
                    recolors++;
                }
            }
            minRecords = Math.min(minRecords, recolors);

        }
        return minRecords;

    }

}
