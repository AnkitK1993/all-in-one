package practice.dsa.twoPointer;

public class twoSumSortedArr {
    public static void main(String[] args) {
        int nums[] = {2, 7, 11, 15};
        int k = 9;
        int op[] = findPair(nums, k);
        for (int i : op)
            System.out.print(i + " ");
    }

    private static int[] findPair(int[] nums, int k) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            int diff = k - nums[i];

            int left = i + 1;
            int right = n - 1;
            int firstTrueIndex = -1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (nums[mid] >= diff) {
                    firstTrueIndex = mid;
                    right = mid - 1;
                } else
                    left = mid + 1;
            }
            if (firstTrueIndex != -1 && nums[firstTrueIndex] == diff)
                return new int[]{i + 1, firstTrueIndex + 1};
        }
        return new int[]{};
    }
}
