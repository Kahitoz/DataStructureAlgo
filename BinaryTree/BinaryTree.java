package BinaryTree;
public class BinaryTree{
    public TreeNode root;

    public static class TreeNode{
        TreeNode left;
        TreeNode right;

        int data;

        public TreeNode(int data){
            this.data = data;
        }
    }

    public void createBinaryTree(){
        TreeNode first = new TreeNode(0);
        TreeNode Second = new TreeNode(1);
        TreeNode Third = new TreeNode(2);
        TreeNode Fourth = new TreeNode(3);
        TreeNode Fifth= new TreeNode(4);
        TreeNode Sixth = new TreeNode(5);
        TreeNode Seven = new TreeNode(6);

        root = first;
        first.left = Second;
        first.right = Third;
        Second.left = Fourth;
        Second.right = Fifth;
        Third.left = Sixth;
        Third.right = Seven;

      
    }
}