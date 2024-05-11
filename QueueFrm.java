import java.util.LinkedList;
import java.util.Queue;

public class QueueFrm {

    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<>();
        // Queue<Integer> qu = new ArrayDeque();
        qu.add(2);
        qu.add(2);
        qu.add(2);
        qu.add(2);
        qu.add(2);
        qu.add(2);

        while (!qu.isEmpty()) {
            System.out.println(qu.peek());
            qu.remove();
        }

        
    }
}