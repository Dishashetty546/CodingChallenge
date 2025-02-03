package Dreamer.DSA;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class ArrayOperations {
    static List<Integer> list;
    static HashMap<Integer, Integer> map;
    static Random random;

    // Constructor
    public ArrayOperations() {
        list = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }

    public static boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        map.put(val, list.size());
        list.add(val);
        return true;
    }

    public static boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        int pos = map.get(val);
        if (pos != list.size() - 1) {
            int lastElement = list.get(list.size() - 1);
            list.set(pos, lastElement);
            map.put(lastElement, pos);
        }
        map.remove(val);
        list.remove(list.size() - 1);
        return true;
    }

    public static int getRandom() {
        return list.get(random.nextInt(list.size()));
    }

    public static void main(String[] args) {
        ArrayOperations obj = new ArrayOperations();
        System.out.println(obj.insert(1)); // Output: true
        System.out.println(obj.insert(2)); // Output: true
        System.out.println(obj.remove(1)); // Output: true
        System.out.println(obj.getRandom()); // Output: Random element from {2}
    }
}
