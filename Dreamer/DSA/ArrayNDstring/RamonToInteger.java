package Dreamer.DSA.ArrayNDstring;

import java.util.HashMap;

public class RamonToInteger {
    public static void main(String[] args) {
        String roman = "LVIII";
        System.out.println(conversion(roman));
    }

    public static int conversion(String roman) {
        int n = roman.length();
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = map.get(roman.charAt(n - 1));
        for (int i = n - 2; i >= 0; i--) {
            if (map.get(roman.charAt(i)) < map.get(roman.charAt(i + 1))) {
                result -= map.get(roman.charAt(i));
            } else {
                result += map.get(roman.charAt(i));

            }
        }
        return result;

    }

}
