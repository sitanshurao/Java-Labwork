import java.util.Scanner; 

public class TimeConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sitanshu, 24CSU323");
        System.out.print("Enter the number of minutes: ");
        int minutes = scanner.nextInt();
        double days = (double) minutes / (60 * 24);
        double years = days / 365.25;
        double months = days / 30.44;
        System.out.println();
        System.out.println(minutes + " minutes is equal to:");
        System.out.println(years+" years");
        System.out.println(months+" months");
        System.out.println(days+" days");
        scanner.close();
    }
}