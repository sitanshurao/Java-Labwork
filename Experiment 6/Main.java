public class Main {
    public static void main(String[] args) {
        System.out.println("Tushar Dahiya,23csu321");
        ResizableCircle rc = new ResizableCircle(10.0);
        System.out.println("Original Radius: 10.0");
        System.out.println("Original Area: " + rc.getArea());
        System.out.println("Original Perimeter: " + rc.getPerimeter());

        rc.resize(50); // Resize to 50%
        System.out.println("\nAfter resizing to 50%:");
        System.out.println("New Area: " + rc.getArea());
        System.out.println("New Perimeter: " + rc.getPerimeter());
    }
}
