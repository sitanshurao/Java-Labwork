import java.util.Scanner;
class CheckArgumentException extends Exception {
    public CheckArgumentException(String message) {
        super(message);
    }
}
public class Problem1_CheckArguments {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sitanshu, 24csu323");
        
        try {

            System.out.print("Enter the number of arguments you want to provide: ");
            int numArgs = scanner.nextInt();

            if (numArgs < 5) {
                throw new CheckArgumentException(
                    "Insufficient arguments! Please provide exactly 5 arguments. You provided: " + numArgs
                );
            }

            int[] numbers = new int[5];

            System.out.println("\nEnter 5 integer values:");
            for (int i = 0; i < 5; i++) {
                System.out.print("Enter argument " + (i + 1) + ": ");
                numbers[i] = scanner.nextInt();
            }

            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += numbers[i];
            }

            System.out.println("\n--- Results ---");
            System.out.print("The 5 numbers are: ");
            for (int i = 0; i < 5; i++) {
                System.out.print(numbers[i]);
                if (i < 4) System.out.print(", ");
            }
            System.out.println("\nSum of all five numbers: " + sum);
            
        } catch (CheckArgumentException e) {
            System.out.println("CheckArgumentException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
