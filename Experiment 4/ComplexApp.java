import java.util.Scanner;
public class ComplexApp {
    public static void main(String[] args){
        System.out.println("Sitanshu,24csu323");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter real part of first complex number: ");
        int r1=sc.nextInt();
        System.out.print("Enter imaginary part of first complex number: ");
        int i1=sc.nextInt();
        Complex c1=new Complex(r1,i1);
        System.out.print("Enter real part of second complex number: ");
        int r2=sc.nextInt();
        System.out.print("Enter imaginary part of second complex number: ");
        int i2=sc.nextInt();
        Complex c2=new Complex(r2,i2);
        System.out.println("Sum: ");
        Complex sum=c1.add(c2);
        System.out.print("Difference: ");
        Complex diff=c1.subtract(c2);
        System.out.print("Product: ");
        Complex prod=c1.multiply(c2);
        sum.display();
        diff.display();
        prod.display();
        sc.close();
    }}
