package practice.dsa.stringsAndArrays;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements347 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int[] op = topKFrequent(nums, 2);
        for (int i : op)
            System.out.print(i + " ");
    }

    static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums)
            frequencyMap.merge(num, 1, Integer::sum);

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {

            minHeap.offer(entry);

            if (minHeap.size() > k)
                minHeap.poll();
        }
        return minHeap.stream().mapToInt(Map.Entry::getKey).toArray();
    }

}
