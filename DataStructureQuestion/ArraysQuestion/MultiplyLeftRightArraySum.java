package DataStructureQuestion.ArraysQuestion;

public class MultiplyLeftRightArraySum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int n= arr.length;
        int multiply = multiply(arr, n);
        System.out.println(multiply);
    }
    public static int multiply (int arr[], int n) {
        //Complete the function
        int low=0;
        int high=n-1;
        int leftSum=0;
        int rightSum=0;
        int mid=(low+high)/2;
        if(n%2==0){
            for(int i=0;i<=mid;i++){
                leftSum+=arr[i];
            }
        }else{
            for(int i=0;i<mid;i++){
                leftSum+=arr[i];
            }
        }
        if(n%2==0){
            for(int i=mid+1;i<=high;i++){
                rightSum+=arr[i];
            }

        }else{
            for(int i=mid;i<high;i++){
                rightSum+=arr[i];
            }

        }

        return leftSum*rightSum;


    }
}
