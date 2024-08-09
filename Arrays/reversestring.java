package Arrays;

public class reversestring {
    public static void main(String[] args) {
        String S = "the sky is blue";
        System.out.println(reverse(S));

    }

    public static String reverse(String S) {
        int i, j, n;
        String result = new String();
        n = S.length();
        i = 0;
        while (i < n) {
            while (i < n && S.charAt(i) == ' ') {
                i++;
            }

            j = i + 1;
            while (j < n && S.charAt(j) != ' ') {
                j++;
            }
            String sub = S.substring(i, j);

            if (result.length() == 0) {
                result = sub;
            } else {
                result = sub + ' ' + result;

            }
            i = j;

        }
        return result;

    }

}
