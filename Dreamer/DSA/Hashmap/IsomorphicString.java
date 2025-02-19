package Dreamer.DSA.Hashmap;

import java.util.*;

public class IsomorphicString {
    public static void main(String[] args) {
        String s = "egg";
        String p = "bb";
        System.out.println(Stringpp(s, p));

    }

    public static boolean Stringpp(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char p = t.charAt(i);
            if (!map.containsKey(c)) {
                if (!map.containsValue(p)) {
                    map.put(c, p);

                } else {
                    return false;
                }

            } else {
                char r = map.get(c);
                if (r != p) {
                    return false;
                }

            }

        }
        return true;

    }

}
