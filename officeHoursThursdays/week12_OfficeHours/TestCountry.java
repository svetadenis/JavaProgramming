package week12_OfficeHours;

public class TestCountry {
    public static void main(String[] args) {
        System.out.println("HELLO");
        Country turkey = new Country("Turkey", 20_000_000, "Asia");
        System.out.println(turkey);

        Country.printAllStatic(); // Q: do we call the static block again? -> no

        Country canada = new Country("Canada", 1_500_000, "North America");
        System.out.println(canada);
    }
}
