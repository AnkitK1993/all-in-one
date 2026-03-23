package practice.basic;

public class LongestContiguousArray {
    public static void main(String[] args) {
        int[] prices = {100,80,60,70,60,75,85,80};
        //output should be {60,75,85}
        int[] output = longestContiguousArray(prices);
        for(int value : output){
            System.out.println(value);
        }
    }

    static int[] longestContiguousArray(int[] input){
        int maxLength = 1;
        int startIndex = 0;
        int currentLength = 1;

        for(int i=1; i<input.length; i++){
            if(input[i] > input[i-1]){
                currentLength++;
            }else{
                if(currentLength > maxLength){
                    maxLength = currentLength;
                    startIndex = i - currentLength;
                }
                currentLength = 1;
            }
        }

        // Check at the end of the array
        if(currentLength > maxLength){
            maxLength = currentLength;
            startIndex = input.length - currentLength;
        }

        int[] result = new int[maxLength];
        System.arraycopy(input, startIndex, result, 0, maxLength);
        return result;
    }
}
