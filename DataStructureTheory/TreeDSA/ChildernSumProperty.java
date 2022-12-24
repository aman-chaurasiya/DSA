package DataStructureTheory.TreeDSA;

public class ChildernSumProperty {
    public static void main(String[] args) {
        TreeNode root= new TreeNode(20);
        root.left=new TreeNode(8);
        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(5);
        root.right=new TreeNode(12);
        System.out.println(cSum(root));

    }
    static boolean cSum(TreeNode root){
        if(root==null)
            return true;
        if(root.left==null && root.right==null)
            return true;
        int sum=0;
        if (root.left!=null)
            sum+=root.left.data;
        if(root.right!=null)
            sum+=root.right.data;
        return (root.data==sum && cSum(root.left) && cSum(root.right));
    }
}
