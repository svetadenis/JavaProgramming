package day28_encapsulation.encapsulation;

public class Student {

    private String name;
    private int age;

     public int getAge(){//read only
         if(age ==0){
             System.out.println("Age has not been set");
             System.exit(1);
         }
         return age;
     }
    public void setAge(int age) {//write only
        if (age < 1 || age > 100) {//if the age is invalid
            System.err.println("Invalid Age: " + age);
            //return;//exiting the method
            System.exit(1); //program get terminated
        }
        this.age = age;
    }

    public String getName() {
         if (name==null){
             System.out.println("Name has not been set");
             System.exit(1);
         }
        return name;
    }
    public void setName(String name) {
         boolean hasDigit = false;
         for (char each:name.toCharArray()){
             if(Character.isDigit(each)){
                 hasDigit = true;
                 break;
             }
         }
         if(hasDigit){
             System.out.println("Invalid name:"+name);
             System.exit(1);
         }
        this.name = name;
    }
}

