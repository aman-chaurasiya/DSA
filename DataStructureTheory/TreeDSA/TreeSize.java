package DataStructureTheory.TreeDSA;

public class TreeSize {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(20);
        root.right=new TreeNode(30);
        root.left.left=new TreeNode(40);
        root.left.right=new TreeNode(50);
        root.right.left=new TreeNode(60);
        root.right.right=new TreeNode(70);
        System.out.println(getSize(root));
    }
    static int getSize(TreeNode root){
        if (root==null)
            return 0;
        else
            return 1+getSize(root.left)+getSize(root.right);
    }
}
