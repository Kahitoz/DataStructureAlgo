package CodingNinjas;
import java.util.Stack;
public class b3_IterPreOrder {
    public void preorder(b1_createTree.node root){
        Stack<b1_createTree.node> stack = new Stack<>();
        b1_createTree.node pointer = root;
        stack.push(pointer);
        while(!stack.isEmpty()){
            b1_createTree.node copy = stack.pop();
            System.out.println(copy.data);
            if(copy.right!=null){
                stack.add(copy.right);
            }
            if(copy.left!=null){
                stack.add(copy.left);
            }
        }
    }
    public static void main(String[] args){
        b1_createTree create = new b1_createTree();
        b3_IterPreOrder print = new b3_IterPreOrder();
        create.create_tree();
        print.preorder(create.root);
    }
}
