package day25_constractor;

public class Rectangle {
    public double length,width;

    /*//create methods:
    public void setInfo(double length, double width){
        this.length = length;
        this.width = width;
        }
*/
    public double area(){
        return length+width;
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area() +
                '}';
    }
//define a Constractor.Constractor name must be the same as class name
public Rectangle(double length,double width){
this.length = length;
this.width = width;

}
}

