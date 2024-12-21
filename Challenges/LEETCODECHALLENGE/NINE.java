package LEETCODECHALLENGE;

import java.util.HashMap;
import java.util.HashMap;

// Roman to Integer Converter   //* 
// Using HashMap
public class NINE {
    public static void main(String[] args) {
        String s = "MCM"; // Input string
        System.out.println(roman(s)); // Output: 1994
    }

    public static int roman(String s) {
        // Step 1: Initialize the Roman numeral values in a HashMap
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        // Step 2: Create a result variable and iterate through the string
        int result = 0;
        char[] chars = s.toCharArray();

        // Step 3: Iterate through the string
        for (int i = 0; i < chars.length; i++) {
            result += map.get(chars[i]); // Otherwise, add the current value
        }

        return result; // Step 5: Return the final result
    }

}
