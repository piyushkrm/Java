import java.util.List;

class LinkedlistProblems {
    public class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

    public static ListNode removeNthEleFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }

        // size
        int size = 0;
        ListNode current = head;
        while (current != null) {
            current = current.next;
            size++;
        }

        if (n == size) {
            return head.next;
        }

        int indexToSearch = size - n;
        ListNode previous = head;
        int i = 0;
        while (i < indexToSearch) {
            previous = previous.next;
            i++;
        }
        previous.next = previous.next.next;
        return head;
    }
    public static void main(String[] args) {
        removeNthEleFromEnd(null, 0);
    }

}
