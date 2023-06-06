import java.util.Scanner;

public class Queue {
    node head;
    int length;

    public static class node {
        node next;
        Object data;

        public node(Object data) {
            this.data = data;
            this.next = null;
        }
    }

    public void enqeue(Object data) {
        node pointer = new node(data);
        if (head == null) {
            head = pointer;
        } else {
            node tracer = head;
            while (tracer.next != null) {
                tracer = tracer.next;
            }
            tracer.next = pointer;
        }
        length++;

    }

    public void dequeue() {
        if (head == null) {
            return;
        }
        System.out.println("Elemenent Dequed = " + head.data);
        head = head.next;
        length--;
    }

    public void print() {
        node pointer = head;
        while (pointer != null) {
            System.out.print(pointer.data + " ");
            pointer = pointer.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue queue = new Queue();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            queue.enqeue(data);
        }
        queue.print();
        queue.dequeue();
        queue.print();
        scanner.close();
    }
}
