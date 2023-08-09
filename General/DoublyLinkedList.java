package General;
import java.util.Scanner;
public class DoublyLinkedList {
    node head;
    node tail;
    int length;
    public class node{
        node next;
        node previous;
        Object data;
        public node(Object data){
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }
    public boolean isEmpty(){
        return length == 0;
    }

    public void add_node(Object data){
        node new_node = new node(data);
        if(isEmpty()){
            tail = new_node;
        }else{
            head.previous = new_node;
        }
        new_node.next = head;
        head = new_node;
        length++;
    }

    public void print_forward(){
        node pointer = head;
        while(pointer!=null){
            System.out.print(pointer.data+"-->");
            pointer = pointer.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public void print_backward(){
        node pointer = tail;
        while(pointer!=null){
            System.out.print(pointer.data+"-->");
            pointer = pointer.previous;
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList dll = new DoublyLinkedList();
        int n = scanner.nextInt();
        for(int i=0; i<n;i ++){
            int n1 = scanner.nextInt();
            dll.add_node(n1);
        }
        scanner.close();
        System.out.println("Forward Result");
        dll.print_forward();
        System.out.println("Backward Result");
        dll.print_backward();
        System.out.println("Lenght = "+dll.length);
    }
    
}
