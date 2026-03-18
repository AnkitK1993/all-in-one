package practice.basic;

import java.util.Map;
import java.util.stream.Collectors;

public class Occurences {
    public static void main(String[] args) {
        String s = "mediterranean";
        Map<Character, Long> map = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        map.forEach((k, v) -> System.out.println("Key : " + k + " || value : " + v));
    }
}
