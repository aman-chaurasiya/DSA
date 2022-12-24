package DataStructureQuestion.ArraysQuestion;

import java.util.HashSet;
import java.util.Set;

public class SmallestPositiveMissingNUmber {
    public static void main(String[] args) {

    }



   static int  smallestPossitive(int []arr,int n){
       Set<Integer> set= new HashSet<>();

      for (int i=0;i<n;i++){
          if(arr[i]>0){
              set.add(arr[i]);
          }
      }
      int count=1;
      for (int i=1;i<= set.size();i++)
          if (!set.contains(i))
              return i;



return 0;
    }
}
