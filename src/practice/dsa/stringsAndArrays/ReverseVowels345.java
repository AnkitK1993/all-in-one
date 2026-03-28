package practice.dsa.stringsAndArrays;

public class ReverseVowels345 {
    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseVowels(s));
    }

    static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        boolean[] isVowel = new boolean[128];
        for (char vowel : "aeiouAEIOU".toCharArray())
            isVowel[vowel] = true;

        while (left < right) {
            while (left < right && !isVowel[chars[left]])
                left++;
            while (left < right && !isVowel[chars[right]])
                right--;

            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;

                left++;
                right--;

            }
        }
        return String.valueOf(chars);
    }
}
