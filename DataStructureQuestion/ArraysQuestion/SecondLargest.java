package DataStructureQuestion.ArraysQuestion;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        int n=arr.length;
        System.out.println(print2largest(arr,n));
    }


   public static int print2largest(int arr[], int n) {
        // code here
        int first=0;
        int second=0;
        int i;
        for( i=0;i<n-1;i++){
            if(arr[i] > first)
                second=first;
            first=arr[i];
        }
        if(arr[i]<first && arr[i]>second)
        {
            second =arr[i];
        }
        return second;

    }
}
