package practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinWithComma {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ankit","Snehal","Aniket","Komal");

        String joinNames = names.stream()
                .collect(Collectors.joining(","));

        System.out.println(joinNames);
    }
}
