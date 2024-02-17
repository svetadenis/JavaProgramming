package day11_string;

public class StringMethods2 {
    private static int ch;

    public static void main(String[] args) {

        String sentence = "I love Python. Python is the best programming language, and Python is in high demand.";
        sentence.replace("Python", "Java");
        System.out.println(sentence);//the sentence was not changed. we need to creat the new string

        sentence = sentence.replace("Python", "Java");
        System.out.println(sentence);
        //__________________________________________________________________________

        String word = "Java";
        word=word.replace('a','e');//"Java"
        System.out.println(word);//Jeve
        //__________________________________________________________________________

        String sentence2 = "I love Java, Java is cool";
        sentence2 = sentence2.replace("Java", "e");
        System.out.println(sentence2);//I love e, e is cool
        //__________________________________________________________________________

        String sentence3 = "Java is fun. Java is cool.";
       // sentence3 = sentence3.replace("Java","Python");
        //System.out.println(sentence3);//Python is fun. Python is cool.
        sentence3=sentence3.replaceFirst("Java", "Python");
        System.out.println(sentence3);//changes just only first Java, because replaceFisrt method
        //__________________________________________________________________

        String sentence4 = "I love Java Programming";
        //                  012345678910
        String languageName = sentence4.substring(7,10+1);//+1 because the last index is excluded
        System.out.println(languageName);

        System.out.println("___________________________________________________");

        String sentence5 = "Today is Sunday. Tomorrow is Monday";
        //                  0123456789...
        //String today = sentence5.substring(9,14);//y is excluded, In order to add the last index y,
        //we need to add +1
        String today = sentence5.substring(9,14+1);
        System.out.println(today);//Sunday
        //________________________________________________________________________________

        String email = "CydeoSchoolJavaProgramming@gmail.com";
        //looking for the first character after @
        int beginning  = email.indexOf('@')+1;
        int ending = email.lastIndexOf('.');
        String domain = email.substring(beginning, ending);//вытаскивает из строки gmail
        System.out.println(domain);//gmail
        //____________________________________________________________________

        String sentence6 = "I love Java programming";
        //                  01234567
        String r1=sentence6.substring(7, sentence6.length());
        System.out.println(r1);//Java programming

        //____________________________________________________________________

        String sentence7 = "Today is Sunday, Tomorrow is Monday";
        String tomorrow = sentence7.substring(sentence7.lastIndexOf(' ')+1);//пробел
        System.out.println(tomorrow);//Monday

        //__________________________________________________________________
        String sentence8 = "I study at Cydeo School";
        //                  01234567891011
        String schoolName = sentence8.substring(11);
        System.out.println(schoolName);//Cydeo School
        //___________________________________________________________________

        String str = "Python";
        //String result = str.repeat(10);
        String result1 = (str+"\n").repeat(10);
        System.out.println(result1);//PythonPythonPythonPythonPythonPythonPythonPythonPythonPython























    }}

