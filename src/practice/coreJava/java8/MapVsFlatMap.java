package practice.coreJava.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ankit","Snehal");
        List<Integer> nameLength = names.stream().map(String::length).collect(Collectors.toList());
        System.out.println("Map Result:");
        nameLength.stream().forEach(System.out::println);

        List<List<Integer>> numbers = Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5,6),Arrays.asList(7,8,9));
        List<Integer> collectedNumbers = numbers.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println("FlatMap Result:");
        collectedNumbers.stream().forEach(System.out::println);
    }
}
