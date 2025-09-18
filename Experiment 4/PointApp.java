import java.util.Scanner;
public class PointApp {
    public static void main(String[] args){
        System.out.println("Sitanshu,24csu323");
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter x1");
        float x1=sc.nextFloat();
        System.out.println("Enter y1");
        float y1=sc.nextFloat();
        System.out.println("Enter x2");
        float x2=sc.nextFloat();
        System.out.println("Enter y2");
        float y2=sc.nextFloat();
        Point p1=new Point(x1,y1);
        Point p2=new Point(x2,y2);
        System.out.println("Point 1:");
        p1.display();
        System.out.println("Point 2:");
        p2.display();
        double dist=Point.distance(p1,p2);
        System.out.printf("Distance between p1 and p2: %7.2f\n",dist);
        sc.close();
    }
}
