package Dreamer.DSARevise;
//ip: 3

//o/p: 3

//climb 1 step - in 1 ways
//climb 2 step - in 2 ways
//1 - 1,1
//2 - 2

//climb 3 step - in 3 ways
//1 - 1,1,1
//2 - 1,2
//3 - 2,1

//by this we get to know that , d[n]= d[n-1]+d[n-2]
//ex: number of steps for 3 = no of steps for 1 + no of steps for 2
// 3= 1+2

//first we create a new array to store
//take first and second index manually
//then include the formula, this is dynamic programming approach

//complexity
//time: O(n)
//space: O(n)
public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(stairs(n));

    }

    public static int stairs(int s) {
        if (s == 1) {
            return 1;
        }
        int[] sp = new int[s + 1];
        sp[1] = 1;
        sp[2] = 2;
        for (int i = 3; i <= s; i++) {
            sp[i] = sp[i - 1] + sp[i - 2];
        }
        return sp[s];

    }

}
