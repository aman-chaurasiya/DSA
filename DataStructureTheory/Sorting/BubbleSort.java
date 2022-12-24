package DataStructureTheory.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={20,25,30,5,100,600,1500};
        int n= arr.length;
        bubble(arr,n);
        System.out.println(Arrays.toString(arr));

    }
   static void bubble(int [] arr,int n){
        for (int i=0;i<n-1;i++)
        {
            boolean swaped=false;
            for (int j=0;j<n-i-1;j++)
            {
                if (arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swaped=true;
                }
            }
            if (swaped==false){
                System.out.println("Already sorted");
                break;
            }
        }

    }
}
