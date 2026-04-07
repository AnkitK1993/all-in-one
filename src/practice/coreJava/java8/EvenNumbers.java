package practice.coreJava.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbers {

    public static void main(String[] args) {
        int[] nums = {15,64,88,51,94,76,25,34,66,23,12,45,67,89,90};

        List<Integer> evenNumbers = Arrays.stream(nums)
                .filter(n-> n%2==0)
                .boxed()
                .collect(Collectors.toList());

        System.out.println("Even numbers in the array:");
        evenNumbers.forEach(System.out::println);
    }
}
