package Week3_OfficeHours_Saturdays;

public class ATM {
    public static void main(String[] args) {

    int pincode = 2023;
    int accountNumber = 5422;

    // this user that we are trying to log into has the passcode 2023 and accountNumber 5424
    boolean validPin = pincode == 2023;
    boolean validAccount = accountNumber == 5424;

    if(validPin && validAccount){
        System.out.println("Logged in. What would you like to do....");
    } else {

        if(!validPin){
            System.out.println(pincode + " pincode did not match");
        }

        if(!validAccount){
            System.out.println(accountNumber + " account number did not match");
        }}


    }}


