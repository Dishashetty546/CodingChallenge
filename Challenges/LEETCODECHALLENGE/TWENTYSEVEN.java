package LEETCODECHALLENGE;

//valid parenthesis
//ex:{}
//o/p: true
//steps:
//step1:store all elements in stack-last in first out
//step2: using stack last in first out  
//so once we get open parenthesis we push into stack , another closing bracket if we get, we pop it out
//for each iteration , same thing applies, lastly if stack is empty
//return true , else false
import java.util.Stack;

public class TWENTYSEVEN {
    public static void main(String[] args) {
        String s = "{{}}";
        System.out.println(parenthesis(s));

    }

    public static boolean parenthesis(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);

            } else if (!stack.isEmpty() && ch == '}' && stack.peek() == '{') {
                stack.pop();
            } else if (!stack.isEmpty() && ch == ']' && stack.peek() == '[') {
                stack.pop();
            } else if (!stack.isEmpty() && ch == ')' && stack.peek() == '(') {
                stack.pop();
            } else {
                return false;
            }

        }
        return true;

    }

}
