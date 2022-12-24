package DataStructureTheory.Array;

public class ArrayOperation {


    public static void main(String[] args) {

    }


}

class GfG {
    public boolean searchEle(int a[], int x) {
        //add code here.
        for (int i = 0; i < a.length / 2; i++) {
            if (a[i] == x || a[a.length / 2 + i] == x) {
                return true;
            }
        }
        return false;
    }

    public boolean insertEle(int a[], int y, int yi) {
        //add code here.
        if (yi >= a.length) {
            return false;
        }
        a[yi] = y;
        return a[yi] == y ? true : false;

    }

    public boolean deleteEle(int a[], int z) {
        //add code here.
        int inputArrayLength = a.length;
        int[] modifiedArray = new int[a.length];
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == z) {
                continue;
            }
            modifiedArray[i] = a[i];
            count++;
        }
        a = modifiedArray;

        return a.length == inputArrayLength - 1 || count == inputArrayLength ? true : false;

    }
}
