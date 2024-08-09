package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class removeinsertandother {
    static List<Integer> list;
    static HashMap<Integer, Integer> map;
    static Random random = new Random();

    public static void main(String[] args) {
        // Initialize the data structure
        randomisedset();

        // Test insert
        System.out.println(insert(1)); // true
        System.out.println(insert(2)); // true
        System.out.println(insert(1)); // false

        // Test delete
        System.out.println(delete(1)); // true
        System.out.println(delete(3)); // false

        // Test getRandom
        System.out.println(getRandom()); // Should print 2

        // Additional inserts and getRandom
        insert(3);
        insert(4);
        System.out.println(getRandom());

    }

    public static void randomisedset() {
        list = new ArrayList<Integer>();
        map = new HashMap<Integer, Integer>();

    }

    public static boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        map.put(val, list.size());
        list.add(val);
        return true;
    }

    public static boolean delete(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        int pos = map.get(val);
        if (pos != (list.size() - 1)) {
            int lastelement = list.get(list.size() - 1);
            list.set(pos, lastelement);
            map.put(lastelement, pos);

        }
        map.remove(val);
        list.remove(list.size() - 1);
        return true;
    }

    public static Integer getRandom() {
        int randonint = random.nextInt(list.size());
        return list.get(randonint);

    }

}
