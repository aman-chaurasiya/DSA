package DataStructureTheory.Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WinnerOfElection {
    public static void main(String[] args) {

        String[] name={"john","johnny","jackie","johnny","john",
                "jackie","jamie","jamie","john","johnny","jamie",
                "johnny","john","johnny","johnny"};
        int n= name.length;
        String[] winner = winner(name, n);
        System.out.println(Arrays.toString(winner));

    }
  static   String[] winner(String []arr,int n){
        String[] winner=new String[2];
       int max_count=0;
       String winnerName=" ";
        for (int i = 0; i <n; i++) {
            int count=0;
            String person=arr[i];
            for (int j=0;j<n;j++){
                if (arr[i]==arr[j]){
                    count++;

                }
            }
            if (count>max_count){
                max_count=count;
                winnerName=person;
            }
            if (count==max_count && winnerName.compareTo(person)>0){
                winnerName=person;
            }
        }
        winner[0]=winnerName;
        winner[1]=String.valueOf(max_count);
        return winner;
    }

    public static String[] winnerOfElection(String []arr,int n) {
        String []winnerList= new String[2];
        HashMap<String,Integer> list=new HashMap<>();
        for (String name:arr
             ) {
            if (list.containsKey(name)){
                list.put(name,list.get(name)+1);
            }else{
                list.put(name,1);
            }
            
        }
        int maxValueInMap=0;
        String winner=" ";

        for (Map.Entry<String,Integer> entry : list.entrySet())
        {
            String  key  = entry.getKey();
            Integer  val = entry.getValue();
            if (val > maxValueInMap)
            {
                maxValueInMap = val;
                winner = key;
            }

            // If there is a tie, pick lexicographically
            // smaller.
            else if (val == maxValueInMap &&
                    winner.compareTo(key) > 0)
                winner = key;
        }
        winnerList[0]=winner;
        winnerList[1]= String.valueOf(maxValueInMap);

        return winnerList;

    }
}
