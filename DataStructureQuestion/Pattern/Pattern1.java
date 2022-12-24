package DataStructureQuestion.Pattern;
//https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md
public class Pattern1 {
    public static void main(String[] args) {

       // pattern2(4);
        pattern8(5);
    }
    static void pattern8(int n){
        for (int row=1;row<=n;row++){
            int totalcolumnInRow=row>n?2*n-row :row;

            int spaces=n-totalcolumnInRow;
            for (int s=0;s<spaces;s++){
                System.out.print(" ");
            }
            for (int col=0;col<totalcolumnInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern28(int n){
        for (int row=1;row<=2*n;row++){
            int totalcolumnInRow=row>n?2*n-row :row;

            int spaces=n-totalcolumnInRow;
            for (int s=0;s<spaces;s++){
                System.out.print(" ");
            }
            for (int col=0;col<totalcolumnInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int row=1;row<=2*n;row++){
            int totalcolumnInRow=row>n?2*n-row :row;
            for (int col=0;col<totalcolumnInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int row=1;row<=n;row++){
            for (int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int row=1;row<=n;row++){
            for (int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern1(int n){
        for (int row=1;row<=n;row++){
            for (int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int row=1;row<=n;row++){
            for (int col=1;col<=n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
