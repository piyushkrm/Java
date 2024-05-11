class Linkedlist {
    Node head;
    private int size;

    Linkedlist() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        // new node creating
        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add - first, last
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
    }

    // delete - first, last
    public void deleteFirst() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next; // head.next = null ----> lastNode ---> null
        while (lastNode.next != null) { // null.next
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    // Reverse list
    public void reverseIterate() {
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;

        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
        pritList();
    }

    // reverse with recursion
    public Node reverseRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        pritList();
        return newHead;
    }

    // print
    public void pritList() {
        if (head == null) {
            System.out.println("List is Empty!");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " --> ");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
        getSize();
    }

    // print size
    public void getSize() {
        System.out.println("Size of a linked list is : " + size);
    }

    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.addFirst("pihu");
        list.addFirst("piyush");
        list.addFirst("palak");
        list.addFirst("abhinav");
        list.addLast("harsh");
        list.addLast("daisy");
        list.addLast("prasun");

        // list.deleteFirst();
        // list.pritList();
        // list.deleteLast();
        // list.getSize();
        list.pritList();
        list.reverseIterate();
        list.pritList();

        list.pritList();
        list.head = list.reverseRecursive(list.head);
        list.pritList();

    }
}
