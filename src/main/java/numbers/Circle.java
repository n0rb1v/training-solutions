package numbers;

public class Circle {
    private int diameter;
    private final double pi = 3.14;

    public Circle(int diameter) {
        this.diameter = diameter;
    }

    public double perimeter() {
        return (double)diameter * pi;
    }

    public double area() {
        return (pi * ((double)diameter * diameter))/4.0;
    }

    public static void main(String[] args) {
        Circle c = new Circle(10);
        System.out.println(c.perimeter());
        System.out.println(c.area());
    }
}
