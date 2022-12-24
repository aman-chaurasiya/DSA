package DataStructureTheory.Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraysDotSort {
    public static void main(String[] args) {
        Point[] p={new Point(20,30),new Point(10,25),new Point(8,40)};
        Integer[] arr = {20, 25, 33, 4, 43, 8, 10};
      //  Arrays.sort(arr, Collections.reverseOrder());

        for (int i=0;i<p.length;i++){
            System.out.println(p[i].x +" "+p[i].y);
        }
        Arrays.sort(arr,new Mycmp());
        System.out.println(Arrays.toString(arr));
    }
}

class Point implements Comparable<Point> {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }



    @Override
    public int compareTo(Point p) {
        return this.x - p.x;
    }
}
class  Mycmp implements Comparator<Integer>{

    @Override
    public int compare(Integer a, Integer b) {
        return a%2-b%2;
    }
}