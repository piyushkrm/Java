public class BST {
    static class Node {
        int data;
        Node left;
        Node right;
        Node equal;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        // left subtree
        if (root.data > val) {
            root.left = insert(root.left, val);
        }

        // for duplicate values
        if (root.data == val) {
            root.equal = insert(root.right, val);
        }

        // right subtree
        if (root.data < val) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // check bst is correct or not using inorder traversal
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // search BST
    public static boolean search(Node root, int key) {
        if (root == null) { // root is null
            return false;
        }
        if (root.data > key) { // left subtree traversal
            return search(root.left, key);
        }

        if (root.data < key) { // right subtree traversal
            return search(root.right, key);
        }

        if (root.data == key) { // equal to root
            return true;
        }

        return false;
    }

    public static void main(String args[]) {
        int values[] = { 5, 1, 3, 4, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        // inorder(root);
        // System.out.println();

        if (search(root, 1)) {
            System.out.println("Key found");
        } else {
            System.out.println("Key not found");
        }
    }

}
