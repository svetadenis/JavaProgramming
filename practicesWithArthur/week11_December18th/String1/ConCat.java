package week11_December18th.String1;

public class ConCat {
    public static void main(String[] args) {
        System.out.println(conCat("abc", "cat"));
    }
    public static String conCat(String a, String b) {

        //solution1
        // if (a.length() == 0 || b.length() == 0 )
        //   return a+b;
        // if ((a.substring(a.length() - 1)).equals(b.substring(0,1)))
        //   return a + b.substring(1);
        // else
        //   return a+b;



        //solution2
        // return (a.length() != 0 && b.length() != 0 &&
        //         a.substring(a.length()-1).equals(b.substring(0,1)))? a+b.substring(1) : a+b;

        //solution3(charAt method)
            /*(In Java, the equals() method is used to compare the contents of
              two objects for equality. When it comes to comparing characters,
              the equals() method is not directly available for the char data
              type because char is a primitive data type, not an object.
              However, you can compare characters using the == operator,
              which checks if two characters have the same value.)*/

        // return (a.length() > 0 && b.length() > 0 && a.charAt(a.length()-1)==b.charAt(0))?
        //                                                         a+b.substring(1) : a+b;

        //solution4(endsWith() Method)
        return (a.length() > 0 && b.length() > 0 &&a.endsWith(b.substring(0,1)))?
                a+b.substring(1) : a+b;



    }

}

