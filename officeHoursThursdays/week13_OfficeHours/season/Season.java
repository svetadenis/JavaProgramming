package week13_OfficeHours.season;

public class Season {
    String name;
    double highestAvgTemp;
    double lowestAvgTemp;

    public Season(double highestAvgTemp, double lowestAvgTemp) {
        this.name = getClass().getSimpleName();
        this.highestAvgTemp = highestAvgTemp;
        this.lowestAvgTemp = lowestAvgTemp;
    }

    public void activity(){
        System.out.println("Activity to do in the season");
    }

    public String toString(){
        return name + " with temperatures between: " + highestAvgTemp + " - " + lowestAvgTemp;
    }
}
/*

Season [overriding, inheritance, constructors]

    Create a class Season

        instance variables
            - name
            - highest average temperature
            - lowest average temperature

        constructor:
            - initialize all fields

        methods:
            - activity(), toString()
            override activity in sub classes



 */

