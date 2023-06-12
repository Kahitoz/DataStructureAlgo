public class IterativeInorderTraversal {
    public void traversal(BinaryTree.TreeNode root){
        if(root == null){
            return;
        }
        BST_insert stack = new BST_insert();
        BinaryTree.TreeNode temp = root;
        while(!stack.isEmpty()||temp!=null){
            if(temp!=null){
                stack.push(temp);
                temp=temp.left;
            }else{
                temp = stack.pop();
                System.out.print(temp.data+" ");
                temp=temp.right;
            }
        }
    }
}
