package DataStructureTheory.Matrix;

public class TransposeMatrix {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},
                {4, 5, 6, 7},
                {8, 9, 7, 4},
                {6, 8, 9, 7}};
        int N = arr.length;

        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        transposeNaive(arr,N);
        System.out.println();
        transposeBest(arr,N);
    }

    static void transposeNaive(int arr[][], int N) {
        int temp[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                temp[i][j] = arr[j][i];
            }
        }
        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++) {
                System.out.print(temp[i][j] + " ");
            }
        System.out.println();
        }
    }
    public static void transposeBest(int arr[][],int N){

        for (int i=0;i<N;i++){
            for (int j=i+1;j<N;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for (int i=0;i<N;i++){
            for (int j=0;j<N;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
   }

}
