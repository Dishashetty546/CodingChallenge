package Dreamer.DSARevise;

import java.util.*;
//[2,3,+]
//res = 3

//approach
//push all elements , until you find an operator
//do a function called isoperator, then pop last element and store in num1, and store in num2
//the operator, can be +,-,*,/
//the  using switch operator decide the res
//at the end return the res

//time complexity: O(n)
//space complexity: O(n)
public class EvaluateReversePolishNotation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine()); // consume full line
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextLine().trim();
        }

        System.out.println("Result: " + evaluateRPN(s));
    }

    public static int evaluateRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (isOperator(token)) {
                int num2 = stack.pop();
                int num1 = stack.pop();
                switch (token) {
                    case "+":
                        stack.push(num1 + num2);
                        break;
                    case "-":
                        stack.push(num1 - num2);
                        break;
                    case "*":
                        stack.push(num1 * num2);
                        break;
                    case "/":
                        stack.push(num1 / num2);
                        break;
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    public static boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }
}
