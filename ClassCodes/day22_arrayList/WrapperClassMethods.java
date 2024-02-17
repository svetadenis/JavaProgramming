package day22_arrayList;

public class WrapperClassMethods {
    public static void main(String[] args) {

   String str = "20";
    System.out.println(str+1);//201

    Integer.parseInt(str);
    System.out.println(str);//20

    //Integer num1 = Integer.parseInt(str);//unboxing
    int num = Integer.parseInt(str);//unboxing
    System.out.println(num);//20
    System.out.println(num+1);//21

    Integer num2 = Integer.valueOf(str);
    System.out.println(num2);//20

    System.out.println("____________________________________________________");

    String s = "20.5";
    double num3 = Double.parseDouble(s);
    Double num4 = Double.valueOf(s);
    System.out.println(num3);//20.5
    System.out.println(num4);//20.5

    System.out.println("__________________________________________________");

    String x = "true";
    boolean r1 = Boolean.parseBoolean(x);//returns primitive type, "unboxing"
    boolean r2 = Boolean.valueOf(x);//returns wrapper class object autoboxing

    System.out.println(r1);//true
    System.out.println(r2);//true

    System.out.println("__________________________________________________");

     String x2 = "Maybe";
     boolean r3 = Boolean.parseBoolean(x2);//returns primitive type, "unboxing"
     boolean r4 = Boolean.valueOf(x2);//returns wrapper class object autoboxing

     System.out.println(r3);//false, because boolean can be true,or false,it can't be maybe
     System.out.println(r4);//false, because boolean can be true,or false,it can't be maybe

     System.out.println("_____________________________________________________");

     char ch = 'A';
     boolean isDigit = Character.isDigit(ch);
     System.out.println("isDigit = "+isDigit);//false
     boolean isLetter = Character.isLetter(ch);
     System.out.println("isLetter is = "+isLetter);//true
     boolean isLowerCaseLetter = Character.isLowerCase(ch);
     System.out.println("isLowerCaseLetter = "+isLowerCaseLetter);//false
     boolean isUpperCaseLetter = Character.isUpperCase(ch);
     System.out.println("isUpperCaseLetter = " + isUpperCaseLetter);//true

     boolean isSpecialChar = !Character.isLetterOrDigit(ch);//cpecial character
     System.out.println(isSpecialChar);//false

     System.out.println("____________________________________________________");

     String string = "a1b2c3d4e5";
     int sum = 0;
     for(char each: string.toCharArray()){
      if(Character.isDigit(each)){
       sum = sum+Integer.parseInt(""+each);
      }
     }
     System.out.println(sum);//15
     System.out.println("____________________________________________________");


    }
}
