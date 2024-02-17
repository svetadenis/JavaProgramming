package day28_encapsulation.encapsulation;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();

        //student.age = -200;
     //   System.out.println(student.age);
        student.setAge(28);
        System.out.println(student.getAge());//28
        System.out.println("Test Completed");

        student.setAge(0);
        System.out.println(student.getAge());//Invalid Age: 0
        //the program will be completly executed


        student.setName("Aaron");
        System.out.println(student.getName());//"Aaron

       student.setName("Aaron1");
       System.out.println(student.getName());//Invalid name:Aaron1

    }
}
