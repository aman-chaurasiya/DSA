package DataStructureQuestion;

public class Quzees {
    public static void main(String[] args) {
       /* int a[] = {1, 2, 3, 4, 5};
        int sum = 0;
        for(int i = 0; i < 5; i++) {
            if(i % 2 == 0) {
                sum += a[i];
            }
        }
        System.out.println(sum);*/
        String s = "letsSolve";
        int n = s.length();
        for(int i = 0; i < n; i++) {
            s = s + s.charAt(i);
        }
        System.out.println(s);
    }
}
