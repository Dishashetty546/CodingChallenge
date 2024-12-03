package LEETCODECHALLENGE;

import java.util.HashMap;

//------------------HALF WAY------------------------------------------------------
//sherlocks and the valid string
import java.util.Map;
import java.util.Arrays;

//ex: ABC - string frequency - A-1,B-1,C-1
//O/P:HENCE A VALID STRING

//EX 1: ABBCCD - string frequency - A-1,B-2,C-2,D-1
//O/P:INVALID STRING

//string is valid in 3 cases: 1. all frequencies are same  2.all are same, but one frequency is 1 3.all frequencies are same but one is higher by 1

//BRUTE FORCE APPROACH

//

public class FIFTYTWO {
    public static void main(String[] args) {

    }

    public static String sherlocks(String s) {
        Map<Character, Integer> charformap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int freq = charformap.getOrDefault(c, 0);
            charformap.put(c, ++freq);
        }
        int[] arr = new int[charformap.size()];
        int idx = 0;
        for (Map.Entry<Character, Integer> characterIntegrity : charformap.entrySet()) {
            arr[idx++] = characterIntegrity.getValue();
        }
        Arrays.sort(arr);

        if (charformap.size() == 1)
            return "YES";
        return s;
    }

}
