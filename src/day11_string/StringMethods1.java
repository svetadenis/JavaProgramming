package day11_string;

public class StringMethods1 {
    public static void main(String[] args) {

    String str1 = "CYDEO SCHOOL";
    /*str1.toLowerCase();//"cydeo school"
    System.out.println(str1);//still prints uppercase letters, because strings objects are
    immutable. Once it's created, it can't be changed*/
    str1 = str1.toLowerCase();// we have to reassign str1 to another variable
    System.out.println(str1);// it gave us a new string

    //__________________________________________________________________________

    String str2 = "Java programming";
    /*str2.toUpperCase();//"JAVA PROGRAMMING
     System.out.println(str2); still got a lowercase version, because string is immutable.*/
    String str3 = str2.toUpperCase();//so we need to reassign this string variable to another variable
    System.out.println(str3);
    //___________________________________________________________________________

    String word = "wooden spoon";
    word.toUpperCase();//"WOODEN SPOON"
    word.toLowerCase();//"wooden spoon"
    System.out.println(word);//it's still prints the first string despite it was created three strings.
    //because the storage was created just for the first one
    word=word.toUpperCase();
    System.out.println(word);// it was printed with upper case because we reassigned string variable
    word = word.toLowerCase();//it will be printed with the lowercase now, because we reassigned variable
    System.out.println(word);

    //______________________________________________________________________________

    String str4 = "           Cydeo School";
    str4.trim();//"Cydeo School"
    System.out.println(str4);//prints with white spaces
    str4 = str4.trim();
    System.out.println(str4);//print without the white spaces because we reassigned
    //variable to another variable

    String sentence1 = "Today is Sunday. We have Java Class";
    //sentence1.indexOf('w');//checks charecters from left to right
    int index1 = sentence1.indexOf('w');
    System.out.println(index1);

    String s1 = "I love Java Programming";
    int firstA= s1.indexOf("a");
    System.out.println(firstA);// 8th characters. the first letter a in a sentence

    int secondA = s1.indexOf("a ");//the program is looking for index a with the space
    System.out.println(secondA);//10th characters. don't forget the count starts from 0, not from 1

    String s2 = "Java Python JavaScript   Cydeo Python";
    //           0123 456789 101112131415
    int a1 = s2.indexOf('a');
    System.out.println(a1);//1st
    //int a2 = s2.indexOf('a');//it's always to return to first matching character not for the second one
    int a2 = s2.indexOf("a Python");
    System.out.println(a2);//3d
    int a3 = s2.indexOf("avaS");//every time we need to give unic specification of character in string
    System.out.println(a3);//13th
    int a4 = s2.indexOf("aS");
    System.out.println(a4);//15th

    //___________________________________________________________________________
    String w = "Java";
    //          0123
    System.out.println(w.indexOf('a'));//1
    System.out.println(w.lastIndexOf('a')); //3

    String w2 = "Java Python JavaScript Cydeo Python";
    //           0123 456789 10111213
    System.out.println(w2.lastIndexOf('a'));//15
    System.out.println(w2.lastIndexOf('P'));//29//last character P















}}
