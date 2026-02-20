package practice.basic;

public class Reverse {
    public static void main(String[] args) {
        String s = "ankit";
        reverseString(s);

        int n = 123456789;
        reverseNumber(n);

    }

    private static void reverseString(String s) {
        int l = s.length() - 1;
        String sRev = "";
        for (int i = l; i >= 0; i--)
            sRev = sRev.concat(String.valueOf(s.charAt(i)));
        System.out.println(sRev);
    }

    private static void reverseNumber(int n) {
        int rev = 0;
        while (n > 0) {
            rev = (rev * 10) + (n % 10);
            n = n / 10;
        }
        System.out.println(rev);
    }
}
