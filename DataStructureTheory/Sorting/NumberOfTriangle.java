package DataStructureTheory.Sorting;

public class NumberOfTriangle {
    public static void main(String[] args) {
        int arr[]={6,4,9,7,8};
        int n=arr.length;
        System.out.println(countTriangle(arr,n));

    }
  static int  countTriangle(int arr[],int n){
        int count=0;
        for (int i=n-1;i>=0;i--){
            int l=0;
            int r=i-1;
            while(l<r){
                if(arr[l]+arr[r]>arr[i]){
                    count+=r-l;
                    r--;
                }else{
                    l++;
                }
            }
        }
        return count;
    }
}
