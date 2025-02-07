package Dreamer.DSA.ArrayNDstring;

import java.util.*;

public class reversewordsinString {
    public static void main(String[] args) {
        String s = "The sky is blue";
        System.out.println(reverse(s));

    }

    public static String reverse(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

}
