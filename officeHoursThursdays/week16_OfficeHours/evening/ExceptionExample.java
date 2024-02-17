package week16_OfficeHours.evening;

public class ExceptionExample {
    public static void main(String[] args) {
        String email = "cydeo.gmail.com"; // it is missing @ sign
        System.out.println("Thank you for your email: " + email);

        if(!email.contains("@")) {
//SHOW ERROR AND STOP RIGHT HERE
            throw new RuntimeException("Invalid email!");
        }

        System.out.println("Thank you for your email: " + email);

        //code that rely on email below here


    }
}

