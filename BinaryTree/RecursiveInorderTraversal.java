package BinaryTree;
public class RecursiveInorderTraversal {

    public void inordertraverse(BinaryTree.TreeNode root){
        if(root == null){
            return;
        }
        inordertraverse(root.left);
        System.out.print(root.data + " ");
        inordertraverse(root.right);
    }
}
