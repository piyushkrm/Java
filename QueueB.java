public class QueueB {
    static class Queue {
        static int array[];
        static int size;
        // rear
        static int rear;

        Queue(int size) { // queue constructor
            this.size = size;
            array = new int[size];
            rear = -1;
        }

        public static boolean isEmpty() { // check queue is empty
            return rear == size - 1;
        }

        public static boolean isFull() {
            return rear == size - 1;
        }

        // add (enqueue)
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Overflow");
                return;
            }
            array[++rear] = data;
        }

        // delete/remove (dequeue)
        public static int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int front = array[0];
            for (int i = 0; i < rear; i++) {
                array[i] = array[i + 1];
            }
            rear--;
            return front;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return array[0];
        }

    }

    public static void main(String[] args) {
        Queue que = new Queue(5);
        que.add(1);
        que.add(2);
        que.add(3);
        System.out.println(que.dequeue());
        System.out.println(que.peek());
    }

}
