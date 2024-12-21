package LEETCODECHALLENGE;

//ps: string s= aba
//  n=10
//abaabaabaa
//number of a = 7
//o/p=7
//brute force method: 
//repeating the string until you fill 10 elements
//search for the coocurance of a in the sring 

//efficient sol
//
public class FOURTY {
    public static void main(String[] args) {
        String str = "abab";
        int n = 10;
        System.out.println(string(str, 10));

    }

    public static int string(String str, int n) {
        // step1: calculate length of str
        int strlength = str.length();
        // step2: count for a in that string
        int count = 0;
        for (int i = 0; i < strlength; i++) {
            if (str.charAt(i) == 'a') {
                ++count;
            }
        }
        // sep3: calculate number of times string is repeated to get n
        int repeatedstr = n / strlength;

        // step4: calculate extra a value
        int extra = 0;
        for (int i = 0; i < repeatedstr; i++) {
            if (str.charAt(i) == 'a') {
                ++extra;
            }
        }
        int total = (repeatedstr * count) + extra;
        return total;

    }
}