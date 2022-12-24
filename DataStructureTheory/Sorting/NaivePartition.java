package DataStructureTheory.Sorting;

import java.util.Arrays;

public class NaivePartition {
    public static void main(String[] args) {

        int arr[]={5,3,12,8,5};
        int n= arr.length;
        int p=0;
        int indexOfPartion = naivePartition(arr, 0, n - 1, p);
        System.out.println(indexOfPartion);
        System.out.println(Arrays.toString(arr));
    }

    static int naivePartition(int arr[], int l, int h, int p) {
        int temp[] = new int[h - l + 1], index = 0;
        for (int i = l; i <= h; i++) {
            if (arr[i] < arr[p]) {
                temp[index] = arr[i];
                index++;
            }
        }
        for (int i=l;i<=h;i++){
            if (arr[i]==arr[p]){
                temp[index]=arr[i];
                index++;
            }
        }
        int res=l+index-1;
        for (int i=l;i<=h;i++){

            if (arr[i]>arr[p]){
                temp[index]=arr[i];
                index++;
            }
        }
        for (int i=l;i<=h;i++){
            arr[i]=temp[i-l];
        }
        return res;


    }
}
