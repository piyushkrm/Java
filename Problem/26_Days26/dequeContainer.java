
// Deque container

import java.util.ArrayDeque;
import java.util.Deque;

public class dequeContainer {

    // Print the qeque elements
    public static void printDeque(Deque<Integer> deque) {
        for (int deq : deque) {
            System.out.print(deq + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create deque
        Deque<Integer> deque = new ArrayDeque<>();

        // Add element at the beginning
        deque.addFirst(15);
        deque.addFirst(21);
        printDeque(deque);

        // Add element at the end of deque
        deque.addLast(10);
        deque.addLast(20);
        printDeque(deque);

        // Remove first element
        deque.removeFirst();
        printDeque(deque);

        // Remove last element
        deque.removeLast();
        printDeque(deque);

        // Peak first element
        System.out.println("Peak first element : " + deque.peekFirst());

        // Peak last element
        System.out.println("Peak last element : " + deque.peekLast());

        // Size of the deque
        System.out.println("Size of the deque : " + deque.size());

    }

}