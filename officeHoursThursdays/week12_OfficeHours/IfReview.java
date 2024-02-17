package week12_OfficeHours;

public class IfReview {

    public static String name;
    static{
        name="heyo";
    }
    public static void main(String [] args){
        IfReview ifReview = new IfReview();
        ifReview.name = "yoyo";

        IfReview newIfReview = new IfReview();
        newIfReview.name = "nono";

        IfReview lastIfReview = new IfReview();
        System.out.println(lastIfReview.name);

        System.out.println(IfReview.name);//nono nono
//one copy for every object because it's a static viriable
    }
}
