package Dreamer.DSA.Stackk;

import java.util.*;

public class validparenthesis {
    public static void main(String[] args) {
        String s = "(){}";
        System.out.print(parenthesis(s));

    }

    public static boolean parenthesis(String s) {
        Stack<Character> stack = new Stack<>();
        char[] c = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (c[i] == '(') {
                stack.push(')');

            } else if (c[i] == '{') {
                stack.push('}');
            } else if (c[i] == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c[i]) {
                return false;

            }
        }
        return stack.isEmpty();

    }

}
