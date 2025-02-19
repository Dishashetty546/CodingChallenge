package Challenges.LEETCODECHALLENGE;
//queue using 2 stack

//approach 1:
//stack- lifo
//queue - fifo

import java.util.Stack;

public class FOURTYTWO {
    static Stack<Integer> input = new Stack<>();
    static Stack<Integer> output = new Stack<>();

    public static void main(String[] args) {
        enqueue(1);
        enqueue(2);
        System.out.println("Peek: " + peek()); // Should print 1
        enqueue(70);
        System.out.println("Dequeue: " + dequeue()); // Should print 1
        enqueue(0);
        System.out.println("Peek after enqueueing 0: " + peek()); // Should print 2
    }

    public static void enqueue(int num) {
        input.push(num);
    }

    public static int dequeue() {
        // Ensure output stack has elements to pop
        return peek(); // No need to call peek here separately, it will call peek and pop
    }

    public static int peek() {
        // If output stack is empty, transfer elements from input stack to output stack
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
        return output.peek(); // Returns the front of the queue
    }

    public static boolean isEmpty() {
        return input.isEmpty() && output.isEmpty();
    }
}
