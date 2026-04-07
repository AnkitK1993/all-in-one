package practice.coreJava.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class IntermediatePractice {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5,2,9,4,6,1,3,7,0,8);
        numbers.forEach(System.out::print);
        System.out.println("\nSorted List");
        numbers.stream().sorted(Integer::compare).forEach(System.out::print);
        System.out.println("\nReverse Sorted List");
        numbers.stream().sorted(Collections.reverseOrder()).forEach(System.out::print);
        System.out.println("\nReduce functionality");
        int sum = numbers.stream().reduce((a,b)-> a+b).get();
        System.out.println("Sum : " + sum);
        int num = numbers.stream().mapToInt(x -> x).sum();
        System.out.println("Sum Optimized : " + num);
        removeNulls();
    }

    private static void removeNulls() {
        List<String> list = Arrays.asList("one", null, "two", null, "three");
        System.out.println("List with null values\n" + list);
        System.out.println("Removing null values");
        List<String> list2 = list.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
        System.out.println(list2);
    }
}
