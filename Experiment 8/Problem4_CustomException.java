class MyCustomException extends Exception {
    private String storedMessage;
    public MyCustomException(String message) {
        super(message); // Call parent constructor
        this.storedMessage = message; // Store in instance variable
    }
    public void printStoredMessage() {
        System.out.println("=== Stored Exception Message ===");
        System.out.println(storedMessage);
        System.out.println("================================");
    }
    public String getStoredMessage() {
        return storedMessage;
    }
}
public class Problem4_CustomException {
    public static void validateValue(int value) throws MyCustomException {
        if (value < 0) {
            throw new MyCustomException(
                "Invalid value detected: " + value + 
                "\nNegative values are not allowed in this operation!"
            );
        }
        System.out.println("Value " + value + " is valid!");
    }
    public static void main(String[] args) {
        
        System.out.println("=== Custom Exception Demonstration ===\n");
        System.out.println("Test Case 1: Testing with valid value (10)");
        try {
            validateValue(10);
            System.out.println("Success: No exception thrown.\n");
            
        } catch (MyCustomException e) {
            System.out.println("Exception caught!");
            e.printStoredMessage(); 
        }
        System.out.println("Test Case 2: Testing with invalid value (-5)");
        try {
            validateValue(-5);
            System.out.println("Success: No exception thrown.\n");
            
        } catch (MyCustomException e) {
            System.out.println("Exception caught!");
            e.printStoredMessage();
            System.out.println("\nAccessing via getter method:");
            System.out.println(e.getStoredMessage());
        }
        System.out.println("\n" + "=".repeat(40));
        System.out.println("Test Case 3: Directly throwing custom exception");
        System.out.println("=".repeat(40));
        
        try {
            throw new MyCustomException(
                "This is a manually thrown custom exception!\n" +
                "It demonstrates the String storage capability."
            );
            
        } catch (MyCustomException e) {
            System.out.println("\nCustom exception caught in Test Case 3:");
            e.printStoredMessage();
        }
        
        System.out.println("\n=== Program completed successfully ===");
    }
}