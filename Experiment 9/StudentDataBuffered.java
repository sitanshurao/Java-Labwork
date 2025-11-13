import java.io.*;
public class StudentDataBuffered {
    public static void main(String[] args) {
        String fileName = "student_data.txt";
        System.out.println("Current Directory: " + System.getProperty("user.dir"));
        System.out.println();
        System.out.println("=== Writing Student Data ===");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Serial No.\tFirst Name\tCGPA\tGrade");
            writer.newLine();
            writer.write("=================================================");
            writer.newLine();
            writeStudent(writer, 1, "John", 8.5f, 'A');
            writeStudent(writer, 2, "Alice", 9.2f, 'A');
            writeStudent(writer, 3, "Bob", 7.8f, 'B');
            writeStudent(writer, 4, "Carol", 6.5f, 'C');
            writeStudent(writer, 5, "David", 9.8f, 'A');
            writeStudent(writer, 6, "Emma", 7.2f, 'B');
            writeStudent(writer, 7, "Frank", 8.9f, 'A');
            writeStudent(writer, 8, "Grace", 6.8f, 'C');
            System.out.println("Student data written successfully!");
            System.out.println("File created: " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing data: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("\n=== Reading Student Data ===");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("\nFile read successfully!");
        } catch (IOException e) {
            System.out.println("Error reading data: " + e.getMessage());
            e.printStackTrace();
        }
    }
    private static void writeStudent(BufferedWriter writer, int serialNo, 
                                     String firstName, float cgpa, char grade) 
                                     throws IOException {
        String record = String.format("%d\t\t%s\t\t%.2f\t%c", 
                                     serialNo, firstName, cgpa, grade);
        writer.write(record);
        writer.newLine();
    }
}