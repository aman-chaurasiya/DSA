package DataStructureQuestion.ArraysQuestion;

import java.util.HashMap;
import java.util.Map;

public class MejorityElement {
    public static void main(String[] args) {


        int arr[]={3,1,3,3,2};
        int size=arr.length;
        int element = majorityElement(arr, size);
        System.out.println(element);

    }
    static int majorityElement(int a[], int size)
    {
        // your code here


        HashMap<Integer,Integer> hm = new HashMap <> () ;
        int mfn = -1 ;
        for( int i = 0 ; i < a.length ; i++ ) {
            hm.put(a[i],hm.getOrDefault(a[i],0)+1) ;
           // System.out.println(hm);
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            System.out.println(hm.entrySet());
          //  System.out.println(entry);
            if( entry.getValue() > size/2 )
            {
                mfn = entry.getKey() ;
            }
            System.out.println(entry.getValue());
        }
        return mfn ;

    }
}
