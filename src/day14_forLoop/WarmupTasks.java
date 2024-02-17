package day14_forLoop;

public class WarmupTasks {
    public static void main(String[] args) {//task 1
        String str3 =combine("one","eight");
        System.out.println(str3);
        System.out.println("_________________________________________________________________________");

        System.out.println(sumOf2IntegerNumbers(10,20));//task 2
        System.out.println(sumOf3IntegerNumbers(10,20,30));
        System.out.println(sumOf4IntegerNumbers(10,20,30,40));

    }
    public static String combine(String str1, String str2) {//task 1

        String result = "";
        //                   first character of the string
        if (str1.endsWith("" + str2.charAt(0))) {//if the first string ends from the first character of the second string
//     last character of the string
            result = str1 + str2.substring(1);//oneight
        } else {
            result = str1 + str2;//oneeight
        }
        return result;
    }

    /* if (str1.charAt(str1.length()-1)==str2.charAt(0) ){
    //if the last character of the first string is equal for the first character of the second string
        result = str1 + str2.substring(1);
    }else{
        result=str1+str2;
    }
    return result; */


   public static int sumOf2IntegerNumbers(int n1,int n2){//task 2
       return n1+n2;
   }
    public static int sumOf3IntegerNumbers(int n1,int n2,int n3){
      //  return n1+n2+n3;
        return sumOf2IntegerNumbers(n1, n2)+n3;
    }
    public static int sumOf4IntegerNumbers(int n1,int n2, int n3,int n4){
      //  return n1+n2+n3+n4;
        return sumOf3IntegerNumbers(n1,n2,n3)+n4;

    }
}

/*
Warmup Tasks:
	Task1:
	    Create a method named combine that can take two string and then add them together and returns it.
        	But if the last letter of the first word and the first letter of the last letter are the same,
        	return that character once.

	        combine("one", "eight")  ==> oneight

	Task 2:
	    1. create a method that can find the sum of two integer numbers
	                method name: sumOf2Numbers

	    2. create a method that can find the sum of three integer numbers
	                method name: sumOf3Numbers

	    3. create a method that can find the sum of four integer numbers
	                method name: sumOf4Numbers
 */