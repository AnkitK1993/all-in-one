package practice.dsa.prefixSum;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }

    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for(int num : set){
            if(!set.contains(num-1)){
                int length = 1;
                int nextNum = num+1;
                while(set.contains(nextNum)){
                    length++;
                    nextNum++;
                }
                longest = Math.max(longest, length);
                    }
        }
        return longest;
    }
}
