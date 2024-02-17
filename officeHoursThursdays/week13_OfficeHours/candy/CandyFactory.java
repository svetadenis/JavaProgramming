package week13_OfficeHours.candy;

public class CandyFactory {
    public static void main(String[] args) {

        Twix twix = new Twix("Mars", 10, true);

        HersheyBar hersheyBar = new HersheyBar("Hersey", 15, false);

        HersheyKiss hersheyKiss = new HersheyKiss("Hersey", 20, false);

        System.out.println(twix);
        System.out.println(hersheyBar);
        System.out.println(hersheyKiss);

        // calling the static variables that were inherited

        Candy.totalNumberOfCandyCompanies++;
        System.out.println(Candy.totalNumberOfCandyCompanies);
        System.out.println(Twix.totalNumberOfCandyCompanies);
        System.out.println(HersheyBar.totalNumberOfCandyCompanies);
        System.out.println(HersheyKiss.totalNumberOfCandyCompanies);

    }
}

