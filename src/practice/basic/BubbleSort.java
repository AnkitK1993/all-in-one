package practice.basic;

public class BubbleSort {

    public static void main(String[] args) {
        int[] input = {5, 2, 4, 3, 3, 7};
        int[] output = sortNumbers(input);
        for (int value : output) {
            System.out.println(value);
        }
    }

    private static int[] sortNumbers(int[] input) {
        int n = input.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (input[j] > input[j + 1]) {
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }
        return input;
    }
}
