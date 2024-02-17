package week16_OfiiceHours_Saturday;

import java.util.*;

public class ExampleStackQueue {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>(); // LIFO
        stack.push("hello");
        stack.push("four");
        stack.push("10");
        stack.push("hello");
        stack.push("$java");

        System.out.println(stack);

        // what is at the top?
        System.out.println(stack.peek());

        stack.pop();

        System.out.println(stack);
        System.out.println(stack.peek());

        System.out.println(stack.pop()); // removes the element at the top of the stack and returns it


        System.out.println("-------------------");

        Queue<String> queue = new ArrayDeque<>(); // FIFO
        queue.offer("hello");
        queue.offer("four");
        queue.offer("10");
        queue.offer("hello");
        queue.offer("$java");

        System.out.println(queue);
        System.out.println(queue.poll()); // removes from the beginning of the queue and returns that elements
        System.out.println(queue);
        System.out.println(queue.peek());

        System.out.println(((Deque) queue).peekLast()); // deque gives access to the beginning or end

    }
}