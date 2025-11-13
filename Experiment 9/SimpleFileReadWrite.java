import java.io.*;
public class SimpleFileReadWrite {
    public static void main(String[] args) {
        String fileName = "simple_data.txt";
        
        System.out.println("Current Directory: " + System.getProperty("user.dir"));
        System.out.println();
        System.out.println("=== Writing to file ===");
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Hello, this is a test file.\n");
            writer.write("Java file operations are easy!\n");
            writer.write("This is line 3.\n");
            writer.write("Learning file handling in Java.\n");
            writer.write("End of file content.\n");
            System.out.println("Data written to file successfully!");
            System.out.println("File created: " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("\n=== Reading from file ===");
        System.out.println("File content:");
        System.out.println("==================");
        try (FileReader reader = new FileReader(fileName)) {
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println("==================");
            System.out.println("File read successfully!");
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}