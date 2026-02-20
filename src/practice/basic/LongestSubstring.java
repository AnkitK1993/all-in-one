package practice.basic;

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int maxLen = 0;
        for(int i=0;i<s.length()-1;i++){
            int len=0;
            for(int j=1;i<s.length();i++){
                if(s.charAt(i)!=s.charAt(j))
                    len++;
            }
            if(len > maxLen)
                maxLen=len;

        }
        System.out.println(maxLen);
    }
}
