package CodingNinjas;

public class b1_createTree {
    node root;

    public class node {
        int data;
        node left;
        node right;

        public node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public void create_tree() {
        root = new node(10);
        node node2 = new node(20);
        node node3 = new node(30);
        node node4 = new node(40);
        node node5 = new node(50);
        node node6 = new node(60);
        node node7 = new node(70);

        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;

    }

}
