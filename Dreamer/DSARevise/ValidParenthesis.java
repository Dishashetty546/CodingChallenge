package Dreamer.DSARevise;

import java.util.*;
//valid parenthesis

//i/p: {}(){}
//o/p: true

//approach
//1. use stack to store the opening brackets
//2. when we encounter a closing bracket, check if the stack is empty or if the top of the stack is not the matching opening bracket
//3. if it is, pop the top of the stack
//4. if the stack is empty at the end, return true, else return false
//5. if the string is empty, return true

//complexity:
//time: O(n)
//space: O(n)
public class ValidParenthesis {
    public static void main(String[] args)

    {
        String s = "()[]{";
        System.out.println(isValid(s));

    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if (top == '(' && ch == ')' || top == '{' && ch == '}' || top == '[' && ch == ']') {
                    stack.pop();
                } else {
                    return false;
                }

            }

        }
        return stack.isEmpty();

    }
}