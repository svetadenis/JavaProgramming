package day25_constractor;

public class TestRectangleObjects {

    public static void main(String[] args) {

/*if we create setInfo method, then we need to
to create it for every rectangular with different length and width and this is deisadvantage

        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);//Rectangle{length=0.0, width=0.0, area=0.0}
         rectangle1.setInfo(3,4);
        System.out.println(rectangle1);//Rectangle{length=3.0, width=4.0, area=7.0}

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setInfo(4,3);

        Rectangle rectangle3 = new Rectangle();
        rectangle3.setInfo(1,2);

        Rectangle rectangle4 = new Rectangle();
        rectangle4.setInfo(5,2);

        Rectangle rectangle5 = new Rectangle();
        rectangle5.setInfo(1,5);

        System.out.println(rectangle2);
        System.out.println(rectangle3);
        System.out.println(rectangle4);
        System.out.println(rectangle5);

System.out.println("____________________________________");*/
Rectangle rectangle1 = new Rectangle(3,5);
Rectangle rectangle2 = new Rectangle(4,3);
Rectangle rectangle3 = new Rectangle(3,5);
Rectangle rectangle4 = new Rectangle(1,1);
Rectangle rectangle5 = new Rectangle(2,2);
System.out.println(rectangle1);//Rectangle{length=3.0, width=5.0, area=8.0}
System.out.println(rectangle2);//Rectangle{length=4.0, width=3.0, area=7.0}
System.out.println(rectangle3);
System.out.println(rectangle4);
System.out.println(rectangle5);




    }

}
