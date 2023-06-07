import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
public class InsertBinaryTree {

    public void level_order_traveral(BinarySearchTree.node root){
        if(root == null){
            return;
        }
        Queue<BinarySearchTree.node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            BinarySearchTree.node pointer = queue.poll();
            System.out.print(pointer.data+" ");
            if(pointer.left!=null){
                queue.offer(pointer.left);
            }
            if(pointer.right!=null){
                queue.offer(pointer.right);

            }

        }
    }

    public BinarySearchTree.node insert(BinarySearchTree.node root, int value){
        if(root == null){
            root = new BinarySearchTree.node(value);
            return root;
        }
        if(value < (int)root.data){
            root.left =insert(root.left, value);
        }else{
            root.right = insert(root.right, value);
        }
        return root;
    }

    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        scanner.close();
         
    }
}
