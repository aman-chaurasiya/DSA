package DataStructureTheory.Hashing;

import java.util.HashMap;

public class CountOfNonRepeting {
    public static void main(String[] args) {

        int []arr={1,2,3,1,3,2,0,5,6,4,4};
        int i = countNonRepeting(arr);
        System.out.println(i);


    }
    private static int countNonRepeting(int []arr){
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        int count=0;
        int res=0;
        for (int i = 0; i <arr.length; i++) {
            if (!hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],1);
            }else{
                count=hashMap.get(arr[i]);
                count++;
                hashMap.put(arr[i],count);
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (hashMap.get(arr[i])==1){
                res++;
            }

        }
        return res;

    }
}
