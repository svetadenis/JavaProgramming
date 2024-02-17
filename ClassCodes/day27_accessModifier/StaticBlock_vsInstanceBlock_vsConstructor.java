package day27_accessModifier;

public class StaticBlock_vsInstanceBlock_vsConstructor {

    public StaticBlock_vsInstanceBlock_vsConstructor(){//constractor
        System.out.println("Constructor");
         }

         {
        System.out.println("Instance Block");//instance block
        }

        static{
        System.out.println("Static Block");//static block
        }

    public static void main(String[] args) {//main method

        System.out.println("Main Method");

        new StaticBlock_vsInstanceBlock_vsConstructor();
        new StaticBlock_vsInstanceBlock_vsConstructor();

    }
}
//Static Block
//Main Method
//Instance Block
//Constructor
//Instance Block
//Constructor