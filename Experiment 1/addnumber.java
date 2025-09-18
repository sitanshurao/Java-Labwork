import java.util.Scanner;
class addnumber {
   public static void main(String args[]) {
      float a, b, sum, subtract, product, division;
      System.out.println("SITANSHU, 24CSU323");
      System.out.println("Enter two numbers");
      Scanner scan = new Scanner(System.in);
      a = scan.nextInt();
      b = scan.nextInt();

      sum = a + b;
      subtract = a - b;
      product = a * b;
      division = a / b;

      System.out.println("Sum of a and b is " + sum);
      System.out.println("Subtract of a and b is " + subtract);
      System.out.println("Product of a and b is " + product);
      System.out.println("Division of a and b is " + division);
   }
}
