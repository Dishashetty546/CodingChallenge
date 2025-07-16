package Dreamer.DSARevise;

import java.util.Stack;

public class ImplementQueueWithStack {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> temp = new Stack<>();

    public static void main(String[] args) {
        ImplementQueueWithStack queue = new ImplementQueueWithStack();
        queue.enqueue(5);
        queue.enqueue(18);
        queue.enqueue(87);
        queue.enqueue(89);
        queue.dequeue();
        queue.enqueue(80);

        System.out.println(queue.Front()); // Should print 18
        System.out.println(queue.isEmpty()); // Should print false
    }

    public void enqueue(int x) {
        stack.push(x);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        transferStacks(stack, temp);
        int frontElement = temp.pop();
        transferStacks(temp, stack);
        return frontElement;
    }

    public int Front() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        transferStacks(stack, temp);
        int frontElement = temp.peek();
        transferStacks(temp, stack);
        return frontElement;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    private void transferStacks(Stack<Integer> source, Stack<Integer> destination) {
        while (!source.isEmpty()) {
            destination.push(source.pop());
        }
    }
}
