package day06_ifStatements;

public class CharacterIdentity {
    public static void main(String[] args) {

        char ch = '@';
        String result="";
    if (ch >= '0'&& ch<=9) { // '0' <= ch <= '9'
        result = "digit";}
        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            result = "Alphabetic Character";
        } else {
            result = "Special Character";
        }
        System.out.println(result);
    }
}
//digit is only one number from 0 to 9; 10 is alredy not digit
/*
Create a class named CharacterIdentity, and write a program that can identify
if the given character is a digit or Alphabetic Character(A~Z or a~Z) or a special character
		Ex:
			ch = '@'
			output:
				Special Character
			ch = '1'
			output:
				digit

		HINT: You may wanna check out the numbers of the chracters on ASCII table

 */