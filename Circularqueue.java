public class Circularqueue {
    static class Queue {
        static int array[];
        static int size;
        static int front = -1;
        static int rear = -1;

        Queue(int size) {
            this.size = size;
            array = new int[size];
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        public static void add(int data) {
            if (isFull()) {
                System.out.println("Overflow");
                return;
            }

            // if its the 1st element
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            array[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int result = array[front];

            // if only 1 element is present
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }

            return result;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return array[front];
        }
    }

    public static void main(String[] args) {
        Queue que = new Queue(10);
        que.add(50);
        que.add(11);
        que.add(15);
        que.add(10);
        que.add(19);
        que.add(20);
        que.add(30);
        System.out.println(que.remove());
        que.add(45);
        System.out.println(que.remove());
        que.add(59);

        while (!que.isEmpty()) {
            System.out.println(que.remove());
        }
    }
}
