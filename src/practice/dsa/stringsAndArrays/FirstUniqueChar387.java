package practice.dsa.stringsAndArrays;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstUniqueChar387 {
    public static void main(String[] args) {
        String s = "leeltcode";
        System.out.println(firstUniqueChar(s));
    }

    static int firstUniqueChar(String s) {
        int[] frequency = new int[26];
        int n = s.length() - 1;

        for (int i = 0; i < n; i++) {
            int charIndex = s.charAt(i)-'a';
            frequency[charIndex]++;
        }
        for (int i = 0; i < n; i++) {
            int charIndex = s.charAt(i)-'a';
            if (frequency[charIndex] == 1) {
                return i;
            }
        }
        return -1;
    }
}
