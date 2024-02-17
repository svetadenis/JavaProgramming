package week15_OfficeHours.generator;

public class Runner {
    public static void main(String[] args) {

        SolarGenerator solarGenerator = new SolarGenerator(100, 1000, 500);
        solarGenerator.run();

        Generator solarGenerator2 = new SolarGenerator(150, 2000, 1200);
        solarGenerator2.run();

        Object solarGenerator3 = new SolarGenerator(80, 750, 350);
        //solarGenerator3.run();
        ((Generator)solarGenerator3).run();

        GasGenerator gasGenerator = new GasGenerator(40, 500, 350);
        gasGenerator.run();

        Generator gasGenerator2 = new GasGenerator(35, 300, 200);
        gasGenerator2.run();

        Object gasGenerator3 = new GasGenerator(20, 250, 250);
        //gasGenerator3.run();
        ((Generator)gasGenerator3).run();

    }
}

/*
    create a separate class to Test the SolarGenerator and GasGenerator objects with different references
 */

