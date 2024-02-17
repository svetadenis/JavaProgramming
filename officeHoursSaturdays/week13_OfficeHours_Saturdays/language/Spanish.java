package week13_OfficeHours_Saturdays.language;

public class Spanish implements Language{
    @Override
    public void hello() {
        System.out.println("Hola");
    }

    @Override
    public String bye() {
        return "Adios";
    }
}