package practice.dsa.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

    public static void main(String[] args) {
        String s = "CODINGISAWESOME";
        String longestSubstring = findLongestSubstring(s);
        System.out.println("Input String: " + s);
        System.out.println("Longest substring without repeating characters: " + longestSubstring);
    }

    public static String findLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        
        Map<Character, Integer> charMap = new HashMap<>();
        int left = 0;
        int maxLen = 0;
        int maxStart = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            if (charMap.containsKey(ch)) {
                left = Math.max(left, charMap.get(ch) + 1);
            }

            charMap.put(ch, right);

            int currentLen = right - left + 1;
            if (currentLen > maxLen) {
                maxLen = currentLen;
                maxStart = left;
            }
        }
        
        return s.substring(maxStart, maxStart + maxLen);
    }
}
