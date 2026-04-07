package practice.coreJava;

import java.util.*;
import java.util.stream.Collectors;

public class KMaxElements {
    int[] nums = {1,1,1,2,2,3,3,3,3,4};
    int k=3;
    
    public static void main(String[] args) {
        KMaxElements obj = new KMaxElements();
        List<Integer> result = obj.topKFrequent();
        System.out.println("Top " + obj.k + " most frequent elements: " + result);
    }
    
    // Find the K most frequent elements using Stream API
    public List<Integer> topKFrequent() {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((a, b) -> Long.compare(b.getValue(), a.getValue()))
                .limit(k)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
