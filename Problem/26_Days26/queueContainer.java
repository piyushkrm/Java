import java.util.LinkedList;
import java.util.Queue;

public class queueContainer {

    // Print the elements of the queue
    public static void printQueue(Queue<Integer> queue) {
        for (int qu : queue) {
            System.out.print(qu + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a queue container
        Queue<Integer> queue = new LinkedList<>();

        // Add element on the queue
        queue.add(1);
        queue.add(1);
        queue.add(2);
        queue.add(43);
        queue.add(88);
        queue.add(5);
        // Print the queue
        printQueue(queue);

        // Remove element from the queue
        System.out.println("Removed element: " + queue.remove());

        // Peak element of the queue
        System.out.println("Peek element: " + queue.peek());

        // Size of the queue
        System.out.println("Size of the queue: " + queue.size());

        // Is empty queue or not
        System.out.println("Is queue empty? " + queue.isEmpty());

    }
}
