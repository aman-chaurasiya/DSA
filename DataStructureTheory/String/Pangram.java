package DataStructureTheory.String;

public class Pangram {
    public static void main(String[] args) {
        String str = "rmnjvryc v iqaxff xuostjljrpq";
        String s = missingCharacter(str, str.length());
        System.out.println(s);

    }
    public static String missingCharacter(String str,int strLength){
        boolean[] alph= new boolean[26];

        for (int i=0;i<strLength;i++){
            if(str.charAt(i)>='a'&& str.charAt(i)<='z')
                alph[str.charAt(i)-'a']=true;
            else if (str.charAt(i)>='A'&& str.charAt(i)<='Z')
                alph[str.charAt(i)-'A']=true;
        }
        String res="";
        for (int i=0;i<26;i++){
            if (alph[i]==false)
                res=res+(char)(i+'a');
        }
        return res;
    }
}
