package LEETCODECHALLENGE;

import java.util.HashSet;
//TWO STRINGS
//determine if they share a common string
//EX: CAT
//    RAT  //O/P:YES at is common
//approach 1: list all the possible sub string from the given string, then compare all these substrings with another string
//computation time increases- this is not a afficieent sol
import java.util.Set;

//approach 2: using set ds, where we cant have repeated elements, taking all unique elements from set 1 nd set 2
//then take a union of this sets, if we find any return yes
public class THIRTYFOUR {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "dil";
        System.out.println(common(s1, s2));

    }

    public static String common(String s1, String s2) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            set1.add(s1.charAt(i));
        }
        for (int i = 0; i < s2.length(); i++) {
            set2.add(s2.charAt(i));
        }
        // to make union of 2 sets use set1.retainAll(set2)
        set1.retainAll(set2);
        if (!set1.isEmpty()) {
            return "YES";
        }
        return "NO";

    }

}
