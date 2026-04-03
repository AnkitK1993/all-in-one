package practice.dsa.stringsAndArrays;

public class LongestContiguousIncreasingSubsequence674 {
    public static void main(String[] args) {
        System.out.println(findLengthOfLCIS(new int[]{1, 3, 5, 4, 7}));
    }

    static int findLengthOfLCIS(int[] nums) {
        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else
                currentLength = 1;
        }
        return maxLength;
    }
}
