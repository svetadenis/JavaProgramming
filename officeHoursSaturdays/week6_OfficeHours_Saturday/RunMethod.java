package week6_OfficeHours_Saturday;

public class RunMethod {
    public static void main(String[] args) {

        double euroConvert = CurrencyConverter.convertTo("euro", 100);
        System.out.println(euroConvert);

        System.out.println(CurrencyConverter.convertTo("yen", 50));

        // use Scanner for the arguments
        //System.out.println(CurrencyConverter.convertTo(nextLine, nextDouble));

        //invalid data
        System.out.println(CurrencyConverter.convertTo("pounds", 10));

        System.out.println("=================================");
        MultiplicationTable.printMultiplicationTableFor(5);
        System.out.println("=================================");
        MultiplicationTable.printMultiplicationTableFor(13);

        System.out.println("=================================");
        MultiplicationTable.printMultiplicationTableFor( 25);

        System.out.println("=================================");

        System.out.println(Palindrome.reverse("hello world"));
        System.out.println(Palindrome.isPalindrome("racecar"));
        System.out.println(Palindrome.isPalindrome("abcd"));

        System.out.println("=================================");
        System.out.println(Palindrome.isPalindrome2("anna"));


    }
}