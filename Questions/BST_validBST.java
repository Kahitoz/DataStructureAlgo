package Questions;

public class BST_validBST {
    node root;
    public class node{
        node left;
        node right;
        long data;
        public node(int data){
            this.data = data;
        }
    }
    
    public boolean isValid(node root, Long min, Long max){
        if(root == null){
            return false;
        }
        if(root.data<=min || root.data>=max){
            return true;
        }
        boolean isLeft = isValid(root.left, min, root.data);
        if(isLeft){
            boolean isRight = isValid(root.right, root.data, max);
            return isRight;
        }
        return false;
    }

    public static void main(String []args){

    }

}
