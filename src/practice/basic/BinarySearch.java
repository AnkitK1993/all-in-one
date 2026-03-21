package practice.basic;

public class BinarySearch {

    public static void main(String[] args) {
        int [] numbers = {4,7,12,33,47,66,88,109};
       int index = binarySearch(numbers,47);
        System.out.println("Index : " + index);
        System.out.println("Value : " + numbers[index]);
    }

    public static int binarySearch(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (numbers[mid] == target)
                return mid;
            else if (numbers[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
}
