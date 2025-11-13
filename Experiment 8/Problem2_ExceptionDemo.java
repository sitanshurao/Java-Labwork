public class Problem2_ExceptionDemo {
    public static void main(String[] args) {
        
        System.out.println("Program started...\n");
        
        try {
            System.out.println("Inside try block - about to throw exception");
            throw new Exception("This is a custom exception message passed to the constructor!");
            
        } catch (Exception e) {
            System.out.println("\nInside catch block:");
            System.out.println("Exception caught: " + e.getMessage());
            
        } finally {
            System.out.println("\nInside finally block:");
            System.out.println("Finally clause executed - I was here!");
            System.out.println("This block executes regardless of exception occurrence.");
        }
        
        System.out.println("\nProgram ended successfully.");
    }
}