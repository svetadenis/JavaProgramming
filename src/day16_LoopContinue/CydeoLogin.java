package day16_LoopContinue;
import java.util.Scanner;
public class CydeoLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username");
        String user_name=input.next();
        System.out.println("Enter your password");
        String password=input.next();

        if(user_name.equals("Cydeo") && password.equals("WoodenSpoon")){//if the credentials are correct
            System.out.println("Logged in");
        }else{//otherwise if the credentials are incorrect
            for (int i=0;i<3; i++){//i:0,1,2
                System.out.println("Incorrect username or password, please re-enter");

                System.out.println("Enter your username");
                user_name= input.next();

                System.out.println("Enter your password:");
                password=input.next();

                if(user_name.equals("Cydeo") && password.equals("WoodenSpoon")){
                System.out.println("You are now logged in");
                break;//if the user exits the calid credentials, exit the loop
            }
            }
            if(! (user_name.equals("Cydeo") && password.equals("WoodenSpoon"))){//after all three attempts, if the user_name and password are still incorrect
            System.out.println("Your account now is locked, please contact with the support team");
        }
        }
        input.close();

    }
    public static void CydeoLogin(String user_name, String password){
        if(user_name.equals("Cydeo") && password.equals("WoodenSpoon")){
            System.out.println("Logged in");
        }else{
            System.out.println("Invalid credentials");
        }

    }
}
/*

Warmup tasks:
	1. Create a class named CydeoLogIn. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."

                If the credentials are not matched, the program should allow
                the user to have three attempts to enter correct credentials

                if all three attempts are failed, then print "Your account is lucked."
 */