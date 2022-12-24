package DataStructureTheory.TreeDSA;

public class SizeOfBinaryTree {
    public static void main(String[] args) {
        TreeNode root= new TreeNode(10);
        root.left=new TreeNode(20);
        root.right=new TreeNode(30);
        TreeNode root1= new TreeNode(40);
        root.right.left=root1;
        System.out.println(getSize(root));

    }
    static int getSize(TreeNode root){
        if (root==null)
            return 0;
        else
            return 1+getSize(root.left)+getSize(root.right);
    }
}
