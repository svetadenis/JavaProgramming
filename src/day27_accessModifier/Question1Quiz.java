package day27_accessModifier;

public class Question1Quiz {

    public Question1Quiz(){
        System.out.println("A");
    }
    public Question1Quiz(int a){
        this(2.5);
        System.out.println("B");
    }

    public Question1Quiz(double c){
        this();
        System.out.println("C");
    }

    public static void main(String[] args){
        Question1Quiz obj = new Question1Quiz(100);
    }
}
