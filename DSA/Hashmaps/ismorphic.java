package Hashmaps;

import java.util.HashMap;
import java.util.Map;

public class ismorphic {
    public static void main(String[] args) {
        String one = "egg";
        String two = "add";
        System.out.println(stringtype(one, two));

    }

    public static boolean stringtype(String one, String two) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < one.length(); i++) {

            char s = one.charAt(i);
            char p = two.charAt(i);
            // checking if keys from s and p are presnt in hash or not
            if (!map.containsKey(s)) {
                if (!map.containsKey(p)) {
                    map.put(s, (int) p);

                } else {
                    return false;
                }
            } else {
                Integer replacement = map.get(s);
                if (replacement != p) {
                    return false;
                }

            }

        }
        return true;

    }
}
