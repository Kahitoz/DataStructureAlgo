import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class BinarySearchTree {
    node root;
    node pointer;
    class node{
        node left;
        node right;
        Object data;
        public node(Object data){
            this.data = data;
            
        }
    }
    public node insert(node root, int data){
        node new_node =  new node(data);
        if(root == null){
            root = new_node;
            return root;
        }
        if(data<(int)root.data){
            root.left = insert(root.left, data);
        }
        if(data>(int)root.data){
            root.right = insert(root.right,data);
        }
        return root;
    }

    public void insert(int data){
        root = insert(root, data);

    }

    public void level_order(node root){
        if(root == null){
            return;
        }
        Queue<node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            node pointer = queue.poll();
            System.out.print(pointer.data);
            if(pointer.left!=null){
                queue.add(pointer.left);
            }
            if(pointer.right!=null){
                queue.add(pointer.right);
            }
        }

        
    }

    public static void main(String []args){
        BinarySearchTree bSearchTree = new BinarySearchTree();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0; i<n;i++){
            int value = scanner.nextInt();
            bSearchTree.insert(value);
        }
        bSearchTree.level_order(bSearchTree.root);
        scanner.close();
    }
}

