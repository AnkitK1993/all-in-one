package practice.basic;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Occurence {

    public static void main(String[] args) {
        String s = "Hey there my name is Ankit";
        System.out.println("Input string: " + s);
        //googledMethod(s);
        findNumberOfCharacters(s);

    }

    private static void findNumberOfCharacters(String str) {
        Map<Character, Long> map = str.chars()
                .mapToObj(c ->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);

    }

    private static void googledMethod(String s) {
        // Count characters excluding spaces (case-insensitive)
        String lowered = s.toLowerCase();
        java.util.Map<Character, Integer> counts = new java.util.LinkedHashMap<Character, Integer>();
        int total = 0;
        for (int i = 0; i < lowered.length(); i++) {
            char c = lowered.charAt(i);
            if (c == ' ') continue;
            total++;
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }

        System.out.println("Total characters (excluding spaces): " + total);
        System.out.println("Character counts (excluding spaces):");
        for (java.util.Map.Entry<Character, Integer> e : counts.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
