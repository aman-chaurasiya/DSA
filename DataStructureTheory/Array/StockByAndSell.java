package DataStructureTheory.Array;

//purchage only once and sell only once
public class StockByAndSell {
    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 1, 10};
        int n = arr.length;

        int maxProfit = maxProfit(arr);
        System.out.println(maxProfit);

    }

    private static int maxProfit(int[] arr) {
        int minSoFar = arr[0];
        int maxProfit = 0;

        for (int i = 0; i < arr.length; i++) {
            minSoFar = Math.min(minSoFar, arr[i]);
            int profit = arr[i] - minSoFar;
            maxProfit = Math.max(maxProfit, profit);


        }


        return maxProfit;
    }


}
