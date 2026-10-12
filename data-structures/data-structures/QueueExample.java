package datastructures;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        Queue<String> queue = new ArrayDeque<>();

        // Add elements
        queue.offer("Client A");
        queue.offer("Client B");
        queue.offer("Client C");

        System.out.println("Queue: " + queue);

        // View first element
        System.out.println("First element: " + queue.peek());

        // Remove first element
        String removed = queue.poll();
        System.out.println("Removed: " + removed);

        System.out.println("Queue after poll: " + queue);

        // Check if queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
