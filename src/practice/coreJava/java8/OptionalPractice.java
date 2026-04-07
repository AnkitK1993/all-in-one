package practice.coreJava.java8;

import java.util.*;

public class OptionalPractice {

    public static void main(String[] args) {
        optPractice();
    }

    private static void optPractice() {
        System.out.println("OptPractice");

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");

        Optional<String> num = Optional.ofNullable(map.get(0));

        if (num.isPresent())
            System.out.println(num.get());
        else
            System.out.println(num.orElse("Absent"));

    }


}

