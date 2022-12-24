package DataStructureTheory.String;

public class MaxWords {
    public static void main(String[] args) {
        String [] arr=  {"alice and bob love leetcode hgfhjg hghkg", "i think so too", "this is great thanks very much"};
        int i = mostWordsFound(arr);
        System.out.println(i);
    }
    public static int mostWordsFound(String[] arr) {
        int maxword=0;
        for(int i=0;i<arr.length;i++){
            String st=arr[i];
            int words=0;
            for(int j=0;j<st.length();j++){
                if (st.charAt(j)==' '){
                    words++;
                }else{
                    continue;
                }
                if (words>maxword){
                    maxword=words;
                }
            }

        }
        return maxword;
    }
}
