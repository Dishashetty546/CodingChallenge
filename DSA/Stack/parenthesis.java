package Stack;

import java.util.Stack;

class parenthesis {
    public static void main(String[] args) {
        String s = "()";
        System.out.println(stack(s));

    }

    public static boolean stack(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray())

        {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }

        }
        return true;
    }
}