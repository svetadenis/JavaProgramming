package day06_ifStatements;

public class CharacterIdentity2 {
    public static void main(String[] args) {
        //use boolean
        char ch = '@';
        String result = "";//temp variable
        boolean digit = ch >= '0' && ch <= '9';
        boolean alphabetic = ch >= 'A' && ch <= 'Z' & ch >= 'a' && ch <= 'z';
        boolean special = !digit && !alphabetic;

        if (digit) {
            result = "Digit";
        }
        if (alphabetic) {
            result = "Alphabetic";
        }
        if (special) {
            result = "Special";
        }
        System.out.println(result);

    }}
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
