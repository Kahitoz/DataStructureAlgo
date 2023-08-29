package CodingNinjas;
import java.util.Stack;

public class b2_IterInOrder {

    public void iterative_inorder(b1_createTree.node root){
        // root - left - right;
        b1_createTree.node pointer = root;
        Stack<b1_createTree.node> stack = new Stack<>();
        while(!stack.isEmpty() || pointer!=null){
            if(pointer!=null){
                stack.add(pointer);
                pointer = pointer.left; 
            }else{
                pointer = stack.pop();
                System.out.println(pointer.data);
                pointer = pointer.right;
            }
        }

    }
    public static void main(String[] args){
        b1_createTree create = new b1_createTree();
        b2_IterInOrder print = new b2_IterInOrder();
        create.create_tree();
        print.iterative_inorder(create.root);
    }
}
