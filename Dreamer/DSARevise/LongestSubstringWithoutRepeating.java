package Dreamer.DSARevise;

import java.util.*;

class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        String s = "abcabcd";
        System.out.println(Longest(s));

    }

    public static int Longest(String s) {
        int maxlen = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (map.containsKey(ch)) {
                left = Math.max(left, map.get(ch) + 1);
            }
            map.put(ch, right);
            maxlen = Math.max(maxlen, right - left);

        }
        return maxlen;
    }
}