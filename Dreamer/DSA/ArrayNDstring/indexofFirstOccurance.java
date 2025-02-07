package Dreamer.DSA.ArrayNDstring;

public class indexofFirstOccurance {
    public static void main(String[] args) {
        String haystack = "sabutsd";
        String needle = "sad";
        System.out.println(search(haystack, needle));
    }

    public static int search(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        for (int i = 0; i <= n - m; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                String s = haystack.substring(i, i + m);

                if (s.equals(needle)) {
                    return 0;
                }
            }

        }
        return -1;
    }

}
