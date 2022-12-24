package DataStructureTheory.BinarySearch;

public class LastOccerence {
    public static void main(String[] args) {
        int[] arr = {5, 10, 10, 20, 20, 25, 25, 25};
        int n = arr.length;
        int x = 20;
        int low=0,high=n-1;

        int index = lastOccerence(arr, n, x);
        int index1 = lastOccerence2(arr, n, x,low,high);
        System.out.println();
        System.out.println(index);
        System.out.println(index1);

    }
//
    private static int lastOccerence(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x)
                high = mid - 1;
            else if (arr[mid] < x)
                low = mid + 1;
            else {
                if (mid == n - 1 || arr[mid + 1] != arr[mid])
                    return mid;
                else
                    low = mid + 1;
            }
        }

        return -1;
    }

    private static int lastOccerence2(int[] arr, int n, int x, int low, int high) {

        if (low > high)
            return -1;
        int mid = (low + high) / 2;


        if (arr[mid] > x)
            return lastOccerence2(arr, n, x, low, mid - 1);

        else if (arr[mid] < x)
            return lastOccerence2(arr, n, x, mid - 1, high);
        else {
            if (mid == n - 1 || arr[mid + 1] != arr[mid])
                return mid;
            else
               return lastOccerence2(arr, n, x, mid + 1, high);
        }
    }
}





