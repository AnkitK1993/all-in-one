package practice.coreJava.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStartingWithA {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ankit","Snehal","Aniket","Komal");

        List<String> aNames = names.stream()
                .filter(n->n.startsWith("A"))
                .collect(Collectors.toList());

        aNames.forEach(System.out::println);
    }
}
