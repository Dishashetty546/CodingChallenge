package Challenges.LEETCODECHALLENGE;

//IS SUBSEQUENCE
// s="abcde" t="aec"   => elements in s should be present in t in same sequence
//then return true else return false
//steps
//1. take pointer i iterate through string s, take pointer j iterate through string t
//2. if element at index i and j equal then increment both i++, j++
// else if  not equal , then j++
//3. return true or false
public class THIRTEEN {
    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";
        System.out.println(subsequenece(s, t));

    }

    public static boolean subsequenece(String s, String t) {
        if (s == null || s.equals("")) {
            return true;
        }
        int j = 0;
        int i = 0;
        for (i = 0; i < t.length(); i++) {
            if (s.charAt(j) == t.charAt(i)) {
                j++;
            }
            if (j == s.length()) {
                return true;
            }

        }
        return false;
    }
}
