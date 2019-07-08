package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        // Map (key, value로 규정)
        Map<String, Integer> map = new HashMap<>();

        map.put("kor", 100);
        map.put("mat", 90);
        map.put("eng", 80);
        map.put("eng", 90);

        printMap(map);

        // HashMap (key : String, value : List<String>)
        Map <String, List<String>> map2 = new HashMap<>();

        // ArrayList (map<String, String>)
        ArrayList<Map<String, String>> list3 = new ArrayList<>();


    }

    private static void printMap(Map<String, Integer> map) {
        for (String key  : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
