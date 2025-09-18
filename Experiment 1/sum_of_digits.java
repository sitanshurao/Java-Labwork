import java.util.Scanner;
public class sum_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        System.out.println("SITANSHU, 24CSU323");
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        if (n >= 100 && n <= 999) {
            while (n > 0) {
                int rem = n % 10;
                sum = sum + rem;
                n = n / 10;
            }
            System.out.println("Sum of digits of " + temp + " is: " + sum);
        } else {
            System.out.println("Please enter a valid three-digit number.");
        }
        sc.close();
    }
}
