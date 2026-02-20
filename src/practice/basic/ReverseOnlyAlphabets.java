package practice.basic;

public class ReverseOnlyAlphabets {
    public static void main(String[] args) {
        String str = "A*BC@D#E";
        System.out.println("Original String          : " + str);
        //reverse only alphabets in a string and display the result
        char[] arr = str.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (!Character.isAlphabetic(arr[left])) {
                left++;
            } else if (!Character.isAlphabetic(arr[right])) {
                right--;
            } else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        String result = new String(arr);
        System.out.println("Reversed alphabets string: " + result);
    }
}
