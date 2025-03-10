package Dreamer.DSA.ArrayNDstring;

class CountNumberOfColoredCells {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(NumberOfColoredCells(n));
    }

    public static int NumberOfColoredCells(int n) {
        if (n == 1) {
            return 1;
        }
        long ans = 1;
        int val = 4;
        for (int i = 2; i <= n; i++) {
            ans = ans + val;
            val = val + 4;
        }
        return (int) ans;
    }
}