package Dreamer.DSA.SlidingWindow;

import java.util.*;
import java.util.HashMap;

public class LongestSubstringwithoutRepeat {
    public static void main(String[] args) {
        String s = "bbbbb";
        System.out.println(substring(s));
    }

    public static int substring(String s) {
        HashSet<Character> map = new HashSet<>();
        int left = 0;
        int right = 0;
        int max = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            if (map.add(c)) {
                max = Math.max(max, right - left + 1);
                right++;

            } else if (s.charAt(left) != c) {
                map.remove(s.charAt(left));
                left++;
            } else {
                map.remove(s.charAt(left));
                left++;
            }

        }
        return max;

    }
}
