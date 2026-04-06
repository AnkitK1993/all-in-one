package practice.dsa.stringsAndArrays;

public class RemoveElement {
    public static void main(String[] args) {
        int nums[] = {3,2,2,3};
        int val = 2;

        System.out.println("Res : " + removeElement(nums,val));
    }

    private static int removeElement(int[] nums, int val) {
        int valCount = 0;

        for(int currNum : nums){
            if(currNum != val){
                nums[valCount] = currNum;
                valCount++;
            }
        }
        for (int i: nums)
            System.out.print(i + " ");
        return valCount;
    }
}
