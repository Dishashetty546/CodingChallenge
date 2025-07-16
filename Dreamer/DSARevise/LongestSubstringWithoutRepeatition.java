package Dreamer.DSARevise;

//i/p: "pwwkew"
//o/p: wke
//3

import java.util.HashSet;
import java.util.Set;

//approach
//using hashset , because it takes Order of 1
//take 2 point, land r
//keep l constant
//and r keep iterating to get unique element
//keep on adding into HashSet < >
//once we get repeated character, do r-l
// maxlen= r-l
//increase l till r, this will remove character from Hashset
//again start iterative r and l constant, utill we get repeating character
//update maxlen
//then return the set
//

//complexty analysis
//space: O(n)
//time: O(n)
public class LongestSubstringWithoutRepeatition {
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(LongestSub(str));

    }

    public static int LongestSub(String str) {
        Set<Character> cs = new HashSet<>();
        int maxlen = 0;
        int l = 0;
        for (int r = 0; r < str.length(); r++) {
            while (cs.contains(str.charAt(r))) {
                cs.remove(str.charAt(r));
                l++;
            }
            cs.add(str.charAt(r));
            maxlen = Math.max(maxlen, r - l + 1);

        }
        return maxlen;

    }
}
