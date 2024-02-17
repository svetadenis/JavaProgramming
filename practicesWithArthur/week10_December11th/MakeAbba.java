package week10_December11th;

public class MakeAbba {
    public static void main(String[] args) {
        System.out.println(makeAbba("Best", "Java"));
    }

    public static String makeAbba(String a, String b) {
        //solution1
        // String result = "";
        //       result += a;
        //       result += b;
        //       result += b;
        //       result += a;
        //       return result;

  /*In Java, there is no specific concat method for concatenating strings.
  The concat method is a string method in Java, and it is used to concatenate
  one string to the end of another. Here's an example:*/
        //solution2
        //return a.concat(b).concat(b).concat(a);

        //solution3
        //return a + b + b + a;

  /*Append method, it is commonly used with StringBuilder  classes in Java
  for efficient string concatenation. Unlike string concatenation
  using the + operator, which creates a new string each time,
  the append method modifies the existing StringBuilder object,
  making it more efficient for concatenating multiple strings.
  Here's an example:*/
        //solution4
        // StringBuilder result = new StringBuilder();
        // result.append(a).append(b).append(b).append(a);
        // return result.toString();

        //solution5
        //   StringBuilder result = new StringBuilder();
        // return (result.append(a).append(b).append(b).append(a)).toString();



        //solution6
        // StringBuilder result = new StringBuilder(a+b+b+a);
        //       return result.toString();

        //solution7

        return new StringBuilder(a+b+b+a).toString();

    }
    }

