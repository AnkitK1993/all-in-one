package practice.dsa.stringsAndArrays;

public class RemoveDupsFromSortedArr {
    public static void main(String[] args) {

        int nums[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDupsFromSortedArr(nums));

    }

    private static int removeDupsFromSortedArr(int[] nums) {
        int valNums = 0;

        for (int i = 1; i < nums.length; i++) {
            if (valNums == 0 || nums[i] != nums[i - 1]) {
                nums[valNums] = nums[i];
                valNums++;
            }
        }
        return valNums;
    }

}
