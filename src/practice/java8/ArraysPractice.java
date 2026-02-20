package practice.java8;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {
        int[] numbers = {0,1,2,3,4,5,6,7,8,9};

        Arrays.stream(numbers).limit(5).forEach(System.out::println);
        System.out.println("##################################################");
        Arrays.stream(numbers).sorted().skip(1).limit(1).forEach(System.out::println);


    }
}
