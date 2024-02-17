package week13_OfficeHours_Saturdays.language;

public class English implements Language{
    @Override
    public void hello() {
        System.out.println("Hello");
    }

    @Override
    public String bye() {
        return "Bye";
    }
}