import java.util.Scanner;

public class SinglyLinkedList {
    Node head;
    int length = 0;

    public class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty() {
        return length == 0;
    }

// Method for add node in the general tree
    public void add_node(Object value) {
        Node new_node = new Node(value);
        if (isEmpty()) {
            head = new_node;
        } else {
            Node pointer = head;

            while (pointer.next != null) {
                pointer = pointer.next;
            }
            pointer.next = new_node;

        }
        
        length++;
    }

    public void delete_last_node() {
        Node pointer = head;
        Node slowPointer = head;
        if (head == null) {
            return;
        }
        while (pointer.next != null) {
            slowPointer = pointer;
            pointer = pointer.next;
        }
        slowPointer.next = null;
        length--;

    }

    public void print() {
        Node pointer = head;
        if (isEmpty()) {
            return;
        }
        while (pointer != null) {
            System.out.print(pointer.data + " ");
            pointer = pointer.next;
        }
        System.out.println();
        System.out.println("Length = "+length);
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        for(int i = 0; i < length; i++){
            int data = scanner.nextInt();
            singlyLinkedList.add_node(data);
        }
        singlyLinkedList.print();
        scanner.close();
    }
}
