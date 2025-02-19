package Dreamer.DSA.Stackk;

import java.util.*;

public class reversepolish {
    public static void main(String[] args) {
        String[] s = { "2", "1", "+", "3", "*" };
        System.out.println(polish(s));

    }

    public static int polish(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for (String token : tokens) {
            if (isoperator(token)) {
                int num2 = Integer.parseInt(stack.pop());
                int num1 = Integer.parseInt(stack.pop());
                int result = 0;
                if (token.equals("+")) {
                    result = num1 + num2;
                } else if (token.equals("-")) {
                    result = num1 - num2;

                } else if (token.equals("*")) {
                    result = num1 * num2;

                } else if (token.equals("/")) {
                    result = num1 / num2;

                }
                stack.push(Integer.toString(result));

            } else {
                stack.push(token);
            }
        }
        return Integer.parseInt(stack.peek());

    }

    private static boolean isoperator(String str) {
        if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
            return true;
        } else {
            return false;
        }
    }

}
