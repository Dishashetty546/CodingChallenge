package Dreamer.DSARevise;

import java.util.Scanner;

//I/P: namana
//o/p:  anamana
// 1
//1 value need to be inserted that is a , to make the palindrome

//approach
//find the Longest Substring which is palindrom - LRS.length
//Subtract wth the S.LENGTH
//that is minimum insertion to get palindrome

//complexity
//time: O(N^2)
//space: O(1)
public class MinimumInsertionsToMakePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(Longest(s));

    }

    public static int Longest(String s) {
        String lRS = "";
        for (int i = 1; i < s.length(); i++) {
            int l = i;
            int r = i;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                l--;
                r++;

            }
            String p = s.substring(l + 1, r);
            if (p.length() > lRS.length()) {
                lRS = p;

            }

        }

        return s.length() - lRS.length();

    }

}
