package practice.dsa.stringsAndArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseWords151 {

    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        List<String> wordList = new ArrayList<>();
        int length = s.length();

        for (int index = 0; index < length; ) {
            while (index < length && s.charAt(index) == ' ') {
                index++;
            }

            if (index < length) {
                StringBuilder currentWord = new StringBuilder();
                int wordStartIndex = index;
                while (wordStartIndex < length && s.charAt(wordStartIndex) != ' ') {
                    currentWord.append(s.charAt(wordStartIndex));
                    wordStartIndex++;
                }
                wordList.add(currentWord.toString());
                index = wordStartIndex;
            }
        }
        Collections.reverse(wordList);

        return String.join(" ", wordList);
    }
}
