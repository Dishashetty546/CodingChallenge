package Dreamer.DSARevise;

public class CoinChange {

    public static void main(String[] args) {
        int[] n = { 1, 2, 5 };
        int a = 11;
        System.out.println(coin(n, a));

    }

    public static int coin(int[] n, int a) {
        if (a < 1) {
            return 0;
        }
        int[] m = new int[a + 1];
        for (int i = 1; i <= a; i++) {
            m[i] = Integer.MAX_VALUE;
            for (int coin : n) {
                if (coin <= i) {
                    m[i] = Math.min(m[i], 1 + m[i - coin]);

                }
            }
        }
        return m[a];
    }
}
