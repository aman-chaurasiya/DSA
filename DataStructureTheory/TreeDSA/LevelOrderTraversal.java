package DataStructureTheory.TreeDSA;

import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(20);
        root.left.left=new TreeNode(30);
        root.left.left.left=new TreeNode(40);
        root.left.left.right=new TreeNode(50);
        levelOrderTraversal(root);
    }
    static void levelOrderTraversal(TreeNode root) {
        if (root == null)
            return;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            System.out.print(curr.data+" ");
            if (curr.left != null)
                q.add(curr.left);
            if (curr.right != null)
                q.add(curr.right);
        }
    }



}
