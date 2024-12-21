package Hashmaps;

public class anagram {
    public static void main(String[] args) {
        String s = "cat";
        String t = "act";
        System.out.println(word(s, t));

    }

    public static boolean word(String s, String t) {
        // creading another array with size 26 to tore all the alphabets
        int[] h = new int[26];
        int sl = s.length();
        int tl = t.length();

        for (int i = 0; i < sl; i++) {
            h[s.charAt(i) - 'a'] = h[s.charAt(i) - 'a'] + 1;

        }
        for (int i = 0; i < tl; i++) {
            h[t.charAt(i) - 'a'] = h[t.charAt(i) - 'a'] - 1;
        }
        for (int i = 0; i < 26; i++) {
            if (h[i] != 0)
                return false;
        }
        return true;

    }

}
