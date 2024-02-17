package day3_variables_practices;

public class Movie {
    public static void main(String[] args) {

    String firstName = "Noah";
    String lastName = "Smith";
    String companyName = "Apple";
    int salary = 200000;
    int startDay = 10;
    int startMonth = 1;
    int startYear = 2022;
    boolean fullTime = true;
    String officeAddress = "One Apple Park Way, Cupertino, CA 95014";


    String fullName = firstName + " " +lastName;
    String fullStartDay = startMonth + "/" +startDay +"/" +startYear;

    String email = firstName + startDay +"@" + companyName +".com";
    int salaryAfterTwoYears = salary + salary*15/100;

    System.out.println("Employee Information");
    System.out.println("We have " + fullName + " joining " + companyName);
    System.out.println(firstName+" will start on " + fullStartDay + " as full time: " + fullTime);
    System.out.println(firstName + " here is some information about your employment");
    System.out.println("Your email is " + email );
    System.out.println("Your base salary is $" + salary + " and after 2 years it will be $" + salaryAfterTwoYears);
    System.out.println("Welcome aboard, see you at " + officeAddress);





}}
/*
### A new movie is being screened and the information is being displayed. Declare and assign the following variables to complete the information:

> Declare a `String` variable named `movieName` and assign `Spider-Man` as the value

> Declare a `String` variable named `releaseDate` and assign `12/17/2021` as the value

> Declare a `String` variable named `genre` and assign `Action/Adventure` as the value

> Declare a `int` variable named `rottenTomatoesRating` and assign `97` as the value

> Declare a `String` variable named `rating` and assign `PG-13` as the value

> Declare a `double` variable named `duration` and assign `2.5` as the value

> Declare a `boolean` variable named `isSequel` and assign `true` as the value

> Declare a `boolean` variable named `isOnDvd` and assign `false` as the value

**Note**: The only thing you need to do is create and assign the variables, you should not write any print statements.

Main topics: variables, primitive datatypes, concatenation
 */