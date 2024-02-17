package week13_OfficeHours.season;

public class Fall extends Season{
    public Fall(double highestAvgTemp, double lowestAvgTemp) {
        super(highestAvgTemp, lowestAvgTemp);
    }

    @Override
    public void activity() {
        System.out.println("Read a book");
    }
}
/*
    Create a class Fall
        child class of Season

        constructor: set values to variables

        methods:
            activity(): Read A Book
 */