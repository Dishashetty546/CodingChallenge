package LEETCODECHALLENGE;

import java.util.*;

public class NINTEEN {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(substring(s));
    }

    public static int substring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0, left = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
