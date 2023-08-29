package CodingNinjas;

public class b2_RecursiveInOrder {

    public void recursive(b1_createTree.node root) {
        if (root == null) {
            return;
        }
        recursive(root.left);
        System.out.println(root.data);
        recursive(root.right);
    }

    public static void main(String[] args) {
        b1_createTree tree = new b1_createTree();
        b2_RecursiveInOrder print = new b2_RecursiveInOrder();
        tree.create_tree();
        print.recursive(tree.root);
    }
}
