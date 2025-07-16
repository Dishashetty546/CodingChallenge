package Dreamer.DSARevise;
//given

//hello world
//o/p world length - 5

//approach
//remove all the extra white space
//hello world
//iterate from last element length()-1
//then when we find the white space will retuen that number

//Comp;exit analysis
//time: O(n)
//space: O(n

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello  world";
        System.out.println(last(s));
    }

    public static int last(String s) {
        String str = s.trim();
        int count = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) != ' ') {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

}
