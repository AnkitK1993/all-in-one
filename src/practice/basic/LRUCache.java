package practice.basic;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {

    private int capacity;

    public LRUCache(int capacity){
        super(capacity,0.75f,true);
        this.capacity=capacity;
    }

    public boolean removeEldestEntry(Map.Entry<K,V> eldest){
        return size() > capacity;
    }

    public static void main(String[] args) {
       LRUCache<String, Integer> studentsMap = new LRUCache<>(3);
       studentsMap.put("Ankit", 90);
       studentsMap.put("Snehal", 99);
       studentsMap.put("Antara", 35);
       studentsMap.get("Ankit");
       studentsMap.put("Yash", 89);

       studentsMap.forEach((k,v)->System.out.println("Key : " + k + " || value : " + v));
    }


}
