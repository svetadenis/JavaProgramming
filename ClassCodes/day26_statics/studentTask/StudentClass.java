package day26_statics.studentTask;

public class StudentClass {
    public String name;
    public int age;
    public char gender;
    public String id;

    //constractor allow ud to create instances of the class
    public StudentClass(String name, int age, char gender, String id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
    }

    public void study(){
        System.out.println( name + " is studying");//This method represents the action of a student studying.
        // It simply prints a message indicating that the student is studying.
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                '}';
    }
}


/*
1. CydeoStudent Task
		1. Create a class named CydeoStudent:

    Attributes:
        instances: name, age, gender, id,

    Add a constructor that can set All the fields (instances)

    Actions:
        study()
        toString()

 */