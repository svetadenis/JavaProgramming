package day35_polymorphism.shapeTask;

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double area() {
        return radius * Math.PI;
    }
}
