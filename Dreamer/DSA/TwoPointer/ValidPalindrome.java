package Dreamer.DSA.TwoPointer;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Pan";
        System.out.println(palindrome(s));

    }

    public static boolean palindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int n = s.length();
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;

            } else {
                i++;
                j--;
            }
        }
        return true;
    }

}
