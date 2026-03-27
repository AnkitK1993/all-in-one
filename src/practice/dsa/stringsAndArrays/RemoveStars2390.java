package practice.dsa.stringsAndArrays;

public class RemoveStars2390 {

    public static void main(String[] args) {
        String s = "leet**cod*e";
        System.out.println(removeStars(s));
    }

    static String removeStars(String s) {
       StringBuilder sb = new StringBuilder();

       for(char ch : s.toCharArray()){
           if(ch == '*')
               sb.deleteCharAt(sb.length()-1);
           else
               sb.append(ch);
       }
       return sb.toString();
    }
}
