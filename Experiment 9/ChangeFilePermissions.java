import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.util.Set;
public class ChangeFilePermissions {
    public static void main(String[] args) {
        String filePath = "test.txt";
        File file = new File(filePath);
        System.out.println("Current Directory: " + System.getProperty("user.dir"));
        System.out.println();
        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File created: " + filePath);
            }
            System.out.println("=== Setting permissions using File class ===");
            file.setReadable(true);
            file.setWritable(true);
            file.setExecutable(false);
            
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Executable: " + file.canExecute());
            System.out.println("\n=== Setting permissions using NIO ===");
            Path path = Paths.get(filePath);
            try {
                Set<PosixFilePermission> perms = PosixFilePermissions.fromString("rw-r--r--");
                Files.setPosixFilePermissions(path, perms);
                System.out.println("Permissions set to: rw-r--r--");
                System.out.println("Owner can read and write");
                System.out.println("Group can read");
                System.out.println("Others can read");
            } catch (UnsupportedOperationException e) {
                System.out.println("POSIX permissions not supported on this system (Windows)");
                System.out.println("Using basic File class permissions instead");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}