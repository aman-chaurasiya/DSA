package DataStructureQuestion.LoveBabber.Array;

public class MaxAndMin {
    public static void main(String[] args) {
        int arr[] = {};
        int n = arr.length;


        pair pair = minMax(arr, n);
        System.out.println("min is= "+pair.min+" "+"max is= "+pair.max);

    }

    private static pair minMax(int[] arr, int n) {

        if (n==0){
            return new pair(-1,-1);
        }
        int min = arr[0], max = arr[0];
        for (int i = 0; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        pair pair = new pair(min, max);
        return pair;
    }
}

class pair {
    int min, max;

    public pair(int min, int max) {
        this.min = min;
        this.max = max;
    }
}
