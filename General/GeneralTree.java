package General;
class GeneralTree {
    public Node root;

    public class Node {
        SinglyLinkedList children;
        int data;

        public Node(int data) {
            this.data = data;
            this.children = new SinglyLinkedList();
        }
    }

    public void create_general_tree() {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);
        Node sixth = new Node(60);
        Node seventh = new Node(70);
        Node eight = new Node(80);

        root = first;
        first.children.add_node(second);
        first.children.add_node(third);
        first.children.add_node(fourth);
        first.children.add_node(fifth);
        second.children.add_node(sixth);
        second.children.add_node(seventh);
        second.children.add_node(eight);
    }
}
