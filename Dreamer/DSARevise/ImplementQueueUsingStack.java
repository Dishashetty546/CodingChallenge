package Dreamer.DSARevise;
//queue operations

//push()
//pop()
//peek()
//isEmpty()
//using stack

//Approach
//createing 2 stacks
//input stack
//output stack
//stack - LIFO
//queue - FIFO
//
//[1,2,3,4,5]---input
//input stack - []
//output stack - []

//normal queue - []

//queue - 

import java.util.Stack;

public class ImplementQueueUsingStack {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.push(10);
        queue.push(20);
        queue.push(30);
        System.out.println("Popped: " + queue.pop());
        System.out.println("Peek: " + queue.peek());
        System.out.println("Is empty: " + queue.isEmpty());
    }

    static class Queue {
        private Stack<Integer> istack = new Stack<>();
        private Stack<Integer> ostack = new Stack<>();

        public void push(int x) {
            istack.push(x);
        }

        public int pop() {
            peek(); // Ensures ostack has the correct order
            return ostack.pop();
        }

        public int peek() {
            if (ostack.isEmpty()) {
                while (!istack.isEmpty()) {
                    ostack.push(istack.pop());
                }
            }
            return ostack.peek();
        }

        public boolean isEmpty() {
            return istack.isEmpty() && ostack.isEmpty();
        }
    }
}
