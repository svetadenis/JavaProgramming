package day17_customClass;

public class Employee {
    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;
    public String ID;


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", ID='" + ID + '\'' +
                '}';
    }//to avoid getting hash code when we print

    public void setInfo(String name, int age, char gender, String jobTitle, double salary, String ID) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.ID = ID;
        //we just want assign the eqances (уравнения) to each object withou any value, then we use void without return method
        //instance method call from the object


    }

    //these two methods(toString and setInfo) will be working separetly for each objects
    public void work() {
        System.out.println(name + " is working");
    }

}