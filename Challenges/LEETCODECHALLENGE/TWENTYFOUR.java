package LEETCODECHALLENGE;
//word pattern

/////////////////////////////////////////////////////////

//string[] args -->String[] is an array that holds multiple strings.

// could use any valid identifier name like arguments or inputArgs.

//input: each letter in the pattern corresponds to each string inside the s
//ex: pattern="abba" , s="do cat cat dog"
//o/p: true
//steps

//step1: taking 2 hashmaps to store
import java.util.*;

public class TWENTYFOUR {
    public static void main(String[] args) {
        // Example usage
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s)); // Output: true
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false; // If the number of words doesn't match the pattern length
        }

        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            // Check if there's a mismatch in the mapping
            if (charToWord.containsKey(ch)) {
                if (!charToWord.get(ch).equals(word)) {
                    return false;
                }
            } else {
                if (wordToChar.containsKey(word)) {
                    return false; // Bijective mapping fails (word already mapped to a different character)
                }
                // Establish both mappings
                charToWord.put(ch, word);
                wordToChar.put(word, ch);
            }
        }
        return true;
    }
}
