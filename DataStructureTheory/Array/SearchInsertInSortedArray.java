package DataStructureTheory.Array;

public class SearchInsertInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 8, 7, 9};
        int n = arr.length;
        int k = 10;
        int num = search(arr, k, 0, n);
        if (num == -1) {
            System.out.println("Number not found ");
        } else System.out.println(num);

        int[] arr1 = new int[6];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 4;
        arr1[4] = 6;

        int index = insertSorted(arr1, 6, 5, k);
//        System.out.println(index);
//        for (int a : arr1) {
//            System.out.print(a + " ");
//
//        }
        int size = deleteSorted(arr, n, k);
        for (int i=0;i<size;i++) {
            System.out.print(arr[i] + " ");

        }


    }

    public static int search(int[] arr, int k, int low, int high) {


        if (high <= low) return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == k) return mid;

        if (k > arr[mid]) return search(arr, k, mid + 1, high);

        return search(arr, k, low, mid - 1);


    }


    public static int insertSorted(int[] arr, int cap, int n, int k) {

        if (n >= cap) return n;

        int i;
        for (i = n - 1; (i >= 0 && arr[i] > k); i--)
            arr[i + 1] = arr[i];
        arr[i + 1] = k;
        return (n = 1);


    }


    public static int deleteSorted(int[] arr, int n, int k) {
        int pos = search(arr, k, 0, n - 1);
        if (pos == -1) {
            System.out.println("Element not found");
            return n;
        }
        int i;
        for (i = pos; i < n - 1; i++)
            arr[i] = arr[i + 1];
        n=n-1;
        return n;


    }
}
