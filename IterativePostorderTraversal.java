import java.util.Stack;
public class IterativePostorderTraversal {
    public void traversal(BinaryTree.TreeNode root){
        Stack<BinaryTree.TreeNode> stack =  new Stack<>();
        BinaryTree.TreeNode current = root;
        while(!stack.isEmpty()||current!=null){
            if(current!=null){
                stack.push(current);
                current = current.left;
            }
            else{
                BinaryTree.TreeNode pointer = stack.peek().right;
                if(pointer==null){
                    pointer = stack.pop();
                    System.out.print(pointer.data+" ");
                    while(!stack.isEmpty()&&pointer==stack.peek().right){
                        pointer = stack.pop();
                        System.out.print(pointer.data+" ");
                    }
                }
                else{
                    current = pointer;
                }
            }
            
        }
    }
}
