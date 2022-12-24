package DataStructureTheory.Sorting;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;
import java.util.Collections;

public class CountInversion {
    public static void main(String[] args) {
        int arr[]={2,4,1,3,5};
        int n=arr.length;
       CountInversion ct= new CountInversion();
        int inversion = ct.inversionCount(arr, 0,n-1);
        System.out.println(inversion);
    }

    //naive approach  O(n^2)time complexity
   int  countInversion(int arr[],int n){
        int res=0;
        for (int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]>arr[j]){
                    res++;
                }
            }
        }
        return res;
    }
    int inversionCount(int arr[],int l,int r){
        int res=0;
        if (l<r){
            int m=l+(r-l)/2;
            res+=inversionCount(arr,l,m);
            res+=inversionCount(arr,m+1,r);
            res+= countAndMerge(arr,l,m,r);
        }
        return res;
    }

    private int countAndMerge(int[] arr, int l, int m, int r) {

        int n1=m-l+1,n2=r-m;
        int left[]=new int[n1];
        int right[]=new int[n2];
        for(int i=0;i<n1;i++){
            left[i]=arr[l+i];
        }
        for (int i=0;i<n2;i++){
            right[i]=arr[m+1+i];
        }
        int res=0,i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if (left[i]<right[j]){
                arr[k]=left[i++];
                k++;
            }
            else{
                arr[k]=right[j++];
                res=res+(n1-i);
                k++;
            }
        }
        while(i<n1){
            arr[k]=left[i];
            i++;k++;
        }
        while(j<n2){
            arr[k]=right[j];
            i++;j++;
        }
        return res;

    }
}
