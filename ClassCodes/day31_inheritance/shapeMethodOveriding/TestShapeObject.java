package day31_inheritance.shapeMethodOveriding;
public class TestShapeObject {

public static void main(String[] args) {

    Square square = new Square(5);

    System.out.println(square);

    square.draw();

    System.out.println("----------------------------");

    Circle circle = new Circle(3.5);

    System.out.println(circle);

//Square{name='Square', side='5.0', area='25.0', perimeter='20.0'}
//Drawing a Square:
//	* * * * * *
//	*         *
//	*         *
//	*         *
//	*         *
//	* * * * * *
//----------------------------
//Circle{name='Circle', radius='3.5', area='38.465', perimeter='21.98'}
}
}
