package Questions;

import java.util.LinkedList;
import java.util.Queue;

public class FindMaxValueBinaryTree {
    
    public int find_max(BinaryTree.TreeNode root){
        int max = 0;
        Queue<BinaryTree.TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            BinaryTree.TreeNode pointer = queue.poll();
            
            if(pointer.data > max){
                max = pointer.data;
            }
            if(pointer.left != null){
                queue.offer(pointer.left);
            }
            if(pointer.right != null){
                queue.add(pointer.right);
            }
        }
        return max;
    }

    public static void main(String []args){
        BinaryTree binaryTree = new BinaryTree();
        FindMaxValueBinaryTree findMaxValueBinaryTree = new FindMaxValueBinaryTree();
        binaryTree.createBinaryTree();
        System.out.println("Max value is = "+findMaxValueBinaryTree.find_max(binaryTree.root));
        
    }
}
