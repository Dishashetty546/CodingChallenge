package Dreamer.DSA.Hashmap;

import java.util.*;

public class Ransomnote {
    public static void main(String[] args) {
        String ransom = "disha";
        String magazine = "jhjdisha";
        System.out.println(canConstruct(ransom, magazine));

    }

    public static boolean canConstruct(String ransom, String magazine) {
        // create a map to store all the characters of magazine
        Map<Character, Integer> map = new HashMap<>();
        // iterating through magazine string
        for (int i = 0; i < magazine.length(); i++) {
            // finding if already key exists if yes, increment the key value
            if (map.containsKey(magazine.charAt(i))) {
                // character is added and value is duplicated so we increment its key by +1
                map.put(magazine.charAt(i), map.get(magazine.charAt(i)) + 1);
            } else {
                // Set the character count to 1 if it does not exist in the map
                map.put(magazine.charAt(i), 1);
            }
        }

        int count = 0;

        for (int i = 0; i < ransom.length(); i++) {
            char ch = ransom.charAt(i);
            // The condition should check if the character count is greater than 0, not >= 0
            if (map.containsKey(ch) && map.get(ch) > 0) {
                count++;
                map.put(ch, map.get(ch) - 1);
            } else {
                break;
            }
        }

        if (count == ransom.length()) {
            return true;
        }
        return false;
    }
}
