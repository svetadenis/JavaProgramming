package week11_OfficeHours;

public class Hobby {
    String name;
    double annualCost;
    boolean isOutdoors;
    boolean requiresOthers;

    public Hobby(String name, double annualCost, boolean isOutdoors, boolean requiresOthers) {
        this.name = name;
        this.annualCost = annualCost;
        this.isOutdoors = isOutdoors;
        this.requiresOthers = requiresOthers;
    }

    public void doIt(){
        System.out.println("Doing " + name + (isOutdoors ? " outdoors" : " indoors"));
    }

    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", annualCost=" + annualCost +
                ", isOutdoors=" + isOutdoors +
                ", requiresOthers=" + requiresOthers +
                '}';
    }
}
/*
Hobby [classes, constructors, ArrayList]

    create a class called Hobby
        instance variables:
            name, annual cost, is outdoors (boolean), requires others (boolean)

        create a constructor to initialize all the instance variables

        methods:

            doIt():
                print: Doing $name-of-hobby $outside-or-inside
                    ex: new Hobby("golf", 1000, true, false).doIt() -> Doing golf outside
                    ex: new Hobby("puzzles", 50, false, true).doIt() -> Doing puzzles inside

            toString()
                return all the Hobby information

    Create a separate class to create and test the Hobby objects

        - create an ArrayList of Hobby objects
        - create and add Hobby objects
        - iterate through the ArrayList and execute the doIt() method on each Hobby object
        - create a copy ArrayList and remove all outdoors Hobbies
        - create a copy ArrayList and remove all hobbies requiring other people
        - create a copy ArrayList and remove all hobbies that cost more than $500 annually
 */