package BinaryHeap;

public class bh1_maxHeap {
    Integer[] heap;
    int n;

    public bh1_maxHeap(int capacity){
        heap = new Integer[capacity+1];
        n = 0;
    }

    public boolean isEmpty(){
        return n == 0;
    }

    public int size(){
        return n;
    }

    public static void main(String []args){
        bh1_maxHeap maxHeap = new bh1_maxHeap(3);
        System.out.println(maxHeap.size());
        System.out.println(maxHeap.isEmpty());
    }
}
