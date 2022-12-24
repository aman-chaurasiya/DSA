package DataStructureQuestion;

public class NUmberOfPerfectSquereInBetween1ToN {
    public static void main(String[] args) {
        int n=100;
        int perfectSqure = numberOfPerfectSqure(n);
        System.out.println(perfectSqure);
    }
    public static int numberOfPerfectSqure(int n){
        double sqrt=Math.sqrt(n);
        double floor=Math.floor(sqrt);
        return (int)floor;
    }
}
