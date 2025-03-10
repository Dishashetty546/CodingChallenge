package Dreamer.DSA.SlidingWindow;

import java.util.HashSet;

public class KconsonantsAndAllVowels {
    public static void main(String[] args) {
        String s = "iqeaouqi";
        int k = 2;
        System.out.println(countValidSubstrings(s, k));
    }

    public static int countValidSubstrings(String s, int k) {
        int ans = 0;
        int left = 0, right = 0, consonants = 0;
        HashSet<Character> vowels = new HashSet<>();
        while (right < s.length()) {
            char rightChar = s.charAt(right);
            if (isVowel(rightChar)) {
                vowels.add(rightChar);
            } else {
                consonants++;
            }
            while (consonants > k) {
                char leftChar = s.charAt(left);
                if (isVowel(leftChar)) {
                    vowels.remove(leftChar);
                } else {
                    consonants--;
                }
                left++;
            }
            if (consonants == k && vowels.size() == 5) {
                ans++;
            }
            right++;
        }
        return ans;
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}