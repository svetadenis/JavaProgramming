package week13_OfficeHours.season;

public class Winter extends Season{
    public Winter(double highestAvgTemp, double lowestAvgTemp) {
        super(highestAvgTemp, lowestAvgTemp);
    }

    @Override
    public void activity() {
        System.out.println("Use Fireplace");
    }
}
/*
    Create a class Winter
        child class of Season

        constructor: set values to variables

        methods:
            activity(): Print Use Fireplace
 */
