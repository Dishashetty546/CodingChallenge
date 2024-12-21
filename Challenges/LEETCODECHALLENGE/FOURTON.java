package LEETCODECHALLENGE;

import java.util.Stack;
//super redudced string

//brute force approach
//ex: aaabccddd
//first iteration:abccddd
//second iteration:abddd
//third iteration:abd
//here we are iterating through the array every single time - increases time complexity

//approach 2:
//using stack- used to find last char we encountered
//ex: aaabccdd
//push a into stack, then try to push a into stack, a alraedy present on the stack, pop a from stack....continues

public class FOURTON {
    public static void main(String[] args) {
        String str = "aaabccddd";
        System.out.println(missing(str));

    }

    public static String missing(String str) {
        // step 1: iniitialze a stack
        Stack<Character> characterStack = new Stack<>();
        // step 2: iterate through the string
        // three conditions
        // 1. if characterStack is empty, if so push the element from string onto stack
        // 2. if charStack peek / previos element is equal to current element , then pop
        // it
        // 3. if is unique , then push into stack
        for (char c : str.toCharArray()) {
            if (characterStack.isEmpty()) {
                characterStack.push(c);
            } else if (c == characterStack.peek()) {
                characterStack.pop();
            } else {
                characterStack.push(c);
            }
        }
        return characterStack.toString();

    }

}