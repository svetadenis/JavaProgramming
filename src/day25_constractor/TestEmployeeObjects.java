package day25_constractor;

import java.time.LocalDate;

public class TestEmployeeObjects {
    public static void main(String[] args) {

        Employee e1 = new Employee("Maria",32,'M',"Java",95000, LocalDate.of(2022,11,5));
        System.out.println(e1);//Employee{name= 'Maria', age= 32, gender =M, jobTitles= 'Java', salary= 95000.0, hired_date= November/05/2022}

        Employee e2 = new Employee("Sveta",18,'F',"Tester",199000,LocalDate.of(2021,6,30));
        System.out.println(e2);//Employee{name= 'Sveta', age= 18, gender =F, jobTitles= 'Tester', salary= 199000.0, hired_date= June/30/2021}

    }

}
