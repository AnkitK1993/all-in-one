package practice.dsa.slidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

    public static void main(String[] args) {
        String s = "CODINGISAWESOME";
        
        //Find the longest substring without repeating characters such that output is CODING
        String longestSubstring = findLongestSubstring(s);
        System.out.println("Input String: " + s);
        System.out.println("Longest substring without repeating characters: " + longestSubstring);
    }
    
    /**
     * Using Sliding Window approach to find longest substring without repeating characters
     * Time Complexity: O(n)
     * Space Complexity: O(min(m, n)) where m is character set size
     */
    public static String findLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        
        Map<Character, Integer> charMap = new HashMap<>(); // Store character and its last seen index
        int left = 0;
        int maxLen = 0;
        int maxStart = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            
            // If character is already in the current window, move left pointer
            if (charMap.containsKey(ch)) {
                left = Math.max(left, charMap.get(ch) + 1);
            }
            
            // Update the character's last seen position
            charMap.put(ch, right);
            
            // Update max length and starting position if current window is larger
            int currentLen = right - left + 1;
            if (currentLen > maxLen) {
                maxLen = currentLen;
                maxStart = left;
            }
        }
        
        return s.substring(maxStart, maxStart + maxLen);
    }
}
