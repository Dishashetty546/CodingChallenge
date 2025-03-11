import java.util.HashMap;

public class CountSubstringWithThreeVariables {

    public int numberOfSubstrings(String s) {
        int left = 0;
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            }
            map.put(ch, 1);

            while (map.size() == 3) {
                count = count + s.length() - right;
                char lchar = s.charAt(left);
                map.put(lchar, map.get(lchar) - 1);
                if (map.get(lchar) == 0) {
                    map.remove(lchar);
                }
                left++;

            }
        }
        return count;

    }

}
