public class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle constructor called");
    }

    public void start() {
        System.out.println(brand + " is starting...");
    }
}
