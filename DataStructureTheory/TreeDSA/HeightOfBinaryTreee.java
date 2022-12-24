package DataStructureTheory.TreeDSA;



public class HeightOfBinaryTreee {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(20);
        root.left.left=new TreeNode(30);
        root.left.left.left=new TreeNode(40);
        int height = height(root);
        System.out.println(height);
    }
    static int height(TreeNode root){
        if (root==null)
            return 0;
        else
            return Math.max(height(root.left),height(root.right))+1;
    }

}
