package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;


public class TestPersonObjects {
    public static void main(String[] args) {

    Person[] people = {new Person(), new Person(), new Person(), new Person(), new Person()};
    people[0].setInfo("Daniel",'M', LocalDate.of(1982,2,25));
    people[1].setInfo("Tom",'M', LocalDate.of(1982,3,13));
    people[2].setInfo("Ira",'F', LocalDate.of(1990,4,05));
    people[3].setInfo("Olga",'F', LocalDate.of(1993,11,20));
    people[4].setInfo("Vasiliy",'M', LocalDate.of(1991,1,18));

    ArrayList<Person> studentsList = new ArrayList<>();
    studentsList.addAll(Arrays.asList(people));

    for (Person person : studentsList) {
        System.out.println(person);
    /*
Person{name='Daniel', age=41, gender=M, dateOfBirth=1982-02-25}
Person{name='Tom', age=41, gender=M, dateOfBirth=1982-03-13}
Person{name='Ira', age=33, gender=F, dateOfBirth=1990-04-05}
Person{name='Olga', age=30, gender=F, dateOfBirth=1993-11-20}
Person{name='Vasiliy', age=32, gender=M, dateOfBirth=1991-01-18}
     */

//remove students, who is ages is greater then 65

studentsList.removeIf(person1 -> person1.age>65);//{
    for (Person each:studentsList){
        System.out.println(person);
    }

// Now 'studentsList' contains only students with age less than or equal to 65











    }
}}
