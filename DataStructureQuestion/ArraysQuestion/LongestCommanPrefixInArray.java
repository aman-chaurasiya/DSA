package DataStructureQuestion.ArraysQuestion;

public class LongestCommanPrefixInArray {
    public static void main(String[] args) {

        String arr[] = {"geeksforgeeks", "geeks", "geeks",
                "geekszer"};
        int n= arr.length;
        System.out.println(longestCommonPrefix(arr,n));
    }
  static   String longestCommonPrefix(String arr[], int n){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr[0].length();i++){
            char c=arr[0].charAt(i);
            for(String s : arr){
                if(s.length()==i){
                    if(sb.length()==0){
                        return "-1";
                    }else{
                        return sb.toString();
                    }
                }
                if(s.charAt(i)!=c){
                    if(sb.length()==0){
                        return "-1";
                    }else{
                        return sb.toString();
                    }
                }
            }
            sb.append(arr[0].charAt(i));
        }
        if(sb.length()==0){
            return "-1";
        }
        return   sb.toString();
    }
}
