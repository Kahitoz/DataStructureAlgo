import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BST_insert {
    Node root;

    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    public void level_order(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {

            Node current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }

        }
    }

    public void inorder(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node pointer = root;
        while (!stack.isEmpty() || pointer != null) {
            if (pointer != null) {
                stack.push(pointer);
                pointer = pointer.left;
            } else {
                pointer = stack.pop();
                System.out.print(pointer.data + " ");
                pointer = pointer.right;
            }
        }
    }

    public static void main(String[] args) {
        BST_insert bst = new BST_insert();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            bst.insert(value);
        }
        System.out.println("Level Order Result - >");
        bst.level_order(bst.root);
        System.out.println("\nIn Order Result - >");
        bst.inorder(bst.root);
        scanner.close();
    }
}
