package day24_dateAndTime;

import java.time.LocalDate;
public class Person {
   public String name;
   public int age;
   public char gender;
   public LocalDate dateOfBirth;

    public void setInfo(String name, char gender, LocalDate dateOfBirth) {
        this.name = name;//through Generate->constractor
        this.gender = gender;//through Generate->constractor
        this.dateOfBirth = dateOfBirth;//through Generate->constractor
        this.age = LocalDate.now().getYear() - dateOfBirth.getYear();//manually
    }

    public String toString() {//through Generate->toStringMethod
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}

