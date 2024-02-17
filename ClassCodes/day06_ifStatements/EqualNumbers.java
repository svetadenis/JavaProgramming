package day06_ifStatements;

public class EqualNumbers {
    public static void main(String[] args) {
        int n1=1;
        int n2=2;
        int n3=3;
        String result = "";
    if (n1==n2 && n2==n3){
        System.out.println(result= "all equal");
    } if (n1==n2 && n2!=n3){
        System.out.println(result = "n1&n2 are equal");
    } if (n1!=n2 && n2==n3){
        System.out.println(result = "n2&n3 are equal");
    } if (n3==n1 && n2!=n1){
        System.out.println(result = "n3&n1 are equal");
    } if (n3!=n2 && n2!=n1){
        System.out.println(result = "none of them are equal");
        }

    }
}
/*
Create a class named EqualNumbers, and write a program that can check the equality of the three given numberrs
	 			declare 3 numbers n1, n2, n3
	 			if all are equal ==> print "all equal"
	  			if only n1 and n2 are equal  =>print  "n1&n2 are equal"
	   			if only n2 and n3 are equal ==>print "n2&n3 are equal"
	   			if only n3 and n1 are qual ==>print "n3&n1 are equal"
				if none of them are euqal ==> none of them are equal
 */