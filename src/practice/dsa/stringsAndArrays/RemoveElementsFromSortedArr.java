package practice.dsa.stringsAndArrays;

public class RemoveElementsFromSortedArr {
    public static void main(String[] args) {

        int nums[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println("\n"+ removeElementsFromSortedArr(nums));

    }

    private static int removeElementsFromSortedArr(int[] nums) {
        int valNums = 0;

        for (int i : nums) {
            if (valNums < 2 || i != nums[valNums - 2]) {
                nums[valNums] = i;
                valNums++;
            }
        }
        for (int i : nums)
            System.out.print(i + " ");
        return valNums;
    }

}
