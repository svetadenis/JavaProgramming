package week13_OfficeHours.season;

public class Summer extends Season{
    public Summer(double highestAvgTemp, double lowestAvgTemp) {
        super(highestAvgTemp, lowestAvgTemp);
    }

    @Override
    public void activity() {
        System.out.println("Drink Lemonade");
    }
}
/*
 Create a class Summer
        child class of Season

        constructor: set values to variables

        methods:
            activity(): Drink Lemonade

 */