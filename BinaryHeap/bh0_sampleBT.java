package BinaryHeap;

public class bh0_sampleBT{
    Integer[] heap = {null,9,3,6,2,1,5,4};
    node root; 
    public class node{
        node left;
        node right;
        int data;
        public node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public void sample_bt(){
       root = new node(heap[1]);
       node new_node = root;
       for(int i=2; i<heap.length;i++){
        if(new_node.left == null){
            new_node.left = new node(heap[i]);
        }else{
            new_node.right = new node(heap[i]);
        }
    
       }
    }
}