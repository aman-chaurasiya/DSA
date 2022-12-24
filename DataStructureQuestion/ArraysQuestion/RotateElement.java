package DataStructureQuestion.ArraysQuestion;

public class RotateElement {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14,16,18,20};
        int d=3;
        int n= arr.length;
        d=d%n;
        System.out.println(d);
        rotateArr(arr,d,n);
        for (int a:arr
             ) {
            System.out.print(a+" ");
        }

    }
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        int temp[]=new int[d];
        for(int i=0;i<d;i++){
            temp[i]=arr[i];
        }
        for(int i=0;i<n-d;i++){
            arr[i]=arr[i+d];
        }
        for(int i=n-d,j=0;i<n && j<d;j++,i++){
            arr[i]=temp[j];
        }
    }
}
