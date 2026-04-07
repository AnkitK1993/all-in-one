package practice.dsa.stringsAndArrays;

public class Palindrome {
    public static void main(String[] args) {
        int n = 12321;
        System.out.println(palindromeNumber(n));

        String s = "naman";
        System.out.println(palindromeString(s));

    }

    private static boolean palindromeString(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    private static boolean palindromeNumber(int n) {
        int rev = 0;
        int temp = Math.abs(n);

        while (temp != 0) {
            rev = (rev * 10) + (temp % 10);
            temp = temp / 10;
        }

        return (rev == Math.abs(n));
    }

}
