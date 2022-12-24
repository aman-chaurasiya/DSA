package DataStructureQuestion;

public class Cars {
    public static void main(String[] args) {
        int n1=15;
        int n2=10;
        int x=10;
        int i = overtakeTime(n1, n2, x);
        System.out.println(i);
    }
    public static int overtakeTime(int n1,int n2,int x){
        int car1=x;
        int car2=0;
        int count=0;
        if (n1>n2){
            return -1;
        }else{
            while (car1>=car2){
                car1=car1+n1;
                car2=car2+n2;
                count++;
            }
            return count;
        }

    }
}
