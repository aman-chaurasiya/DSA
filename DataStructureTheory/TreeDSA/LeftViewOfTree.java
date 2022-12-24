package DataStructureTheory.TreeDSA;

public class LeftViewOfTree {
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
        leftView(root,1);



    }
   public static int maxLevel=0;

    public static void leftView(TreeNode root,int level){
        if(root==null)
            return;
        if(maxLevel < level){
            System.out.print(root.data+" ");
            maxLevel=level;
        }
        leftView(root.left,level+1);
        leftView(root.right,level+1);
    }
}
