public class RecursivePostorderTraversal {
    public void traversal(BinaryTree.TreeNode root){
        if(root==null){
            return;
        }
        traversal(root.left);
        traversal(root.right);
        System.out.print(root.data+" ");
    }
}
