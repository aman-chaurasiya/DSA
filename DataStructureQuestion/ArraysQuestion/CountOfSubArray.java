package DataStructureQuestion.ArraysQuestion;

public class CountOfSubArray {
    public static void main(String[] args) {
        int []arr={3,2,1};
        int k=2;
        int n=arr.length;
        System.out.println(countOfSubarray(arr,n,k));
    }
    static int countOfSubarray(int arr[],int n,int k){

        int ans=0;
        for (int i=0;i<n;i++){
            int max=arr[i];
            for (int j=i;j<n;j++){
                max=Math.max(arr[j],max);
                if(max>k)
                {
                    ans++;
                }
            }
        }

        return ans;

    }
}
