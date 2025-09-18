import java.util.Scanner;
public class primecheck {
    public static void main(String[] args) {
         System.out.println("Sitanshu 24csu323");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num <= 1) {
            System.out.println(num + " is NOT a Prime number.");
        } else {
            int count = 0;  
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    count++;
                    break; 
                }
            }
            if (count == 0)
                System.out.println(num + " is a Prime number.");
            else
                System.out.println(num + " is NOT a Prime number.");
        }
    }
}