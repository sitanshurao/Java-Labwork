import java.io.*;
public class FileOrDirectoryCheck {
    public static void main(String[] args) {
        String path = "test.txt";
        System.out.println("Current Directory: " + System.getProperty("user.dir"));
        System.out.println();
        
        File file = new File(path);
        
        if (file.exists()) {
            if (file.isFile()) {
                System.out.println(path + " is a FILE");
                System.out.println("File size: " + file.length() + " bytes");
            } else if (file.isDirectory()) {
                System.out.println(path + " is a DIRECTORY");
                String[] contents = file.list();
                if (contents != null) {
                    System.out.println("Number of items: " + contents.length);
                }
            }
        } else {
            System.out.println(path + " does not exist");
        }
    }
}