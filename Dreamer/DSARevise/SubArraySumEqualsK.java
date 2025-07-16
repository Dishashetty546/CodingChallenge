package Dreamer.DSARevise;

import java.util.*;
//input: 
// n=2
// 4 5 1
//target 6
//o/p 1

//use Hashmap
//first iterate through the array
//create a variable sum,count initialize to 0
//first sum=sum+num[i]
//check if sum is present in map 6-4 = 2
//if not add into map
//if you find the same element in map
//then increment the count
//at last return the count

//complexity
//Time: O(N)
//space: O(1)

public class SubArraySumEqualsK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] inp = new int[n];
        for (int i = 0; i < n; i++) {
            inp[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(sum(inp, k));
    }

    public static int sum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;

            map.put(sum, map.getOrDefault(sum, 0) + 1);

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

        }

        return count;
    }
}
