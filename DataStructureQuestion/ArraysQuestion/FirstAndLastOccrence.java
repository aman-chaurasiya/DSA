package DataStructureQuestion.ArraysQuestion;

import java.util.ArrayList;

public class FirstAndLastOccrence {
    public static void main(String[] args) {
        long[] arr = {1, 3, 5, 5, 5, 5, 7, 123, 125};
        int n = arr.length;
        int x=3;
        FirstAndLastOccrence flo=new FirstAndLastOccrence();
        ArrayList<Long> longs = flo.find(arr, n, x);
        System.out.println(longs);

    }

    ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
        ArrayList<Long> list= new ArrayList<>();
        list.add((long) -1);
        list.add((long) -1);
        for(int i=0;i<n;i++){
            if(arr[i]==x)
                list.set(1,(long)i);

        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]==x)
                list.set(0,(long)i);

        }
        return list;
    }
}
