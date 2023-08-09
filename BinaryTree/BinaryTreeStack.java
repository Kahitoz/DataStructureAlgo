package BinaryTree;
public class BinaryTreeStack {
    BinaryTree binaryTree = new BinaryTree();
    Node top;
    int length;

    private static class Node {
        BinaryTree.TreeNode data;
        Node next;

        public Node(BinaryTree.TreeNode data) {
            this.data = data;
        }
    }

    public BinaryTreeStack() {
        this.top = null;
        this.length = 0;
    }

    public void push(BinaryTree.TreeNode data) {
        Node temp = new Node(data);
        temp.next = top;
        top = temp;
        length++;
    }

    public BinaryTree.TreeNode pop() {
        if (top == null) {
            return null;
        }
        BinaryTree.TreeNode poppedNode = top.data;
        top = top.next;
        length--;
        return poppedNode;
    }

    public boolean isEmpty() {
        return length == 0;
    }
}
