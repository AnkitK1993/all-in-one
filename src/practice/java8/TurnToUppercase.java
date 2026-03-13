package practice.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TurnToUppercase {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ankit","Snehal","Aniket","Komal");

        List<String> upperCase = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        upperCase.forEach(System.out::println);
    }
}
