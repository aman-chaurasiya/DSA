package DataStructureQuestion;

public class MaximumDifference {
    public static void main(String[] args) {
        int arr[]={2,3,10,6,4,8,1};
        int n= arr.length;

       int diff = maxDiff(arr, n);
       System.out.println(diff);
        System.out.println(maxdiffBest(arr,n));


    }

    private static int maxDiff(int[] arr, int n) {

        int res=arr[1]-arr[0];
        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                int diff=arr[j]-arr[i];
                if (diff >res){
                    res=diff;
                }
            }
        }
        return res;

    }





  private static int maxdiffBest(int arr[],int n){
        int res=arr[1]-arr[0],minvalue=arr[0];
        for (int i=1;i<n;i++)
        {
            res=Math.max(res,arr[i]-minvalue);
            minvalue=Math.min(minvalue,arr[i]);
        }
        return res;

    }
}
