package DataStructureQuestion;

public class TripletsSum {
    public static void main(String[] args) {
        int[] arr = {42, -21, 13, -26, 79, 40, 62, -60, 29, -23, 97, -39, 40, -35, 26, -54, 87, 5, 77, 21, 28, 10, 32, -22, 25, 21, 3};
        int n = arr.length;

        boolean flag = false;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; j < n; j++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println(true);
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        flag = true;
                    }
                }
            }
        }
        if (flag==false){
            System.out.println(false);

        }

    }
}
