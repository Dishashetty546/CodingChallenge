package Dreamer.DSA.TwoPointer;

public class Subsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "aaaac";
        System.out.println(subsequence(s, t));

    }

    public static boolean subsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            } else {
                j++;
            }
        }

        if (i == s.length()) {
            return true;
        }

        return false;

    }

}
