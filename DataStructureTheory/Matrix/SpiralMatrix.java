package DataStructureTheory.Matrix;

import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args) {
        int [][]m= {{1,2},
                {5,6},
                {9,10},
                {13,14}};
        int r=m.length;int c=m[0].length;
        ArrayList<Integer> spiral = spiral(m, r, c);
        System.out.println(spiral);

    }
    private static ArrayList<Integer> spiral(int [][]m,int r,int c){

        int top=0;int bottom=r-1;int left=0;int right=c-1;
        ArrayList<Integer> list=new ArrayList<>();
        if(r==1){
            for (int i = 0; i < c; i++) {
                list.add(m[0][i]);

            }
        }else if(c==1){
            for (int i = 0; i < r; i++) {
                list.add(m[i][0]);
            }

        }else {
            while (top <= bottom && left <= right) {
                for (int i = left; i <= right; i++)
                    list.add(m[top][i]);
                top++;
                for (int i = top; i <= bottom; i++)
                    list.add(m[i][right]);
                right--;

                for (int i = right; i >= left; i--)
                    list.add(m[bottom][i]);
                bottom--;
                for (int i = bottom; i >= top; i--)
                    list.add(m[i][left]);
                left++;


            }
        }
        return list;
    }
}
