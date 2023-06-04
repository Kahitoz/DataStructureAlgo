import java.util.Stack;
public class IterativePostorderTraversal {
    public void iterative_postorder_traversal(BinaryTree.TreeNode root){
        Stack<BinaryTree.TreeNode> stack =  new Stack<>();
        BinaryTree.TreeNode pointer = root;
        stack.push(pointer);
        while(!stack.isEmpty()){
            if(pointer!=null){
                if(pointer.right!=null){
                    stack.push(pointer.right);
                }
                if(pointer.left!=null){
                    stack.push(pointer.left);
                }
                pointer = stack.pop();
                System.out.print(pointer.data+" ");
            }
        }
    }
}
