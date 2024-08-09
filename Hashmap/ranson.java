import java.util.HashMap;
import java.util.Map;

public class ranson {
    public static void main(String[] args) {
        String ranson = "aa";
        String magazine = "ab";
        System.out.println(wordinanotherword(ranson, magazine));

    }

    public static boolean wordinanotherword(String ranson, String magazine) {
        // create a map to store all the characters of magazine
        Map<Character, Integer> map = new HashMap<>();
        // iterating through magazine string
        for (int i = 0; i < magazine.length(); i++) {
            // finding if alraedy key exists if yes, increment the key value
            if (map.containsKey(magazine.charAt(i))) {
                // character is added and value is duplicated na so we increment its key to +1

                map.put(magazine.charAt(i), map.get(magazine.charAt(i)) + 1);

            }
            map.put(magazine.charAt(i), 1);

        }
        int count = 0;

        for (int i = 0; i < ranson.length(); i++) {
            char ch = ranson.charAt(i);
            if (map.containsKey(ch)) {
                count++;
                map.put(ch, map.get(ch) - 1);

            } else {
                break;
            }

        }
        if (count == ranson.length()) {
            return true;
        }
        return false;

    }

}
