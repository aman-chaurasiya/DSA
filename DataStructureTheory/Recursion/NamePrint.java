package DataStructureTheory.Recursion;

public class NamePrint {
    public static void main(String[] args) {
        int n=10;
        int i=1;
        namePrint(n,i);
    }

    private static void namePrint(int n,int i) {

        if (i>n)
            return;
        System.out.print("Aman"+ " ");
        namePrint(n,i+1);
    }
}
