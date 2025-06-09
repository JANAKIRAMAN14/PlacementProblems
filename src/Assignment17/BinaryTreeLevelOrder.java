package Assignment17;
import java.util.*;

class BinaryTreeLevelOrder {
    static class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
        }
    }

    // Function to build the tree using level order input
    public static Node buildTreeLevelOrder(Scanner sc) {
        System.out.println("Enter root value:");
        int rootData = sc.nextInt();
        if (rootData == -1) return null;

        Node root = new Node(rootData);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            System.out.println("Enter left child of " + current.data + ":");
            int leftData = sc.nextInt();
            if (leftData != -1) {
                current.left = new Node(leftData);
                queue.add(current.left);
            }

            System.out.println("Enter right child of " + current.data + ":");
            int rightData = sc.nextInt();
            if (rightData != -1) {
                current.right = new Node(rightData);
                queue.add(current.right);
            }
        }
        return root;
    }

    // Level Order Traversal
    public static void levelOrder(Node root) {
        if (root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        System.out.print("Level Order Traversal: ");
        while (!queue.isEmpty()) {
            Node curr = queue.poll();
            System.out.print(curr.data + " ");
            if (curr.left != null) queue.add(curr.left);
            if (curr.right != null) queue.add(curr.right);
        }
        System.out.println();
    }

    // Problem Statement 2: Count Leaf Nodes
    public static int countLeafNodes(Node root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        return countLeafNodes(root.left) + countLeafNodes(root.right);
    }

    // Problem Statement 3: Height of Binary Tree
    public static int height(Node root) {
        if (root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        return 1 + Math.max(left, right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node root = buildTreeLevelOrder(sc);

        levelOrder(root);
        System.out.println("Number of Leaf Nodes: " + countLeafNodes(root));
        System.out.println("Height of Tree: " + height(root));
    }
}
