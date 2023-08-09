package BinaryTree;
public class BST_create {
    node root;

    public class node {
        node left;
        node right;
        int data;

        public node(int data) {
            this.data = data;
        }
    }

    public node insert(node root, int value) {
        if (root == null) {
            return new node(value);
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    public void inorder(node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }

    public void create_binary_tree(){
        insert(5);
        insert(3);
        insert(7);
        insert(1);
        insert(4);
    }
}
