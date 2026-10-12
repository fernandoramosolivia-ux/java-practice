package datastructures;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackExample {

    public static void main(String[] args) {

        Deque<String> stack = new ArrayDeque<>();

        // Push elements
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");

        System.out.println("Stack: " + stack);

        // View top element
        System.out.println("Top element: " + stack.peek());

        // Remove top element
        String removed = stack.pop();
        System.out.println("Removed: " + removed);

        System.out.println("Stack after pop: " + stack);

        // Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
