package Dreamer.DSA;

public class longestsubstring {
    public static void main(String[] args) {
        String[] str = { "flower", "flow", "flight" };
        System.out.println(longest(str));
    }

    public static String longest(String[] str) {
        if (str == null || str.length == 0) {
            return "";
        }

        String prefix = str[0];
        for (int i = 1; i < str.length; i++) {
            int j = 0;
            while (j < prefix.length() && j < str[i].length() && prefix.charAt(j) == str[i].charAt(j)) {
                j++;
            }
            prefix = prefix.substring(0, j);
        }

        return prefix;
    }
}
