package DataStructureQuestion.ArraysQuestion;

public class FindNumberOfNumbers {
    public static void main(String[] args) {
       int  A[]={11,12,13,14,15};
               int k=1;
               int n= A.length;
        int num = num(A, n, k);
        System.out.println(num);
    }
    public static int num(int a[], int n, int k)
    {
        //Your code here
        int count=0;
        for(int i=0;i<n;i++){
            int num=a[i];
            while(num>0){
                int ld=num%10;
                if(ld==k){
                    count++;
                }
                num=num/10;
            }
        }
        return count;
    }
}
