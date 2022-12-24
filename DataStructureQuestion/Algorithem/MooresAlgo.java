package DataStructureQuestion.Algorithem;


//for mejority element
public class MooresAlgo {
    public static void main(String[] args) {
        int arr[] = {2, 2, 2, 3};
        int size = arr.length;
        int element = mejorityElmt(arr, size);
        System.out.println(element);
    }

    static int mejorityElmt(int[] arr, int n) {
        int ansindex = 0;
        int count = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == arr[ansindex]) {
                count++;
            } else
                count--;
            if (count == 0) {
                ansindex = i;
                count = 1;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == arr[ansindex]) {
                count++;
            }
        }
        if (count > n / 2) {
            return arr[ansindex];
        } else
            return -1;
    }
}
