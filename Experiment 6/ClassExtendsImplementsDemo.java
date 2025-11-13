public class ClassExtendsImplementsDemo {
    public static void main(String[] args) {
        System.out.println("Sitanshu,24csu323");
        System.out.println("=== Demonstrating: Class extends another class and implements multiple interfaces ===\n");
        Duck donald = new Duck("Donald");
        System.out.println();
        donald.eat();
        donald.fly();
        donald.swim();
        donald.walk(); 
        System.out.println("\n✓ Successfully demonstrated: Duck class extends Animal class");
        System.out.println("✓ Successfully demonstrated: Duck class implements Flyable, Swimmable, and Walkable interfaces");
    }
}