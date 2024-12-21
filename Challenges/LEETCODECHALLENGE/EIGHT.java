package LEETCODECHALLENGE;
//INSERT DELETE GETRANDOM --O(1)--for an array    //--

//--insert an item val into set return true if item not present
//-- remove an item val from the set if present return true
//--return a random element from set

//array will take-->0(n)

//using hashmap

import java.util.*;

public class EIGHT {

    private List<Integer> list;
    private HashMap<Integer, Integer> map;
    private Random random;

    public EIGHT() {
        list = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        map.put(val, 1);
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        int pos = map.get(val);
        int lastElement = list.get(list.size() - 1);

        // Move the last element to the position of the element to be removed
        list.set(pos, lastElement);
        map.put(lastElement, pos);

        // Remove the last element
        list.remove(list.size() - 1);
        map.remove(val);

        return true;
    }

    public int getRandom() {
        int randomInt = random.nextInt(list.size());
        return list.get(randomInt);
    }

    public static void main(String[] args) {
        EIGHT randomizedSet = new EIGHT();

        System.out.println(randomizedSet.insert(1)); // true
        System.out.println(randomizedSet.remove(2)); // false
        System.out.println(randomizedSet.insert(2)); // true
        System.out.println(randomizedSet.getRandom()); // should return either 1 or 2 randomly
        System.out.println(randomizedSet.remove(1)); // true
        System.out.println(randomizedSet.insert(2)); // false
        System.out.println(randomizedSet.getRandom()); // should return 2
    }
}
