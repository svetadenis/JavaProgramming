package day17_customClass;

public class Dog {

    public String name;//name for the object to store the name (name="Max" for example)
    //instance variable. it can be for any objects
    public String breed;//4 instance fields
    public String size;
    public char gender;
    public int age;
    public String color;

    public void setInfo(String name, String breed, char gender, int age, String size, String color){
        //                  "Max"         "Hucky"        "M"      4        'small'            "white"
        this.name=name;//this keyword is used for calling the instancce variable name
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color=color;

    }

    public void eat(){
        System.out.println(name+" is eating");//two instance methods
    }
    public void drink(){
        System.out.println(name+ " is drinking water");
    }


    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }


    }


