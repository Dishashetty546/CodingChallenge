package Dreamer.DSARevise;

import java.util.*;
//i/p: ana
//o/p: true

// using two pointer approach

//complexity:
//time: O(n)
//space: O(1)
public class IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(IsPalindrome(s));

    }

    public static boolean IsPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        if (s == null || s.length() == 0) {
            return true;
        }
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;

    }

}
