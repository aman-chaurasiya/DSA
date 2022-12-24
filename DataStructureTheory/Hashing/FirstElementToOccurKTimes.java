package DataStructureTheory.Hashing;

import java.util.HashMap;
import java.util.Map;

public class FirstElementToOccurKTimes {
    public static void main(String[] args) {
       int  A[] = {1, 7, 4, 3, 4, 8, 7};
       int k=2;
        int num = firstElement(A, A.length, k);
        System.out.println(num);
    }
    static int firstElement(int arr[], int n, int k) {
        // unordered_map to count
        // occurrences of each element

        HashMap<Integer, Integer> count_map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = 0;
            if (count_map.get(arr[i]) != null) {
                a = count_map.get(arr[i]);
            }

            count_map.put(arr[i], a + 1);
            if (count_map.get(arr[i]) == k){
                return arr[i];
            }
        }
        //count_map[arr[i]]++;

//        for (int i = 0; i < n; i++) // if count of element == k ,then
//        // it is the required first element
//        {
//            if (count_map.get(arr[i]) == k) {
//                return arr[i];
//            }
//        }
        return -1;
    }
}
