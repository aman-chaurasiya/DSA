package DataStructureTheory.TreeDSA;

import java.util.LinkedList;
import java.util.Queue;

public class LeftViewLineByLine {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);

        TreeNode node1 = new TreeNode(20);
        TreeNode node2 = new TreeNode(30);
        TreeNode node3 = new TreeNode(40);
        TreeNode node4 = new TreeNode(50);
        TreeNode node5 = new TreeNode(60);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.right=node5;
        printLeftView(root);

    }
    static void printLeftView(TreeNode root){
        if(root==null)return;
        Queue<TreeNode> que=new LinkedList<>();
        que.add(root);
        while(!que.isEmpty()){
            int count =que.size();
            for(int i=0;i<count;i++){
                TreeNode curr=que.poll();
                if(i==0)
                    System.out.print(curr.data+" ");
                if (curr.left!=null)
                    que.add(curr.left);
                if (curr.right!=null)
                    que.add(curr.right);
            }
        }
    }
}
