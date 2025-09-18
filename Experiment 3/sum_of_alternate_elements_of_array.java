import java.util.Scanner;

public class sum_of_alternate_elements_of_array {

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

        int sum = 0;
        for (int i = 1; i < arr.length; i += 2) {
            sum += arr[i];
        }

        System.out.println("Sum of alternate elements in the array is: " + sum);
    }}