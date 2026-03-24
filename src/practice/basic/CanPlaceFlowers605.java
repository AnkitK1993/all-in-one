package practice.basic;

public class CanPlaceFlowers605 {
    public static void main(String[] args) {
        int[] input = {1,0,0,0,1};
        int n = 1;
        System.out.println(canPlaceFlowers(input,n));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int length = flowerbed.length;
        for (int i = 0; i < length; i++) {
            if (flowerbed[i] == 0) {
                boolean emptyLeft = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyRight = (i == length - 1) || (flowerbed[i + 1] == 0);
                if (emptyLeft && emptyRight) {
                    flowerbed[i] = 1;
                    count++;
                    if (count >= n) return true;
                }
            }
        }
        return count >= n;

    }
}
