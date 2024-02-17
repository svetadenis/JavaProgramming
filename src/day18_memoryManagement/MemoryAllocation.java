package day18_memoryManagement;

import day17_customClass.Employee;

class Car{
    public String color;//null, because it's absense of value
    public String brend;//null
    public String model;//null
}

public class MemoryAllocation {//no memory for the class
    //only can be one public class in a class
    public static void main(String[] args) {
        int a = 100;//stack
        Car car = new Car();//object
        //  stack   heap
    }

public static void method1(){
int b = 200;//stack
}

public static void method2(){
        String c = "Hello World";
        // c located in a stack; "Hello World" located in a heap inside a String pool
    String d = new String ("Hello World");
    // c located in a stack; "Hello World" in a heap outside the String pool

    System.out.println("_________________________________________________________________");

    Employee employee1=new Employee();//imported from class day 17
    Employee employee2 = employee1;

    employee1.setInfo("Sveta",30,'F',"Java Developer", 95000, "A12");

    System.out.println(employee1);//it's one object employee, but two variables
    System.out.println(employee2);

    System.out.println("____________________________________________________________");

    }

}