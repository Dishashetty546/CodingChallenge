package LEETCODECHALLENGE;

//Ransom Note
//give 2 strings 
//ransomNOte- a
//magazine - b
//here o/p: false
//return true , if we can create ransomNote using letters of magazine
//else return false
//steps:
//step1: use hashmap to store the characters of magazine in hashmap
//step2: take a loop to iterate through the string array magazine
//step3: if map.containsKey --> if that particular charater already present in map--> then map.put(magazine.charAt(i),map.get(magazine.charAt(i)+1))
//else map.put(magazine.charAt(i),1)
//step4: iterate through ransonNote string, if map.containsKey(ch) or frequency>0 then count ++
//else break
//step5: count==ranson.length --> return true else false
import java.util.*;

public class TWENTYTHREE {
    public static void main(String[] args) {
        String ransonNote = "disha";
        String magazine = "dishash";
        System.out.println(ranson(ransonNote, magazine));

    }

    public static boolean ranson(String ransonNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;// because we are storing characters in the form of integers
        for (int i = 0; i < magazine.length(); i++) {
            if (map.containsKey(magazine.charAt(i))) {
                map.put(magazine.charAt(i), map.get(magazine.charAt(i)) + 1);
            } else {
                map.put(magazine.charAt(i), 1);
            }

        }
        for (int i = 0; i < ransonNote.length(); i++) {

            char ch = ransonNote.charAt(i);
            if (map.containsKey(ch) && map.get(ch) > 0) {
                count++;
                map.put(ch, map.get(ch) - 1);

            } else {
                break;
            }
        }
        if (count == ransonNote.length()) {
            return true;

        } else {
            return false;
        }

    }

}
