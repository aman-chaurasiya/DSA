package DataStructureTheory.Array;

public class GenerateAllSubarray {
    public static void main(String[] args) {
        int arr[]={1,2,3,-6,7,8,-7,-8};
        int n= arr.length;
        generateAllSubArray(arr,n);
    }
    private static void generateAllSubArray(int[] arr,int n){
        for (int i=0; i <n; i++) //This loop will select start element
        {
            for (int j = i; j < n; j++)   //This loop will select end element
            {
                int sum=0;
                for (int k = i; k <= j; k++) //This loop will print element from start to end

                {
                    sum+=arr[k];
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
                if( sum==0)
                System.out.println("sum is "+sum);

            }
        }

    }
}
