package Slidingwindow;

import java.util.Map;
import java.util.HashMap;

public class longeststringwithoutrepeat {
    public static void main(String[] args) {
        String s = "abcababf";
        System.out.println(withoutreapet(s));

    }

    public static int withoutreapet(String s) {
        Map<Character, Integer> map = new HashMap<>();

        int start = 0;
        int end = 0;
        int len = 0;
        for (end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            if (map.containsKey(c)) {
                if (start <= map.get(c)) {
                    start = map.get(c) + 1;
                }

            }
            len = Math.max(len, end - start + 1);
            map.put(c, end);
        }
        return len;

    }

}
