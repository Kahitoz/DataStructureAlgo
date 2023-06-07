package Questions;

public class RecursiveMaxValueBinaryTree {
    public int max_value(BinaryTree.TreeNode root){
        int max =0;
        if(root == null){
            return Integer.MIN_VALUE;
        }
        max = root.data;
        int left = max_value(root.left);
        int right = max_value(root.right);
        if(left>max){
            max = left;
        }
        if(right>max){
            max=right;
        }
        return max;
    }
    public static void main(String []args){
        BinaryTree binaryTree = new BinaryTree();
        RecursiveMaxValueBinaryTree recursiveMaxValueBinaryTree = new RecursiveMaxValueBinaryTree();
        binaryTree.createBinaryTree();
        System.out.println(recursiveMaxValueBinaryTree.max_value(binaryTree.root));
    }
}
