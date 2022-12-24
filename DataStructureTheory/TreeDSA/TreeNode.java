package DataStructureTheory.TreeDSA;

public class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;

    }
}

class Test {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        //  root.left=new TreeNode(20);
        //  root.right= new TreeNode(30);
        TreeNode node1 = new TreeNode(20);
        TreeNode node2 = new TreeNode(30);
        TreeNode node3 = new TreeNode(40);
        TreeNode node4 = new TreeNode(50);
        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;
        printInorder(root);
        System.out.println();
        printPreorder(root);
        System.out.println();
        printPostorder(root);

    }

    static void printInorder(TreeNode node) {
        if (node != null) {
            printInorder(node.left);
            System.out.print(node.data + " ");
            printInorder(node.right);
        }
    }

    static void printPreorder(TreeNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            printPreorder(node.left);
            printPreorder(node.right);
        }
    }
    static void printPostorder(TreeNode node) {
        if (node != null) {

            printPostorder(node.left);
            printPostorder(node.right);
            System.out.print(node.data + " ");
        }
    }
    static int height(TreeNode root){
        if (root==null)
            return 0;
        else
            return Math.max(height(root.left),height(root.right))+1;
    }
}
