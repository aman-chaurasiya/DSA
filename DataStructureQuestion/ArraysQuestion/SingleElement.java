package DataStructureQuestion.ArraysQuestion;


import java.util.HashMap;

//Find element which is present only once in array and another all are present twice
public class SingleElement {
    public static void main(String[] args) {
        int arr[] = {10, 20, 10, 20, 50};
        int n = arr.length;
        HashMap<Integer, Integer> map= new HashMap<>();

       // int result = singleElement(arr, n);
       // System.out.println(result);
        //  int res1 = singleByXor(arr, n);
        //  System.out.println(res1);

    }

    private static int singleByXor(int[] arr, int n) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            res = res ^ arr[i];
        }
        return res;
    }

   /* private static int singleElement(int[] arr, int n) {
        int i;
        int res = 0;
        for (i = 0; i < n; i++) {
            for (int j = 0; i < n; i++) {
                if (i == j) {
                    continue;
                }
                if (arr[i] == arr[j]) {
                    break;
                }
                if (j == n) {
                    res = arr[i];
                }
            }
        }
        return res;

    }*/
}
