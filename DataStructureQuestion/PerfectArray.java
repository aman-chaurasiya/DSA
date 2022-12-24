package DataStructureQuestion;

public class PerfectArray {
    public static void main(String[] args) {
      int  arr[] = {1, 2, 3, 4, 5};
      int n= arr.length;
      int low=0,high=n-1;


      while(low<=high){
          if(arr[low]==arr[high]){
              low++;
              high--;

          }
          if(arr[low]!=arr[high]){
              break;
            //  System.out.println(false);

          }

      }
        System.out.println(true);
    }
}
