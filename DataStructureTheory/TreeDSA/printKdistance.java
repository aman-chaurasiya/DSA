package DataStructureTheory.TreeDSA;

public class printKdistance {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(20);
        root.left.left=new TreeNode(30);
        root.left.left.left=new TreeNode(40);
        root.left.left.right=new TreeNode(50);
        printkdis(root,3);
    }
    static void printkdis(TreeNode root,int k){
        if(root==null)
            return;
        if(k==0){
            System.out.print(root.data+" ");
        }else{
            printkdis(root.left,k-1);
            printkdis(root.right,k-1);
        }
    }
}
