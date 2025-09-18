import java.util.Scanner;

public class reverse_an_array {
    public static void main(String[] args) {
        System.out.println("Sitanshu, 24CSU323");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        System.out.println("Reversed array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("\nProgram End");
        sc.close();
    }
}
