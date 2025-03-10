package Dreamer.DSA.ArrayNDstring;

import java.util.*;

public class CountNumberOfVowels {
    public static void main(String[] args) {
        String s = "abcaia";
        System.out.println(Arrays.toString(Counting(s)));
    }

    public static int[] Counting(String s) {
        String VowelsList = "aeiouAEIOU";
        int v = 0;
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) {
                if (VowelsList.indexOf(ch) != -1) {
                    v++;
                } else {
                    c++;
                }
            }

        }
        return new int[] { v, c };

    }

}
