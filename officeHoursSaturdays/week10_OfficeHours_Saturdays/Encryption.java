package week10_OfficeHours_Saturdays;

    public class Encryption {
    /*

Encryption [class, instance, static, methods, loop, String, constructor]

    Create a class Encryption

    define these instance variables
        message (String)
        modify number
        factor number

    create a constructor that will initialize the message
    create a constructor that will initialize the message, modify number, and factor number
        call the encrypt method here

    create a toString method that will only print the message variable

     */

        String message;
        int modifyNumber;
        int factorNumber;

        public Encryption(String message) {
            this.message = message;
        }

        public Encryption(String message, int modifyNumber, int factorNumber) {
            this(message);
            this.modifyNumber = modifyNumber;
            this.factorNumber = factorNumber;
            encrypt(); // calling the method here allows the message to be encrypted as soon as the object is created, but this method only runs automatically when the 3 arg constructor is called
        }

        public String toString(){
            return message;
        }

    /*
        create a method encrypt (instance)
        return: void
        parameters: none

        To encrypt every character of the message we will take the modified number and add it to ascii value of each character. Then we will multiply the result by the factor number. After encrypting reassign the encrypted version into the message variable

        Ex:
            message = "james bond"
            modify num: 20
            factor num: 2

            message: 252 234 258 242 270 104 236 262 260 240
     */

        public void encrypt(){
            String encrypted = "";
            for(char each : message.toCharArray()){
                encrypted += (each + modifyNumber) * factorNumber + " ";
            }
            message = encrypted.trim();
        }

    /*
        create a method decrypt (static)
        return: String
        parameters: message, modify number, factor number

        Given the modify and factor numbers decrypt the message and return the decrypted String. Do the reverse steps we did for encrypting

        Ex:
        message: 252 234 258 242 270 104 236 262 260 240
        modify num: 20
        factor num: 2

        -> james bond
     */


        public static String decrypt(String message, int modifyNumber, int factorNumber){

            String decrypted = "";

            for(String each : message.split(" ")){
                decrypted += (char)(Integer.parseInt(each) / factorNumber - modifyNumber);
            }

            return decrypted;

        }


    }

