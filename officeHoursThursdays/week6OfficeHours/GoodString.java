package week6OfficeHours;

public class GoodString {

    public static void main(String[] args) {

        String str = "nogoodmovie";
        str = str.toLowerCase();
        int index = str.indexOf("good");
        System.out.println(index == 1 || index == 2);//true

        boolean isValid = str.substring(1).startsWith("good") || str.substring(2).startsWith("good");
        System.out.println(isValid);//true

    }
}
/*

T1GoodString [String, indexes]

	Create a program that will check a given String. If the word "good" starts at index 1 or 2 print true otherwise print false

	ex:
		goodday --> false
		agoodmovie --> true
		nogoodtoday -> true
		notgoodfornow -> false
 */
