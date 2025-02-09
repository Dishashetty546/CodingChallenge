package Dreamer.DSA.SlidingWindow;

import java.util.*;

public class Concatenationofallwords {
    public static void main(String[] args) {
        String s = "fooansbarkansfoo";
        String[] words = { "foo", "ans", "bar" };
        System.out.println(concatenation(s, words));

    }

    // steps
    // 1.create an ans array which will store the starting index
    // 2.create a hashmap to store thr frequency of each substring
    // 3. create a copy map and copy thr frequency map, create a new substrings,
    // checlk if those substrings r part of copymap r not
    // 4. if it is part of copymap then reduce substring by 1, if its already one ,
    // then removw that str from copumap
    // 5. if copymap is seems to be fully empty then put it into ans array its i
    // index
    // return ans
    public static List<Integer> concatenation(String s, String[] words) {
        List<Integer> ans = new ArrayList<>();
        if (s == null || words == null || words.length == 0)
            return ans;

        int wordLength = words[0].length();
        int numWords = words.length;
        int totalLength = wordLength * numWords;
        int strLength = s.length();

        // Store word frequencies in map
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Iterate over possible starting indices
        for (int i = 0; i <= strLength - totalLength; i++) {
            Map<String, Integer> seenWords = new HashMap<>();
            int j = 0;
            while (j < numWords) {
                String subStr = s.substring(i + j * wordLength, i + (j + 1) * wordLength);
                if (!wordCount.containsKey(subStr))
                    break; // Invalid word found

                seenWords.put(subStr, seenWords.getOrDefault(subStr, 0) + 1);

                // If word appears too many times, break
                if (seenWords.get(subStr) > wordCount.get(subStr))
                    break;

                j++;
            }
            if (j == numWords)
                ans.add(i); // Found valid starting index
        }
        return ans;
    }
}