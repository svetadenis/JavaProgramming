package day11_string;

public class StringMethods3 {
    public static void main(String[] args) {
        String word = "";
        boolean r1 = word.isEmpty();
        System.out.println(r1);//true
        //----------------------------------------------------------------------

        String str = "        ";
        boolean r2 = str.isEmpty();
        boolean r3 = str.isBlank();//blank means space
        System.out.println(r2);//false
        System.out.println(r3);//true
        //______________________________________________________________________
        String str1 = "Cydeo";
        String str2 = new String("Cydeo");//line 16 and 17 are two diffewrent objects
        System.out.println(str1);
        System.out.println(str1.equals(str2));//true
        String str3 = new String("cydeo");
        System.out.println(str2.equals(str3));//false, Cydeo line 17 begins from Uppercase and in line 20 begins from lowercase

        //----------------------------------------------------------------------
        String s1 = "Java";
        String s2 = "java";
        System.out.println(s1.equals(s2));//false, line 24 begins from UpperCase, line 25 begins from lowerCase

        //________________________________________________________________________

        String students = "Hasan Naran Sumeve";
        boolean hasAhmed = students.contains("Ahmed");
        System.out.println("hasAhmed = " + hasAhmed);//false, we don't have Ahmed in a string line 30

        String sentence = "My favorite programming language is JAVA";
        boolean hasJava = sentence.toLowerCase().contains("Java");
        System.out.println("hasJava = " +hasJava);//false, Java in a string 34 is UpperCase
        //_________________________________________________________________________

        String name = "Micheal";
        boolean l = name.startsWith("Da");
        System.out.println(l);//false, because the string line 39 starts with Mi, not with Da

        String url = "www.cydeo.com";
        boolean isValid = url.startsWith("www.");
        System.out.println(isValid);//true
        //_______________________________________________________________________

        String email = "CydeoSchool@gmail.com";
        boolean isGmail = email.endsWith("gmail.com");
        boolean isYahoo = email.endsWith("yahoo.com");
        boolean isHotMail = email.endsWith("hotmail.com");
        System.out.println("isGmail = " +isGmail);//true
        System.out.println("isHotMail = " +isHotMail);//false
        System.out.println("isHotMail = " +isHotMail);//false




        //



    }
}
