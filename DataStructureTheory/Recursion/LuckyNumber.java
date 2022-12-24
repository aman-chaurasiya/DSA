package DataStructureTheory.Recursion;

public class LuckyNumber {
    public static void main(String[] args) {
        int n = 74;

        System.out.println( Solution.isLucky(n));
    }


}
class Solution {
    static int counter=2;
    public static boolean isLucky(int n) {
        // Your code here

        if (counter > n)
            return true;
        if (n % counter == 0)
            return false;
        n=n-n/counter;
        counter++;
        return isLucky(n);

    }
}
