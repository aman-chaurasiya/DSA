package DataStructureQuestion.ArraysQuestion;

public class FindIndex {
    public static void main(String[] args) {
        int [] arr={6, 5, 4, 3, 1, 2};
        int k=3;
        int indexFind = indexFind(arr, arr.length, k);
        System.out.println(indexFind);

    }
    static int indexFind(int []arr,int n,int k){
        for (int i=0;i< arr.length;i++){
            if (arr[i]==k){
              return i;
            }

        }
        return -1;
    }
}
