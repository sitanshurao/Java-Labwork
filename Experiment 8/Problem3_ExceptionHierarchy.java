class LevelOneException extends Exception {
    public LevelOneException(String message) {
        super(message);
    }
}
class LevelTwoException extends LevelOneException {
    public LevelTwoException(String message) {
        super(message);
    }
}
class LevelThreeException extends LevelTwoException {
    public LevelThreeException(String message) {
        super(message);
    }
}
class A {
    public void throwException() throws LevelOneException {
        System.out.println("Class A: throwException() method called");
        throw new LevelOneException("Exception thrown from Class A (Level 1 - Base)");
    }
}

class B extends A {
    @Override
    public void throwException() throws LevelTwoException {
        System.out.println("Class B: throwException() method called");
        throw new LevelTwoException("Exception thrown from Class B (Level 2 - Middle)");
    }
}
class C extends B {
    @Override
    public void throwException() throws LevelThreeException {
        System.out.println("Class C: throwException() method called");
        throw new LevelThreeException("Exception thrown from Class C (Level 3 - Top)");
    }
}
public class Problem3_ExceptionHierarchy {
    
    public static void main(String[] args) {
        
        System.out.println("=== Demonstrating Three-Level Exception Hierarchy ===\n");
        C objectC = new C();
        A upcasted = objectC;
        
        System.out.println("Created object of type C and upcasted to type A");
        System.out.println("Now calling the throwException() method...\n");
        
        try {
            upcasted.throwException();
            
        } catch (LevelThreeException e) {
            System.out.println("\n[CAUGHT] LevelThreeException:");
            System.out.println("Message: " + e.getMessage());
            System.out.println("This is the most specific exception in the hierarchy.");
            
        } catch (LevelTwoException e) {
            System.out.println("\n[CAUGHT] LevelTwoException:");
            System.out.println("Message: " + e.getMessage());
            System.out.println("This is the middle level exception.");
            
        } catch (LevelOneException e) {
            System.out.println("\n[CAUGHT] LevelOneException:");
            System.out.println("Message: " + e.getMessage());
            System.out.println("This is the base level exception.");
        }
        
        System.out.println("\n=== Program completed successfully ===");
    }
}