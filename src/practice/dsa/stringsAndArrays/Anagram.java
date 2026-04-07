package practice.dsa.stringsAndArrays;

import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "ankit";
        String s2 = "nkita";

        System.out.println(checkAnagram(s1, s2));
    }

    private static boolean checkAnagram(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char ch : s1.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        for (char ch : s2.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) - 1);
        }

        charCount.forEach((k,v)->System.out.println("Key : " + k + " || value : " + v));

        return !charCount.values().stream().anyMatch(x -> x != 0);
    }
}
