package day24_dateAndTime;

import day17_customClass.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(
                new Employee(), new Employee(), new Employee(), new Employee(), new Employee()
        ));
        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

        for (Employee each : employees) {
            System.out.println(each);
       /*
Employee{name='Josh', age=34, gender=M, jobTitle='Java Developer', salary=100000.0, ID='A01'}
Employee{name='Emily', age=40, gender=F, jobTitle='SDET', salary=90000.0, ID='A02'}
Employee{name='Conor', age=38, gender=M, jobTitle='Project Manager', salary=130000.0, ID='A03'}
Employee{name='Bella', age=29, gender=F, jobTitle='Java Developer', salary=95000.0, ID='A04'}
Employee{name='Jimmy', age=54, gender=M, jobTitle='Data Analyst', salary=105000.0, ID='A05'}
        */
        }
        System.out.println("________________________________________________");
        for (Employee each : employees) {
            if (each.jobTitle.equals("Java Developer")) {//if the job title is Java Developer, then we need to print the name this employee
                System.out.println(each.name);//Josh,Bella

                System.out.println("_________________________________________________________________");
            }
        }

        double max = employees.get(0).salary;
        double min = employees.get(0).salary;

        for (Employee each : employees) {
            if (each.salary > max) {
                max = each.salary;
            }
            if (each.salary < min) {
                min = each.salary;
            }
        }
        System.out.println("max = " + max);//max = 130000.0
        System.out.println("min = " + min);//min = 90000.0

    System.out.println("___________________________________________________");

    ArrayList<Employee>femaleEmployees = new ArrayList<>();
    ArrayList<Employee>maleEmployees = new ArrayList<>();
    for(Employee employee: employees){
        if(employee.gender == 'M') {//if the employee is male
            maleEmployees.add(employee);
        }else{
            femaleEmployees.add(employee);
        }}
    System.out.println("Total number of female employees "+femaleEmployees.size());//Total number of female employees 2
    System.out.println("Total number of male employees: "+maleEmployees.size());//Total number of male employees: 3
    }}



    /*
1. Given the following arraylist of Employees:
    ArrayList<Employee> employees = new ArrayList<>();
    employees.addAll(Arrays.asList(
           new Employee(), new Employee(), new Employee(), new Employee(), new Employee()
    ));

    employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
    employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
    employees.get(1).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
    employees.get(1).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
    employees.get(1).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

    Note: Employee class is imported from day17 package

    1.1 Write a program that can display the name and job title of each employee

    1.2 Write a program that can display the names of "Java Developers"

    1.3 Write a progam that can display the maximum and minimum salary

    1.4 Create two arraylists named femaleEmployees and maleEmployees, write a program that
     can add all the female employees and male emloyees to the femaleEmployees and maleEmployees arraylists

*/

