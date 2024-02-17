package week11_December18th.String1;

public class FrontAgain {
    public static void main(String[] args) {

        System.out.println(frontAgain("André Aciman"));

}
    public static boolean frontAgain(String str) {

        //solution1
        //First screen out the length < 2 case to avoid index problems with the later code.
        // Grab the two strings with substring() and compare them
        // with equals(). Return the result of equals() directly -- don't need
        // check if it's true or false. Here the two strings are stored in local

        //str=str.toLowerCase();
        // if (str.length() < 2) {
        //   return false;
        //   }
        //   String front = str.substring(0, 2);
        // String back = str.substring(str.length()-2);

        //     return(front.equals(back));

        //solution2(Variables makes the code simpler but longer.
        //Remove variables and Merge if statement and return part)
        //str=str.toLowerCase();
        //return str.length()>=2 && str.substring(0, 2).equals(str.substring(str.length()-2));

        //solution3 (endsWith() Method)
        str=str.toLowerCase();
        return str.length()>=2 && str.endsWith(str.substring(0, 2));
    }

}

