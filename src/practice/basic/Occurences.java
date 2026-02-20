package practice.basic;

import java.util.HashMap;

public class Occurences {
    public static void main(String[] args) {
        String s = "mediterranean";
        HashMap<Character,Integer> map = new HashMap<>();
        for (char c: s.toCharArray()) {
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
                map.put(c,1);
        }
        map.entrySet().stream().forEach(System.out::println);
    }
}
