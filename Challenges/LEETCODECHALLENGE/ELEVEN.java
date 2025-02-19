package Challenges.LEETCODECHALLENGE;

//REVERSE WORDS IN A STRING

//ex: The sky is blue
//after reversing: blue us sky the
//step 1: check if its the only word in a string
//if so return the same string
//step 2: taking a pointer i to iterate 
//step 3: check for " ", if it is then i++
//step 4: if not " ", then w= w+s.charAt(i)
//then return value from begining index to length of string

public class ELEVEN {
    public static void main(String[] args) {
        String s = "the value is";
        System.out.println(string(s));

    }

    public static String string(String s) {
        if (s.equals(null) || s.equals("")) {
            return s;
        }
        String ret = "";
        int i = 0;
        while (i < s.length()) {
            while (i < s.length() && s.charAt(i) == ' ') {
                i++;
            }
            String w = "";
            while (i < s.length() && s.charAt(i) != ' ') {
                w += s.charAt(i);
                i++;
            }
            if (!w.equals("")) {
                ret = w + " " + ret;
            }

        }
        return ret.substring(0, ret.length() - 1);

    }

}
