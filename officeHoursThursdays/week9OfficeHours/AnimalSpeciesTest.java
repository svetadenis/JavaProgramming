package week9OfficeHours;

public class AnimalSpeciesTest {

public static void main(String[] args) {

    T2AnimalSpecies lions = new T2AnimalSpecies();
    lions.setInfo("Lion", 15, 1.5);
    System.out.println(lions);

    System.out.println(lions.calculateInYears(20));

    T2AnimalSpecies pandas = new T2AnimalSpecies();
    pandas.setInfo("Panda", 10, -0.5);
    System.out.println(pandas.calculateInYears(25));

}
}

