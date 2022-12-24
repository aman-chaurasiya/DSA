package DataStructureQuestion;

public class LowerAndHogher {
    public static void main(String[] args) {

        int arr[]={1, 2, 8, 10, 11, 12, 19};
        int n= arr.length;
        int x=0;
        int arr1[]= new int[2];
        int lessCount=0;
        int moreCount=0;
        for(int i=0;i<n;i++){
            if(arr[i]<x){
                lessCount++;
            }
            if(arr[i]>x){
                moreCount++;
            }
        }
        arr1[0]=lessCount;
        arr1[1]=moreCount;
        System.out.println(arr1[0]+" "+arr1[1]);
    }
}
