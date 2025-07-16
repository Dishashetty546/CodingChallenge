package Dreamer.DSARevise;

import java.util.*;

public class InsertDeleteGetRandom {
    Map<Integer, Integer> map;
    List<Integer> list;
    Random rand;

    public void randomisedset() {
        map = new HashMap<>();
        list = new ArrayList<>();
        rand = new Random();

    }

    public boolean insert(int val) {
        if (map.containsKey(val))
            return false;
        map.put(val, list.size() - 1);
        list.add(val);
        return true;
    }

}
