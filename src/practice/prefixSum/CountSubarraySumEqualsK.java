package practice.prefixSum;

import java.util.HashMap;
import java.util.Map;

public class CountSubarraySumEqualsK {

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int k = 6;
        int result = subarraySum(arr, k);
        System.out.println("The number of subarrays is: " + result);
    }

    static int subarraySum(int[] nums, int k) {
        int n = nums.length;

        Map<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            prefixSum += nums[i];
            int remove = prefixSum - k;

            if (prefixSumCount.containsKey(remove)) {
                count += prefixSumCount.get(remove);
            }

            prefixSumCount.put(prefixSum, prefixSumCount.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
    }
}
