package DataStructureTheory.TreeDSA;

public class MaxximumInBinaryTree {
    public static void main(String[] args) {
        TreeNode root= new TreeNode(10);
        TreeNode node1= new TreeNode(20);
        TreeNode node2= new TreeNode(30);
        TreeNode node3= new TreeNode(40);
        root.left=node1;
        root.right=node2;
        root.left.right=node3;
        System.out.println(getMaxximum(root));


    }
    static int getMaxximum(TreeNode root){
        if (root==null){
            return Integer.MIN_VALUE;

        }else{
            return Math.max(root.data,Math.max(getMaxximum(root.left),getMaxximum(root.right)));
        }
    }
}
