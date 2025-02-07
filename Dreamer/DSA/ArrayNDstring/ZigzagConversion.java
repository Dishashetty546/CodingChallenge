package Dreamer.DSA.ArrayNDstring;

public class ZigzagConversion {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(convert(s, numRows));

    }

    public static String convert(String s, int numRows) {
        if (numRows == 1)
            return s; // Edge case: If numRows is 1, return the string itself.

        StringBuilder[] ans = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            ans[i] = new StringBuilder();
        }

        int i = 0;
        while (i < s.length()) {
            // Traverse downward
            for (int index = 0; index < numRows && i < s.length(); index++) {
                ans[index].append(s.charAt(i++));
            }
            // Traverse upward
            for (int index = numRows - 2; index > 0 && i < s.length(); index--) {
                ans[index].append(s.charAt(i++));
            }
        }

        StringBuilder res = new StringBuilder();
        for (StringBuilder str : ans) {
            res.append(str);
        }

        return res.toString();
    }

}
