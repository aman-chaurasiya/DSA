package DataStructureQuestion.ArraysQuestion;

public class SlidingWindowsTechnique {
    public static void main(String[] args) {
        int []arr={1,8,30,-5,20,7};
        int k=3;

      int max_sum=  max_sum(arr,arr.length,k);
        System.out.println(max_sum);
    }

    private static int max_sum(int[] arr, int n, int k) {
        int curr_sum=0;
        for (int i=0;i<k;i++)
            curr_sum+=arr[i];
        int max_sum=curr_sum;
        for (int i=k;i<n;i++){
            curr_sum+=arr[i]-arr[i-k];
            max_sum=Math.max(max_sum,curr_sum);
        }



        return max_sum;
    }
}
