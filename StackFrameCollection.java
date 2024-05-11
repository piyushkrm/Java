import java.util.*;;

public class StackFrameCollection {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Hey");
        stack.push("I");
        stack.push("am");
        stack.push("a");
        stack.push("coder");

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
