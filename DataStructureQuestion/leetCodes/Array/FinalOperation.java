package DataStructureQuestion.leetCodes.Array;

public class FinalOperation {
    public static void main(String[] args) {
        String arr[]= {"--X","X++","X++"};
        int X=0;
        for(int i=0;i<arr.length;i++){
           if (arr[i].compareTo("++X")==0 || arr[i].compareTo("X++")==0){
               X=X+1;
           }
           else{
               X-=1;
           }

        }
        System.out.println(X);
    }
}
