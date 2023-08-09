package General;
public class Stack {
    Node top;
    int Lenght;
    private static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }

    public Stack(){
        this.top = null;
        this.Lenght = 0;
    }

    public void push(int data){
        Node temp = new Node(data);
        temp.next = top;
        top = temp;
        Lenght++;
    }

    public void pop(){
        if(top == null){
            return;
        }
        top = top.next;
        Lenght--;
    }

    public boolean isEmpty(){
        return Lenght==0;
    }
    public void print(){
        Node pointer = top;
        while(pointer!=null){
            System.out.println(pointer.data+" ");
            pointer=pointer.next;
        }
    }
}
