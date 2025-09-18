import java.util.Scanner;
public class f_to_c {
    public static void main(String args[])
    {   System.out.println("Sitanshu, 24CSU323");
        System.out.println("Enter a temperature in Fahrenheit:-\n");
        Scanner scan = new Scanner(System.in);
        double f = scan.nextDouble();
        double c = (f-32)*5/9;
        System.out.println("Temp in Celsius is: "+c);
        scan.close();
    }
}
