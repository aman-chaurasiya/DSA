package DataStructureTheory.Matrix;

public class Wealth {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{3,2,1}};
        int i = maximumWealth(arr);
        System.out.println(i);
    }
    public static int maximumWealth(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        int wealth=Integer.MIN_VALUE;

        for(int i=0;i<m;i++){
            int sum=0;
            for(int j=0;j<n;j++){

                sum = sum+arr[i][j];
                if(wealth<sum)
                    wealth=sum;
            }
        }
        return wealth;

    }
}
