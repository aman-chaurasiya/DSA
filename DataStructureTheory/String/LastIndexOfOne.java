package DataStructureTheory.String;

public class LastIndexOfOne {
    public static void main(String[] args) {
        String a = "000001";
        int i = lastIndex(a);
        System.out.println(i);
    }

    public static int lastIndex(String s) {
        int lastIndex = -1;
        for (int i = s.length()-1; i >=0; i--) {
            if (s.charAt(i) == '1') {
                lastIndex = i;
                break;
            }
        }
        return lastIndex;
    }
}
