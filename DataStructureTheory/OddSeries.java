package DataStructureTheory;

public class OddSeries {
    public static void main(String[] args) {

        Sol sol = new Sol();

    }

}

class Sol {
    int f[] = new int[100004];
    int mod = (int) 1e9 + 7;
    int firstcall = 0;

    private void generate() {

        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= 100000; i++) {
            if (i % 5 == 0) {
                f[i] = 11;
            } else {
                f[i] = f[i - 1] + f[i - 2];
                f[i] = f[i] % mod;
            }
        }
    }

    public int findNth(int n) {
        if (firstcall == 0) {
            generate();
            firstcall = 1;
        }
        return f[n];

    }
}
