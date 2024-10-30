import java.util.*;

public class stackContainer {

    // Print stack element
    public static void printStack(Stack<Integer> stack) {
        for (Integer i : stack) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a stack container
        Stack<Integer> stack = new Stack<>();

        // Push element
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(13);
        // Print the stack
        printStack(stack);

        // Pop element
        System.out.println("Popped element: " + stack.pop());
        // Print the stack after popping
        printStack(stack);

        // Peak element
        System.out.println("Peek element: " + stack.peek());
        // Print the stack after peeking
        printStack(stack);

        // Empty
        System.out.println("Is stack empty? " + stack.isEmpty());

    }
}
