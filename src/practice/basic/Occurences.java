package practice.basic;

import java.util.Map;
import java.util.stream.Collectors;

public class Occurences {
    public static void main(String[] args) {
        String s = "mediterranean";
        System.out.println(test());
    }

    static Map<Character,Long> test(){
        return "ANKITKONCHADY".chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));
    }
}
