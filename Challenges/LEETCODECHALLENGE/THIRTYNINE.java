package LEETCODECHALLENGE;

//climbbing staircase
//ex: if there are 2 steps, itt can climb by 1 nd 1 or 2  --so 2 ways
//brute force approach- number of ways depends on no. of steps

//approach 1: if n=7, if Im at stare 6, then 1, im at stare 5, then 1,1 nd 2 , that way 
public class THIRTYNINE {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(climbing(n));

    }

    public static int climbing(int n) {
        if (n == 1) {
            return 1;
        }

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];

    }

}
