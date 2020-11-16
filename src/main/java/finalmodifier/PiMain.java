package finalmodifier;

public class PiMain {
    public static void main(String[] args) {
        System.out.println(CircleCalculator.PI);

        CircleCalculator circleCalculator = new CircleCalculator();

        System.out.println(circleCalculator.calculateArea(4));
        System.out.println(circleCalculator.calculatePerimeter(4));

        CylinderCalculator cylinderCalculator = new CylinderCalculator();

        System.out.println(cylinderCalculator.calculateSurfaceArea(4,6));
        System.out.println(cylinderCalculator.calculateVolume(4,6));

    }
}
