package DataStructureTheory.Mathematics;

import java.util.Arrays;

public class PrimeTillNumber {
    public static void main(String[] args) {
        int n=100;
        int []arr=new int[102];
        Arrays.fill(arr,0);
        for (int i=2;i<=n;i++){
            if (arr[i]==0){
                for (int j=i*i;j<=n;j+=i){

                    arr[j]=1;
                }
            }
        }
        for (int i=2;i<=n;i++){
            if (arr[i]==0)
                System.out.print(i+" ");
        }
    }
}
