package DataStructureTheory.Array;

import java.util.HashMap;

public class MaximumOccuredInteger {
    public static void main(String[] args) {
      int   L[] = {1,5,3,1};
       int  R[] = {5,8,5,5};
       int n=4;
       int max=15;
        int maxx = maxx(L, R, n, max);
        System.out.println(maxx);
    }
   static  int  maxx(int []l,int [] r,int n,int maxx){
      int []arr=new int[maxx+2];
      for (int i=0;i<n;i++){
          arr[l[i]]++;
          arr[r[i]+1]--;
      }
       int maxElement=0;
      for(int i=1;i< arr.length;i++){
          arr[i]+=arr[i-1];
          if (arr[i]>maxElement)
          {
              maxElement=i;
          }
      }

    
      return maxElement;

    }
}
