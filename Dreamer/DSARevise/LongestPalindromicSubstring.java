package Dreamer.DSARevise;

import java.util.Scanner;

//i/p: anamana
//o/P: 7

//iterate throught string
//throught a for loop,starts from elemnt at index 1
//take two variables to store one is l, another is r
//while both are equal and l>=0 and r< string length, loop continues
//till this condition gets wrong
//keep on l--, r++, check for palindrome
//To calculate maximum palidrom , create a varibale LRM
//then return it

//complexity
//time: O(N^2)
// O(n) for outer for loop
// multiply by inner while loop O(N)
//== O(N^2)

//space:O(1)
//no extra space except lr,r,l those are varibles
public class LongestPalindromicSubstring {

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
        return lRS.length();

    }
}
