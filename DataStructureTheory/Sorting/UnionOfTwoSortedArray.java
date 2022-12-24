package DataStructureTheory.Sorting;

public class UnionOfTwoSortedArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10,25,30,40,90,90,90};
        int b[]={1,2,3,4,5,6,7,8,9,10,11,12,15,16,17,80,80,80,80,80,80};
        int n=a.length;
        int m=b.length;
        unionTwoArray(a,b,n,m);

    }

   static void unionTwoArray(int a[],int b[],int n,int m){
      int i=0,j=0;
      while(i<n && j<m){
          if (i>0 && a[i]==a[i-1]){
              i++;
              continue;
          }
          if (j>0 && b[j]==b[j-1]){
              j++;
              continue;
          }
          if (a[i]<b[j]){
              System.out.print(a[i]+" ");
              i++;
          }else if(a[i]>b[j]){
              System.out.print(b[j]+" ");
              j++;
          }else {
              System.out.print(a[i] + " ");
              i++;
              j++;
          }
      }
      while(i<n){
          if (i>0 && a[i]!=a[i-1]) {
              System.out.print(a[i] + " ");
              i++;
          }
      }
      while(j<m){
          if (j>0 && b[j]!=b[j-1]) {
              System.out.print(b[j] + " ");
              j++;
          }
      }
    }
}
