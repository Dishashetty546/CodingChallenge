package Challenges.LEETCODECHALLENGE;
//valid anagram

//both the strings shud have same number of values nd alphabets of string 1 = alphbets of string 2
//ex: s= "anagram" t="nagaram"
//o/p: true

//steps
//step1: storing characters of string in an array
//create a count array to store all the alphabets
//step2: iterate through the string s, store each element in count array ---> count[ch-'a']++;
//step3: iterate through the string t, store each elemet in count array--> count[ch-'a']++;
//count array is an array --> which store alphabets and increment accordingly to its frequency
// step4: to find both strings have same alphabets---count[i]>0 ?  then return false, else true
public class TWENTYFIVE {
    public static void main(String[] args) {
        String s = "disha";
        String t = "adish";
        System.out.println(anagram(s, t));

    }

    public static boolean anagram(String s, String t) {
        int count[] = new int[26];
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            count[ch - 'a']++;

        }
        for (int i = 0; i < t.length(); i++) {
            char ch = s.charAt(i);
            count[ch - 'a']--;
        }
        for (int i = 0; i < s.length(); i++) {
            if (count[i] > 0) {
                return false;
            }

        }
        return true;

    }

}
