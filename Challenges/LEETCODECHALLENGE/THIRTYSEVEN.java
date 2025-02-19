package Challenges.LEETCODECHALLENGE;
//longest common prefix

//Brute force approach: check for each element in all the strings
//ex: {cluster, clue, clutch, club,clumsy}
//search for c in all the string , then check for l, then u, then s, etc  -->taking so much time to solve it , so think of optimal solution

//appproach 1: whenver searching comes , try to sort first, , then by comparing 1 st and last element, we'll get the common prefix
//space - o(1)- we didnt use any extra space her    time- o(nlogn)-we used sort operation, quick sort is faster 
import java.util.Arrays;

public class THIRTYSEVEN {
    public static void main(String[] args) {
        String[] str = { "clue", "closure", "cloro" };
        System.out.println(common(str));

    }

    public static StringBuilder common(String[] str) {
        // sort string array
        Arrays.sort(str);
        // get the first nd the last string
        char[] first = str[0].toCharArray();
        char[] last = str[str.length - 1].toCharArray();
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < first.length; i++) {

            if (first[i] != last[i]) {
                break;
            }

            prefix.append(first[i]);

        }
        return prefix;
    }

}
