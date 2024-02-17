package week4OfficeHours;

public class T2CharTaskOscar {
    public static void main(String[] args) {
        char c = 'e';

        boolean isUpperCase = c >= 'A' && c <= 'Z';
        boolean isLowerCase = c >= 'a' && c <= 'z';

        if(isUpperCase){
            System.out.println(c + " is Upper Case character");
        } else if (isLowerCase) {
            System.out.println(c + " is Lower Case character");
        }else {
            System.out.println(c + " is not alphabetic");
        }

    /*    System.out.println(c++); // post increment
        System.out.println(c);*/

        if( (c <= 'w' && isLowerCase) || (c <= 'W' && isUpperCase) ){  // we need to check uppercase and lowercase situation
            System.out.println("Original character : " + c);
            System.out.println("The first character : " + ++c);
            System.out.println("The second character : " + ++c);
            System.out.println("The third character : " + ++c);
        } else {
            System.out.println("You are too close the end of alphabet");
        }
    }
}
