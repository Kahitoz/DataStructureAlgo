package BinaryTree;
public class RecursivePreorderTraversal {
    public void preOrder(BinaryTree.TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
}

