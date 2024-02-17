package week07_November20;

public class CigarParty {
    public static void main(String[] args) {
        System.out.println(cigarParty(30, true));
    }

    public static boolean cigarParty(int cigars, boolean isWeekend) {

        //Solution1
//   if(isWeekend) {

//     if( cigars>=40){
//       return true;
//     }else { return false;}

//   } else {
//     if (cigars>=40 && cigars<=60){
//       return true;
//     }else{ return false;
//   }
// }

//Solution2
// if(isWeekend && cigars>=40) {
//   return true;
// }else if(cigars>=40 && cigars<=60){
//   return true;
// }else return false;

//Solution3
// if (isWeekend) {
//   return cigars>=40;
// } else return cigars>=40 && cigars<=60;

//Solution4
// return isWeekend && cigars>=40 || !isWeekend && cigars>=40 && cigars <=60;

//Solution5

// return isWeekend && cigars >=40 || cigars>=40 && cigars <=60;

// Solution6

        boolean weekdayValidRange= cigars>=40 && cigars <=60;
        boolean weekendValidRange= isWeekend && cigars >=40;

        return weekdayValidRange || weekendValidRange;


    }

// shouldn't do this: isWeekend == true  -->  instead do it this way: isWeekend
// shouldn't do this: isWeekend == false  -->  instead do it this way: !isWeekend


    // To test/run any of the methods in IntelliJ you need to:
    //   -First create a main method
    //   -Then copy your codes from Codingbat to IntelliJ
    //   -Then make the custom method static
    //   -And then call your custom method inside main method and give appropriate arguments
}

