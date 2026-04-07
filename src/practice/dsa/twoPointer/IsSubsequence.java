package practice.dsa.twoPointer;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "adsfbertrecgerge";

        System.out.println(isSubsequence(s,t));
    }

    private static boolean isSubsequence(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();

        int sPointer = 0;
        int tPointer = 0;

        while(sPointer < sLength && tPointer < tLength){
            if(s.charAt(sPointer) == t.charAt(tPointer))
                sPointer++;
            tPointer++;
        }
        return sPointer == sLength;
    }
}
