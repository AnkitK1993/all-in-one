package practice.slidingWindow;

public class SlidingWindowMaxSum {

        /**
         * Finds the maximum sum of a subarray of a fixed size k.
         * Time Complexity: O(n) - Single pass through the array.
         * Space Complexity: O(1) - Constant extra space used.
         *
         * @param arr The input array of integers.
         * @param k The size of the subarray (window).
         * @return The maximum sum found.
         */
        public static int findMaxSumSubarray(int[] arr, int k) {
            if (arr == null || arr.length < k) {
                throw new IllegalArgumentException("Array length must be greater than or equal to k");
            }

            int maxSum = 0;
            int currentWindowSum = 0;

            // Calculate sum of the first window
            for (int i = 0; i < k; i++) {
                currentWindowSum += arr[i];
            }
            maxSum = currentWindowSum;

            // Slide the window across the rest of the array
            for (int i = k; i < arr.length; i++) {
                // Add the new element to the window
                currentWindowSum += arr[i];
                // Subtract the element leaving the window
                currentWindowSum -= arr[i - k];

                // Update maxSum if current window sum is greater
                maxSum = Math.max(maxSum, currentWindowSum);
            }

            return maxSum;
        }

        public static void main(String[] args) {
            int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
            int k = 3;
            System.out.println("Array: " + java.util.Arrays.toString(arr));
            System.out.println("Window Size (k): " + k);
            // Expected output: 16 (from subarray [5, 3, 6, 7]'s last window [3, 6, 7])
            System.out.println("Maximum Sum of Subarray of size " + k + ": " + findMaxSumSubarray(arr, k));

            int[] arr2 = {5, 2, -1, 0, 3};
            int k2 = 3;
            System.out.println("\nArray: " + java.util.Arrays.toString(arr2));
            System.out.println("Window Size (k): " + k2);
            // Expected output: 6 (from subarray [5, 2, -1])
            System.out.println("Maximum Sum of Subarray of size " + k2 + ": " + findMaxSumSubarray(arr2, k2));
        }
    }
