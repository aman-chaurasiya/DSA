package DataStructureQuestion.leetCodes;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[]={0,1,2,2,3,0,4,2};
       // int arr[]={3,2,2,3};
       // int arr[]={1};
        int val=2;
       // int val=3;
     //   int val=1;


        int start=0;
       int end=arr.length-1;
       while(start<=end){
           if (arr[end]==val){
               end--;

           }
           else {
               if (arr[start]==val){
                   arr[start]=arr[end];
                   start++;
                   end--;
               }else {
                   start++;
               }
           }


        }
        System.out.println(Arrays.toString(arr));
        System.out.println(end+1);
    }
}
