package week16_OfficeHours;


public class Library {

    public static void getLibraryCard(String city){
        if(city.equalsIgnoreCase("fairfax") || city.equalsIgnoreCase("mclean")){
            System.out.println("Library card created");
        } else {
            throw new NonResidentException();
        }
    }

    public static void borrow(boolean checkedOut) throws FailToCheckoutException{

        if(checkedOut){ // I flipped the logic to make more sense. if book is checked out it is not available -> exception happens
            throw new FailToCheckoutException("Book checked out");
        }

        System.out.println("Enjoy reading");
    }
}
/*

Create a class Library

    create a method getLibraryCard(String city)

        if the city is Fairfax or McLean print Library Card Created

        but if it is any other city throw your NonResidentException
            -> give a message in the constructor call

    create a method borrow(boolean checkedOut)

        if the given checkedOut boolean is true print "Enjoy reading"

        but if the boolean is false throw your FailToCheckOutException

        -> handle this exception in the runner file

Create a class to run the code by calling the methods and seeing the result with different inputs to see how the exceptions were related to the execution
 */