package practice.dsa.stringsAndArrays;

public class MajorityElement {

    public static void main(String[] args) {
        int nums[] = {2, 3, 3, 1, 1, 3, 1, 2, 3, 1};
        System.out.println(majorityElement(nums));
    }

    private static int majorityElement(int[] nums) {
        int element = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                element = num;
                count = 1;
            } else {
                if (element == num)
                    count++;
                else
                    count--;
            }
        }
        return element;
    }
}
