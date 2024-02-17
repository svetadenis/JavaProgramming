package week16_OfficeHours;

    public class NonResidentException extends RuntimeException{
        public NonResidentException(){
            super("Need to be a Resident");
        }
    }

/*
Create a class NonResidentException
    make this a unchecked exception

    create a constructor to accept the String argument and pass it to the super constructor
 */

