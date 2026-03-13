package practice.java8;

import java.util.Arrays;

public class MaxInteger {

    public static void main(String[] args) {
        int[] nums = {15,64,88,51,94,76,25,34,66,23,12,45,67,89,90};

        int maxInteger = Arrays.stream(nums).max().getAsInt();

        System.out.println(maxInteger);
    }
}
