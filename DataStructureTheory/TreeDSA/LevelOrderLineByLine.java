package DataStructureTheory.TreeDSA;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderLineByLine {
    public static void main(String[] args) {

        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(20);
        root.right=new TreeNode(30);
        root.left.left=new TreeNode(40);
        root.left.right=new TreeNode(50);
        root.right.left=new TreeNode(60);
        root.right.right=new TreeNode(70);

        printLevel(root);
        System.out.println();
        ArrayList<ArrayList<Integer>> arrayLists = levelOrder(root);
        for (ArrayList<Integer> arr:arrayLists) {
            for (int value:arr){
                System.out.println(value);
            }
            System.out.println("$");

        }
    }
    public static void printLevel(TreeNode root){
        if(root==null)return;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(q.size()>1){
            TreeNode curr=q.poll();
            if(curr==null){
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(curr.data+" ");
            if(curr.left!=null)
                q.add(curr.left);
            if(curr.right!=null)
                q.add(curr.right);
        }
    }
    static ArrayList<ArrayList<Integer>> levelOrder(TreeNode node)
    {
        // Your code here
        ArrayList<ArrayList<Integer>>list=new ArrayList<ArrayList<Integer>>();
        Queue<TreeNode>q=new LinkedList<TreeNode>();
        if(node==null)
        {
            return list;
        }
        q.add(node);
        while(q.size()>0)
        {
            int count=q.size();
            if(count==0)
            {
                break;
            }
            while(count>0)
            {
                TreeNode cur=q.poll();
                System.out.print(cur.data+" ");
                if(cur.left!=null)
                {
                    q.add(cur.left);
                }
                if(cur.right!=null)
                {
                    q.add(cur.right);
                }
                count--;
            }
            System.out.print("$ ");
        }

        return list;
    }
}
