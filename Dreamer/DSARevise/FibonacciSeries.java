package Dreamer.DSARevise;
//fibonacci

//[0,1,1,2,3,5,8,13,21,34]

//fibonacci is sum of first 2 previous numbers

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        fibonacci(n);

    }

    public static boolean fibonacci(int n) {
        int fn = 0;
        int sn = 1;
        int nn;
        for (int i = 0; i < n; i++) {
            nn = fn + sn;
            fn = sn;
            sn = nn;
            System.out.println(fn);
        }
        return true;

    }

}
