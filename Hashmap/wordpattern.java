import java.util.Map;
import java.util.HashMap;

public class wordpattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        boolean result = pattern(pattern, s);
        System.out.println(result); // This should print true if pattern matches, false otherwise
    }

    public static boolean pattern(String pattern, String s) {
        Map<Character, String> P = new HashMap<>(); // Map to store character -> word mappings
        Map<String, Character> sh = new HashMap<>(); // Map to store word -> character mappings

        String[] words = s.split(" "); // Splitting sentence s into words
        if (pattern.length() != words.length) {
            return false; // If lengths of pattern and words array are different, return false
        }

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i); // Current character in pattern
            String word = words[i]; // Corresponding word in s

            if (!P.containsKey(ch)) {
                if (sh.containsKey(word)) {
                    return false; // If word is already mapped to a different character, return false
                } else {
                    P.put(ch, word); // Map character ch to word
                    sh.put(word, ch); // Map word to character ch
                }
            } else {
                String mappedWord = P.get(ch); // Get the previously mapped word for character ch
                if (!mappedWord.equals(word)) {
                    return false; // If mapped word is different from current word, return false
                }
                return true;
            }
        }

        return true; // If all mappings match, return true
    }
}
