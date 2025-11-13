abstract class Mark {
    abstract double getPercentage();
}
class A extends Marks {
    double mark1, mark2, mark3;
    A(double m1, double m2, double m3) {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }
    double getPercentage() {
        double total = mark1 + mark2 + mark3;
        return (total / 300) * 100;
    }
}
class B extends Marks {
    double mark1, mark2, mark3, mark4;
    B(double m1, double m2, double m3, double m4) {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
        mark4 = m4;
    }
    double getPercentage() {
        double total = mark1 + mark2 + mark3 + mark4;
        return (total / 400) * 100;
    }
}
public class Marks {
    public static void main(String[] args) {
        System.out.println("Sitanshu, 24csu323");
        A studentA = new A(85, 90, 80);      
        B studentB = new B(75, 80, 70, 85);  
        System.out.println("Percentage of Student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of Student B: " + studentB.getPercentage() + "%");
    }
}
