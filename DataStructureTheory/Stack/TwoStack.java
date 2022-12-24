package DataStructureTheory.Stack;

public class TwoStack {
    public static void main(String[] args) {
        Mstack ts = new Mstack(10);
        ts.push1(5);
        ts.push1(18);
        ts.push1(40);
        ts.push1(25);
        ts.push1(10);
        ts.push1(15);
        ts.push1(15);
        ts.push1(15);
        ts.push1(16);
        ts.push1(17);



        ts.push2(15);



        System.out.println(ts.size1());
        System.out.println(ts.size2());
        System.out.println("Popped element from"
                + " stack1 is " + ts.pop1());

        System.out.println("Popped element from"
                + " stack2 is " + ts.pop2());
        System.out.println(ts.size1());
        System.out.println(ts.size2());
    }

}
class Mstack{
    int[] arr;
    int cap;
    int top1,top2;
    Mstack(int size){
        cap=size;
        arr=new int[cap];
        top1=-1;
        top2=arr.length-1;

    }
    void push1(int data){
        if(top1<top2){
            top1++;
            arr[top1]=data;
        }else{
            System.out.println("Stack1 is in overflow condition");
        }

    }
    void push2(int data){
        if(top1<top2){
            arr[top2]=data;
            top2--;

        }
        else{
            System.out.println("Stack2 is in overFlow Condition");
        }
    }
    int pop1(){
        if(top1>=0){
            int x=arr[top1];
            top1--;
            return x;
        }else {
            System.out.println("Stack1 Underflow");
            System.exit(1);
        }
        return 0;
    }
    int pop2(){
        if (top2<cap-1){
            int x=arr[top2];
            top2++;
            return x;
        }
        else{
            System.out.println("Stack2 Underflow");
            System.exit(1);
        }
        return 0;
    }
    int size1(){
        return top1+1;
    }
    int size2(){
        if (top2==cap-1)
            return cap-top2;
        else
            return 0;
    }
}
