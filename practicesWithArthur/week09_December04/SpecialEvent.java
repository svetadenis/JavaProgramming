package week09_December04;

public class SpecialEvent {
    public static void main(String[] args) {
        System.out.println(specialEleven(10));
    }

    public static boolean specialEleven(int n) {


//Solution1

        if(n%11 == 0 || n%11==1)
            return true;
        else
            return false;


// Mod % Operator
// You're familiar with the 4 arithmetic operations
// addition+ subtraction- multiplication* division/.
// The % modulus operator is an additional arithmetic operation:
// Basically the remainder left over after division.
// So How can we find the remainder?
// For example, what is remainder if  73 divide by 10?
// The simplest way to think about it is,
// keep subtracting 10's from 73 until there's less than 10 left
// 3 is remainder in this case
// Modulus operator exactly the same logic and we call it as "mod" for short
// e.g. 24 % 10 = 4
// Repeatedly subtract 10 from 24 .. what's left?
// Like the "remainder" after dividing by 10
// Basically all programming languages use the % symbol for mod
// Mod yields 0 means the number is evenly divisible.
// e.g. 30 % 10 → 0
// "N multiple of 5" → (N % 5) == 0


//Solution2
//return n%11==0 || n%11==1 ;

//Solution3(merge two conditions in one)
//return n % 11 <= 1;


//Solution4
//Since 1 is not '1 greater than a multiple of 11'.
//0 isn't a multiple of 11. CodingBat accepts 1 as a valid answer but that's not the case.
//The issue is whether zero is a multiple of every number or not. If yes no problem but if no:
//Codingbat says that specialEleven(1) → expected true, actual	true so
//we can say there is a bug in this codingbat practice
// 0 isn't a multiple of 11.
// Since 1 is not '1 greater than a multiple of 11'.
//CodingBat accepts 1 as a valid answer but that's not the case.
//So solution should be:

        //return n>10 && n % 11 <= 1;



    }
    }

