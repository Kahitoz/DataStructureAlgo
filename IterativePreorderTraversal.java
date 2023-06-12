public class IterativePreorderTraversal {
    public void iterative(BinaryTree.TreeNode root){
        if(root == null){
            return;
        }
        BST_insert binaryTreeStack = new BST_insert();
        binaryTreeStack.push(root);
        while(!binaryTreeStack.isEmpty()){
            BinaryTree.TreeNode temp = binaryTreeStack.pop();
            System.out.print(temp.data+" ");
            if(temp.right != null){
                binaryTreeStack.push(temp.right);
            }
            if(temp.left != null){
                binaryTreeStack.push(temp.left);
            }
        } 
    }
}
