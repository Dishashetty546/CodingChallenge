package Challenges.LEETCODECHALLENGE;

//length of last word(  ex: "hello world"-->5 )   //* 
//
//
public class TEN {
    public static void main(String[] args) {
        String s = "hello world my";
        System.out.println(length(s));
    }

    public static int length(String s) {
        // split into words --> so using space will be plit
        String words[] = s.split(" ");
        // storing splited words in a array called words
        String lastword = words[words.length - 1];
        // lastword will have that lastword thing
        int length = lastword.length();
        return length;
    }
}
