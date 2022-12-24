package Collection.List;

import java.util.*;

public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(25);
        list2.add(30);
        list.add(1);
        list.add(2);
        System.out.println(list);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        //add element on any index
        list.add(2, 15);
        System.out.println(list);
        //add  second list in first list
        list2.addAll(list);
        System.out.println(list2);
        Integer integer = list2.get(3);
        System.out.println(integer);
        //delet element in list
        list2.remove(3);
        System.out.println(list2);
        list2.remove(Integer.valueOf(30));
        System.out.println(list2);
        //clear list or arraylist
        list2.clear();
        System.out.println(list2);
        //change particuler element by index
        list.set(2,20);
        System.out.println(list);
        System.out.println(list.contains(20));
        //iterate fulllist
        //by for loop
        for (int i=0;i< list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        //for each
        for(Integer element : list) {
            System.out.print(element+" ");

        }
        System.out.println();
        Iterator<Integer> it= list.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
