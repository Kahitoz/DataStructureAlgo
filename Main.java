public class Main {

    public static void main(String []args){
        BinaryTree binaryTree = new BinaryTree();
        RecursivePreorderTraversal recursivePreorderTraversal = new RecursivePreorderTraversal();
        IterativePreorderTraversal iterativePreorderTraversal = new IterativePreorderTraversal();
        RecursiveInorderTraversal recursiveInorderTraversal = new RecursiveInorderTraversal();
        IterativeInorderTraversal iterativeInorderTraversal = new IterativeInorderTraversal();
        RecursivePostorderTraversal recursivePostorderTraversal = new RecursivePostorderTraversal();
        IterativePostorderTraversal iterativePostorderTraversal =new IterativePostorderTraversal();
        binaryTree.createBinaryTree();

        System.out.println("Binary Tree is  - ");
        for(int i =0; i<7; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Result for recursive preorder traversal: ");
        recursivePreorderTraversal.preOrder(binaryTree.root);
        System.out.println();
        System.out.println("Result for iterative preorder traversal");
        iterativePreorderTraversal.iterative(binaryTree.root);
        System.out.println();
        System.out.println("Result for recursive inorder traversal");
        recursiveInorderTraversal.inordertraverse(binaryTree.root);
        System.out.println();
        System.out.println("Result for iterative inorder traversal");
        iterativeInorderTraversal.traversal(binaryTree.root);
        System.out.println();
        System.out.println("Result for recursive postorder traversal");
        recursivePostorderTraversal.traversal(binaryTree.root);
        System.out.println();
        System.out.println("Result for Iterative postorder traversal");
        iterativePostorderTraversal.traversal(binaryTree.root);
    }
}
