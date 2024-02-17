package week14_OfficeHours_Saturdays;

public class ExceptionExample {
    public static void main(String[] args) {

        try {
            String s = "james";
            System.out.println(s.charAt(1000));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("INDEX OUF OF BOUNDS");
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NO OBJECT");
        }

        System.out.println("END");
    }}