package week12_OfficeHours;

public class Country {
    public static String planet;
    public static double worldPopulation;
    public static double worldCo2Level;

    public String name;
    public long population;
    public String continent;

    static {
        System.out.println("STATIC BLOCK RUN");
        planet = "Earth";
        worldPopulation = 7.88;
        worldCo2Level = 417.83;
    }

    public Country(String name, long population, String continent) {
        System.out.println("CONSTRUCTOR RUN");
        this.name = name;
        this.population = population;
        this.continent = continent;
    }

    public static void printAllStatic(){
        System.out.println("Planet: " + planet + "\nWorld population " + worldPopulation + " billion\nWorld CO2 Level: " + worldCo2Level + " ppm");
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", continent='" + continent + '\'' +
                '}';
    }
}

/*
Country [static, instance, class, object]

    Create a class Country
    define these static variables:
        planet - Earth
        world population - 7.88 billion - represent billions
        world co2 level - 417.83 - represents the unit is ppm (parts per million)

    define these instance variables:
         name, population, continent

    create a static block to initialize the static variables

    create a constructor to initialize the instance variables

    create a different class to test the Country objects and static variables
 */

