package practice.Prepration;

import java.util.Stack;

public class Palindrom {

    public static boolean isBalancedString (String input) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == '(' || input.charAt(i) == '{' || input.charAt(i) == '['){
                stack.push(input.charAt(i));
            }
            if(input.charAt(i) == ')') {
                if(stack.empty() || stack.peek() != '(')
                    return false;
                stack.pop();
            }
            if(input.charAt(i) == '}') {
                if(stack.empty() || stack.peek() != '{')
                    return false;
                stack.pop();
            }
            if(input.charAt(i) == ']') {
                if(stack.empty() || stack.peek() != '[')
                    return false;
                stack.pop();
            }
        }
        if(!stack.empty())
            return false;
        return true;
    }
    // malayalam
    public static void main(String[] args) {
        String test = "xabay";
//        System.out.println(getPalindrome(test));

    }
}
