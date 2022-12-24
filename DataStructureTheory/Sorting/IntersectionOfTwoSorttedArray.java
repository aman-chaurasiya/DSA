package DataStructureTheory.Sorting;

public class IntersectionOfTwoSorttedArray {
    public static void main(String[] args) {

        int a[]={2,2,5,7,7,9,10};
        int b[]={2,3,4,5,6,7,7,8};
        int n=a.length;
        int m=b.length;
        interSectionTwoarrays(a,b,n,m);
        System.out.println();
        intersectionTwoSortedArray(a,b,n,m);
    }
    //naive approach;
    static void interSectionTwoarrays(int a[],int b[],int n,int m){
        for(int i=0;i<n;i++){
            if (i>0 && a[i]==a[i-1])
                continue;
            for (int j=0;j<m;j++){
                if (a[i]==b[j]){
                    System.out.print(a[i]+" ");
                    break;
                }
            }
        }


    }
    //efficient approach
  static void  intersectionTwoSortedArray(int a[],int b[],int n,int m){
        int i=0,j=0;
        while(i<n && j<m){
            if(i>0 && a[i]==a[i-1]){
                i++;
                continue;
            }
            if (a[i]<b[j]){
                i++;
            }
           else if (a[i]>b[j])
           {
                j++;
            }
           else
           {
                System.out.print(a[i]+" ");
                i++;j++;
            }
        }

    }
}
