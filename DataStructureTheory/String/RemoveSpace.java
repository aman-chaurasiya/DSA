package DataStructureTheory.String;

public class RemoveSpace {
    public static void main(String[] args) {
        String str1="Aman Is A Good Boy     ";
        System.out.println(str1.replaceAll("\\s",""));
        System.out.println(str1.replaceAll("\\s","_"));
        System.out.println(str1.replaceAll("\\s+",""));
        System.out.println(str1.replaceAll("\\s+","_"));

    }
}
