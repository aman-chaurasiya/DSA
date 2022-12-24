package DataStructureTheory.Array;

public class MinimumNumberOfJumps {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        int n=arr.length;
        int a=jumps(arr,n);
        System.out.println(a);
    }

    private static int jumps(int[] arr, int n) {


        if(n<=1)
            return 0;
        if(arr[0]==0)
            return -1;
        int maxreach=arr[0];
        int step=arr[0];
        int jumps=1;
        int i=1;
        for(i=1;i<n;i++){
            if(i==n-1){
                return jumps;
            }
            maxreach=Math.max(maxreach,i+arr[i]);
            step--;
            if(step==0){
                jumps++;
                if(i>=maxreach)
                    return -1;
                step=maxreach-i;
            }
        }
        return -1;
    }
}
