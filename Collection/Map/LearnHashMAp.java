package Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMAp {
    public static void main(String[] args) {
        Map<String,Integer> mp= new HashMap<>();

        mp.put("one",1);
        mp.put("two",2);
        mp.put("three",3);
        mp.put(null,null);
        mp.put("four",null);
        mp.put("five",null);
        System.out.println(mp);
        for(Map.Entry<String,Integer>e: mp.entrySet()){
   //         System.out.println(e);
     //       System.out.println(e.getValue());
            System.out.println(e.getKey());
        }
    }
}
