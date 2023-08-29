package CodingNinjas;

public class b3_RecPreOrder {
    public void recursive(b1_createTree.node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        recursive(root.left);
        recursive(root.right);
    }
    public static void main(String[] args){
        b1_createTree createTree = new b1_createTree();
        createTree.create_tree();
        b3_RecPreOrder print = new b3_RecPreOrder();
        print.recursive(createTree.root);
    }
}
