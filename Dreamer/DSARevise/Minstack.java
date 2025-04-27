package Dreamer.DSARevise;

import java.util.Stack;
//minstack

//design a stack that supports push,pop,peek and retreiving minimum element 
//pop(),push(),pop(),top(),getMin() in O(1) time complexity

//approach:

//pop(),peek(),push() operations are done in O(1) time complexity - easily
//getMin() , is done by taking another stack where we push the elements and check if element is less then the min elemeent
//which is done O(n) time complexity
public class Minstack {
    Stack<Integer> stack;
    Stack<Integer> tempstack;

    public static void main(String[] args) {
        Minstack min = new Minstack();
        min.push(1);
        min.push(2);
        min.push(4);
        min.push(3);
        min.push(0);
        min.push(5);
        System.out.println(min.getMin());
        System.out.println(min.stack.peek());
        System.out.println(min.stack.pop());

    }

    public Minstack() {
        stack = new Stack<>();
        tempstack = new Stack<>();

    }

    public int push(int val) {
        return stack.push(val);

    }

    public int top() {
        return stack.peek();
    }

    public void pop() {
        stack.pop();
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        while (!stack.isEmpty()) {
            int curr = stack.pop();
            if (curr < min) {
                min = curr;

            }
            tempstack.push(curr);

        }
        while (!tempstack.isEmpty()) {
            stack.push(tempstack.pop());

        }
        return min;
    }

}
