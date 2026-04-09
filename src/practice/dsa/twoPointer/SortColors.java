package practice.dsa.twoPointer;

public class SortColors {

    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 1, 0, 2, 0};
        int[] sortedNums = dutchFlag(nums);
        for (int color : sortedNums)
            System.out.print(color + " ");
    }

    static int[] dutchFlag(int[] nums) {
        int[] counts = new int[3];

        for (int color : nums)
            counts[color]++;

        int r = counts[0];
        int w = counts[1];

        for (int i = 0; i < r; i++)
            nums[i] = 0;

        for (int i = r; i < r + w; i++)
            nums[i] = 1;

        for (int i = r + w; i < nums.length; i++)
            nums[i] = 2;

        return nums;
    }
}
