import java.util.PriorityQueue;

public class priorityQueueContainer {

    // Print
    public static void printQueue(PriorityQueue<Integer> queue) {
        for (Integer i : queue) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        // Add elements
        queue.add(5);
        queue.add(3);
        queue.add(9);
        queue.add(7);
        queue.add(1);
        queue.add(2);
        printQueue(queue);

        // remove element
        System.out.println("Removed element: " + queue.remove());
        printQueue(queue);

        // Peak elements
        System.out.println("Peak elements: " + queue.peek());
    }
}
