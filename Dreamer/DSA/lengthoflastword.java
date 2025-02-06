package Dreamer.DSA;

public class lengthoflastword {
    public static void main(String[] args) {
        String word = "hello Disha";
        System.out.println(length(word));
    }

    public static int length(String s) {
        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;

            } else {
                break;
            }

        }
        return count;
    }

}
