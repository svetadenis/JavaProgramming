package day35_polymorphism;

import day35_polymorphism.shapeTask.Circle;
import day35_polymorphism.shapeTask.Shape;
import day35_polymorphism.shapeTask.Square;

import java.util.ArrayList;
import java.util.List;


public class ShapeTask {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(10));
        shapes.add(new Square(20));
        shapes.add(new Circle(5));
        for (Shape shape : shapes) {
            //if (shape instanceof Circle)
            System.out.println("Shape's area = " + shape.area());
        }
    }
}
