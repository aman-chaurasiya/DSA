package DataStructureTheory;

public class WaterProblem {
    public static void main(String[] args) {

        int []arr={7, 12, 1, 17, 14, 3, 11, 17, 2 ,6 ,6, 5, 8, 17};
        int n=arr.length;
        int mincap = mincap(arr, n);
        System.out.println(mincap);

    }
    static int mincap(int []arr,int n){
        int res=0;
        for (int i=0;i<n;i++){
            arr[i]=0;
            for(int j=i+1;j<n;j++){
                arr[j]=arr[j]-1;
                if(i==n-1){
                    res=arr[i];
                }
            }
        }
        return res;
    }
}
