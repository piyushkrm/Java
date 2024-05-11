import java.util.Stack;

public class StackQuestion {
    // add element at the bottom of stack
    public static void pushAtBottom(int data, Stack<Integer> stack) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int top = stack.pop();
        pushAtBottom(data, stack);

        stack.push(top);
    }

    // reverse stack
    public static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int top = stack.pop();

        reverse(stack);
        pushAtBottom(top, stack);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(9);
        stack.push(5);
        stack.push(50);
        stack.push(10);
        stack.push(11);
        stack.push(19);
        stack.push(15);

        // pushAtBottom(10, stack);

        reverse(stack);

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
