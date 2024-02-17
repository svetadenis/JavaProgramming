package day27_accessModifier;

public class InstanceBlock {
    {
        System.out.println("Instance block");//will be executed three times after static method
    }
    static {
        System.out.println("Static block");// static block will be executed just once;
        //will be executed first

    }
    public InstanceBlock(){
        System.out.println("Constructor");////will be executed three times after static method
    }
    public static void main(String[] args) {
        new InstanceBlock();
        new InstanceBlock();
        new InstanceBlock();
    }
}
//Static block
//Instance block
//Constructor
//Instance block
//Constructor
//Instance block
//Constructor