import java.util.*;

import javax.swing.tree.TreeNode;

public class BinaryTreesYT {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    // preorder traversal
    public static void preorderTraversal(Node root) {
        if (root == null) {
            // System.out.print(-1+" ");
            return;
        }
        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    // Inorder traversal
    public static void inorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    // postorder traversal
    public static void postorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    // level order traversal
    public static void levelOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currentNode = q.remove();
            if (currentNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currentNode.data + " ");
                if (currentNode.left != null) {
                    q.add(currentNode.left);
                }

                if (currentNode.right != null) {
                    q.add(currentNode.right);
                }
            }
        }
    }

    // node counting
    public static int countOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);

        return leftNodes + rightNodes + 1;
    }

    // sum of node
    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum + rightSum + root.data;
    }

    // sum of node at kth level
    public static int sumOfKthlEVELnODE(Node root, int kth) {
        if (root == null) {
            return 0;
        }
        Queue<Node> que = new LinkedList<>();
        que.add(root);
        int sum = 0;
        int level = 0;
        int flag = 0;

        while (!que.isEmpty()) {
            int size = que.size();
            while (size-- > 0) {
                Node ptr = que.peek();
                que.remove();
                if (level == kth) {
                    flag = 1;
                    sum += ptr.data;
                } else {
                    if (ptr.left != null) {
                        que.add(ptr.left);
                    }

                    if (ptr.right != null) {
                        que.add(ptr.right);
                    }
                }
                level++;
                if (flag == 1) {
                    break;
                }
            }
        }
        return sum;

    }

    // height of Tree
    public static int heightOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        int height = Math.max(leftHeight, rightHeight) + 1;
        return height;
    }

    // diameter of an tree (APPROACH 1)
    public static int diameterOfaTree(Node root) {
        // base case
        if (root == null) {
            return 0;
        }
        // calculate diameter of left
        int leftDiameter = diameterOfaTree(root.left);

        // calculate diameter of right
        int rightDiameter = diameterOfaTree(root.right);

        // calculate maximum heights of left and right subtree
        int maxDiameter = heightOfTree(root.left) + heightOfTree(root.right) + 1;

        // now calculated diameter is
        return Math.max(maxDiameter, Math.max(rightDiameter, leftDiameter));
    }

    // diameter of an tree (APPROACH 1)
    static class treeInfo {
        int height;
        int diameter;

        // constructor of treeInfo class
        treeInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    public static treeInfo diameterOfaTree2(Node root) {
        // base
        if (root == null) {
            return new treeInfo(0, 0);
        }

        // left subtree info
        treeInfo left = diameterOfaTree2(root.left);

        // left subtree info
        treeInfo right = diameterOfaTree2(root.right);

        // max height
        int maxheight = Math.max(left.height, right.height) + 1;

        int leftDiam = left.diameter;
        int rightDiam = right.diameter;
        int leftrightDiam = left.height + right.height + 1;

        // maximum of all
        int max = Math.max(Math.max(leftDiam, rightDiam), leftrightDiam);

        treeInfo myInfo = new treeInfo(maxheight, max);
        return myInfo;
    }

    // subtree of another tree
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static boolean isIdentical(TreeNode root, TreeNode subroot) {
        if (root == null && subroot == null) {
            return true;
        }

        if (root == null || subroot == null) {
            return false;
        }

        if (root.val == subroot.val) {
            return isIdentical(root.left, subroot.left) && isIdentical(root.right, subroot.right);
        }
        return false;
    }

    public boolean isSubtree(TreeNode root, TreeNode subroot) {
        if (root == null) {
            return false;
        }

        if (subroot == null) {
            return true;
        }

        if (root.val == subroot.val) {
            if (isIdentical(root, subroot)) {
                return true;
            }
        }

        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    }

    public static void main(String args[]) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();

        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);
        // preorderTraversal(root);
        // inorderTraversal(root);
        // postorderTraversal(root);
        // levelOrderTraversal(root);
        // System.out.println("Total number or nodes are : "+countOfNodes(root));
        // System.out.println("Total sum of nodes are : "+sumOfNodes(root));
        // System.out.println(heightOfTree(root));
        // System.out.println(diameterOfaTree(root));
        // System.out.println(diameterOfaTree2(root).diameter);

        // System.out.println(isIdentical(null, null));
        System.out.println(sumOfKthlEVELnODE(root, 2));
    }
}