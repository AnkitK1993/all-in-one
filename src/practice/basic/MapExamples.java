package practice.basic;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapExamples {

    public static void main(String[] args) {
        testConcurrentHashMapExample();
        testSynchronizedHashMapExample();
    }

    private static void testConcurrentHashMapExample() {
        System.out.println("testConcurrentHashMapExample");
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        System.out.println(map);

        String two = map.get(2);
        System.out.println(two);

        map.putIfAbsent(2, "twoooooooo");
        map.putIfAbsent(5, "five");
        System.out.println(map);
    }

    private static void testSynchronizedHashMapExample() {
        System.out.println("testSynchronizedHashMapExample");
        HashMap<Integer, String> map = new HashMap<>();

        Map<Integer, String> syncHashMap = Collections.synchronizedMap(map);

        syncHashMap.put(1, "one");
        syncHashMap.put(2, "two");
        System.out.println(syncHashMap);
    }
}
