import java.util.Scanner;
import java.util.Arrays;
public class count_even_and_odd_numbers_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sitanshu 24csu323");
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        int[] evenArr = new int[evenCount];
        int[] oddArr = new int[oddCount];
        int evenIndex = 0;
        int oddIndex = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenArr[evenIndex] = arr[i];
                evenIndex++;
            } else {
                oddArr[oddIndex] = arr[i];
                oddIndex++;
            }
        }
        System.out.println("\nEven numbers array: " + Arrays.toString(evenArr));
        System.out.println("Odd numbers array: " + Arrays.toString(oddArr));
        sc.close();
    }
}