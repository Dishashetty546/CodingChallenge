package Arrays;

public class findingsubstringinastring {
    public static void main(String[] args) {
        String hay = "leetcode";
        String needle = "od";
        System.out.println(findstring(hay, needle));

    }

    public static int findstring(String hay, String needle) {
        int n = hay.length();
        int k = needle.length();
        for (int i = 0; i <= n - k; i++) {
            if (hay.charAt(i) == needle.charAt(0)) {
                String sub = hay.substring(i, i + k);

                if (sub.equals(needle)) {
                    return i;

                }
            }
        }
        return -1;
    }

}
