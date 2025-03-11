package Dreamer.DSA.ArrayNDstring;

public class CountSubStringWithThreeVariables {

    public static void main(String[] args) {
        String s = "aaacb";
        System.out.println(numberOfSubstrings(s));
    }

    public static int numberOfSubstrings(String s) {
        int total = 0;
        int min = 0;
        int l = s.length();
        int[] lpos = { -1, -1, -1 };
        for (int pos = 0; pos < l; pos++) {
            lpos[s.charAt(pos) - 'a'] = pos;

            min = Math.min(lpos[0], Math.min(lpos[1], lpos[2]));
            total += 1 + min;

        }
        return total;
    }

}
