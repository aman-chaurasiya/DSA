package DataStructureTheory.Mathematics;

public class QurdatricRoots {
    public static void main(String[] args) {
        int a=1;//1;//752;
        int b=-7;//-2;//904;
        int c=12;//1;//164;

        int det= b*b-4*a*c;
        System.out.println(det);

        if (det > 0) {

            // two real and distinct roots
            int   firstroot = (-b +(int) Math.sqrt(det)) / (2 * a);
            int  secondroot = (-b - (int)Math.sqrt(det)) / (2 * a);
            System.out.println("first"+firstroot);
            System.out.println("second"+secondroot);
        }
        else if (det == 0) {


            double  firstroot =  -b / (2 * a);
            double  secondroot = -b / (2 * a);

            System.out.println("first"+firstroot);
            System.out.println("second"+secondroot);
        }
    }
}
