package Dreamer.DSA.Hashmap;

import java.util.*;

public class wordpattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(words(pattern, s));
    }

    public static boolean words(String pattern, String s) {
        HashMap<Character, String> m = new HashMap<>();
        HashMap<String, Character> n = new HashMap<>();
        String[] word = s.split(" ");

        if (pattern.length() != word.length) {
            return false; // The number of words must match the pattern length
        }

        for (int i = 0; i < pattern.length(); i++) {
            char p = pattern.charAt(i);
            String words = word[i];

            if (!m.containsKey(p)) {
                if (n.containsKey(words)) {
                    return false;
                } else {
                    m.put(p, words);
                    n.put(words, p);
                }
            } else {
                if (!m.get(p).equals(words)) {
                    return false;
                }
            }
        }
        return true;
    }
}
