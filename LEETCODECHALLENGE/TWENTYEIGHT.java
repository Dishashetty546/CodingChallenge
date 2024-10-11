package LEETCODECHALLENGE;
//Evaluate reverse polish Notation

//array of strings- tokens
//reverse polish notation- post fix notation
//EX: i/p: {"2","1","+","3","+"}
//o/p: 9
//((2+1)+3)=>9

//steps
//step1:create a stack to store
//start iterating from left to right
//as soon as we find an operator, pop the operand
//find integer, add into the stack
//step2: after popping an element from the stack , store values in an variable say num2
//num2: value, num1: value, num1 operator num2
import java.util.Stack;

public class TWENTYEIGHT {

    public static void main(String[] args) {
        String[] str = { "2", "2", "+", "3", "+" };
        System.out.println(eval(str));

    }

    public static int eval(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for (String token : tokens) {
            if (isOperator(token)) {
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
            }

            else {
                stack.push(token);
            }

        }
        return Integer.parseInt(stack.peek());
    }

    public static boolean isOperator(String str) {
        if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")) {
            return true;
        }
        return false;

    }
}
