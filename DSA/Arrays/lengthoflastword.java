package Arrays;

public class lengthoflastword {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(length(s));

    }

    public static int length(String s) {
        String words[] = s.split(" ");
        String lastword = words[words.length - 1];
        int length = lastword.length();
        return length;
    }
}
