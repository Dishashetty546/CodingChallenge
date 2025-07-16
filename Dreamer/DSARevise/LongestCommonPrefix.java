package Dreamer.DSARevise;
//Given 

// strs=["flower","flow","flight"]
//o/p:"fl"

//approach
//first sort it, why? because you can just check first and the last word 
//middle one will authomatically have that

//ex: [[Flight,Flow,Flower]]
//check first word and last word and compare
//f - f
//l - l
//i not o
//o/p fl

//complexity analysis
//Time: O(n)
//Space: O(n)
import java.util.*;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String str[] = { "Flower", "Flow", "Flight" };
        System.out.println(Longest(str));

    }

    public static String Longest(String str[]) {
        Arrays.sort(str);
        String s1 = str[0];
        String s2 = str[str.length - 1];
        int i = 0;
        while (i < s1.length() - 1) {
            if (s1.charAt(i) == s2.charAt(i)) {
                i++;
            } else {
                break;
            }

        }
        return i == 0 ? "" : s1.substring(0, i);

    }

}
