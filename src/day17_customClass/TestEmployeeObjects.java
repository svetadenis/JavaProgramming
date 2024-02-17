package day17_customClass;

public class TestEmployeeObjects {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
    //class name  object name    constructor
        employee1.setInfo("Svetlana Denisenko", 41, 'F', "Java Developer", 105000, "A12");

        Employee employee2 = new Employee();
        employee2.setInfo("Inna Kost", 47, 'F', "Java Developer", 95000, "H37");

        Employee employee3 = new Employee();
        employee3.setInfo("Saim Saims", 33,'M', "Senior Java Developer", 150000, "F33");

        employee3.work();//all data will be reassigned if we'll change it before System.out.println(employee3)
        employee3.age = 39;
        employee3.name = "Lucy";
        employee3.gender = 'F';

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);







    }
}
