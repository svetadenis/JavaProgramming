package day25_constractor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {
    //if we create static method, then all different objects will have the same name
    //so our method will be instance
    public String name;
    public int age;
    public char gender;
    public String jobTitles;
    public double salary;
    public LocalDate hired_date;

    public Employee(String name, int age, char gender, String jobTitles, double salary, LocalDate hired_date) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitles = jobTitles;
        this.salary = salary;
        this.hired_date = hired_date;
    }//allow us to set instance variables of the object as soon as the object is created

    public String toString() {
        return "Employee{" +
                "name= '" + name + '\'' +
                ", age= " + age +
                ", gender =" + gender +
                ", jobTitles= '" + jobTitles + '\'' +
                ", salary= " + salary +
                ", hired_date= " + hired_date.format(DateTimeFormatter.ofPattern("MMMM/dd/y")) +
                '}';
    }//allows us to print the object when its passed in a print statement
}


/*
name
age gender
jobTitle
salary
hired date
 */