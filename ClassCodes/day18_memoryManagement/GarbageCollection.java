package day18_memoryManagement;

import day17_customClass.Dog;

public class GarbageCollection {
    public static void main(String[] args) {

        String s1="Java";
        s1=null;//"Java" will be available for garbage collection
        System.out.println(s1);
System.out.println("_________________________________________");

String str1 = "Python";
str1 = "CYDEO";
System.out.println(str1);

System.out.println("_________________________________");

Dog dog3 = new Dog();
dog3.setInfo("Bella","Chow Chow",'M',2,"Med","orange");

Dog dog4 = new Dog();
dog4.setInfo("Chuck", "Bulldog",'M',5,"small", "white");
//two objects were created in a heap

dog3=null;//now object dog3 is eligible to the garbage collection
dog4=dog3;//another way to put object dog3 to the garbage collection
        System.out.println(dog3);//null
        System.out.println(dog4);//null
//new Dog().finalize();

    }
}
