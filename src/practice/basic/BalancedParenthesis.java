package practice.basic;

import java.util.Stack;

public class BalancedParenthesis {

    public static void main(String args[]) {

            System.out.println(balancedParenthesis("{(a,b)}"));
            System.out.println(balancedParenthesis("{(a},b)"));
            System.out.println(balancedParenthesis("{)(a,b}"));
    }

    public static boolean balancedParenthesis(String s) {
        Stack<Character> stack  = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }else if(ch == ')' && (stack.isEmpty() || stack.pop()!='(')){
                    return false;
            }else if(ch == ']' && (stack.isEmpty() || stack.pop()!='[')){
                    return false;
            }else if(ch == '}' && (stack.isEmpty() || stack.pop()!='{')){
                    return false;
                }
        }
        return stack.isEmpty();
    }
}
