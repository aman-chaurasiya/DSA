package Collection;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[]= {20,50,30,10,5,7,40,45};
        int n=arr.length;
        int secondLargest = secondLargest(arr, n);
        System.out.println(secondLargest);
    }

    private static int  secondLargest(int[] arr, int n) {
        int largest=arr[0];
        int secondLargest=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            if(arr[i]>secondLargest && arr[i]<largest){
                secondLargest=arr[i];
            }
        }
        return secondLargest;

    }


}
