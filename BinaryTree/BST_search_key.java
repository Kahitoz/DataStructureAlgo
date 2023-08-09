package BinaryTree;
public class BST_search_key {
    public BST_create.node search(BST_create.node root, int key){
        if(root==null||key==root.data){
            return root;
        }
        if(key<root.data){
            return search(root.left, key);
        }else{
            return search(root.right, key);
        }
    }


    public static void main(String []args){
        BST_create create = new BST_create();
        create.create_binary_tree();
        BST_search_key search_key = new BST_search_key();
        System.out.println("Inorder value");
        create.inorder(create.root);
        if(null!=search_key.search(create.root, 1)){
            System.out.println("\nKey Found");
        }
       
    }
}
