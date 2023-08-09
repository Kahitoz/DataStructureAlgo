package BinaryTree;
import java.util.LinkedList;
import java.util.Queue;
public class LevelOrderTraversal {
    public void traverse(BinaryTree.TreeNode root){
        Queue<BinaryTree.TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        System.out.print(root.data+" ");
        while(!queue.isEmpty()){
            BinaryTree.TreeNode pointer = queue.poll();
            if(pointer.left!=null){
                queue.offer(pointer.left);
                System.out.print(pointer.left.data+" ");
            }
            if(pointer.right!=null){
                queue.offer(pointer.right);
                System.out.print(pointer.right.data+" ");
            }
        }
    }
}
