package week13_January2String2;

public class xyBalance {
    public static void main(String[] args) {
        System.out.println(xyBalance("aaxbby"));

    }
    public static boolean xyBalance(String str) {
        // //solution1(step by step to clarify details)
//   boolean match = false;

// // //step1
// if(str.contains("x") && str.contains("y")){
// if(str.lastIndexOf('y') > str.lastIndexOf('x')){
// match = true;
// }
// }

// // //step2
// if(!str.contains("x") && !str.contains("y")){
// match = true;
// }

// // //step3
// if(str.length() == 1 && str.contains("y")){
// match = true;
// }

// return match;

        //solution2
        // return(str.lastIndexOf('y')>str.lastIndexOf('x'))||(!str.contains("x") && !str.contains("y"));

        //solution3
        //return str.lastIndexOf('y') > str.lastIndexOf('x') || !str.contains("x");

        //solution4(instead of finding the true we are asking to find the false and !(false) is true)
        //return str.lastIndexOf('y') > str.lastIndexOf('x');      //normally return false
        //return !(str.lastIndexOf('y') < str.lastIndexOf('x'));    //normally return true

        //solution5(The lastIndexOf() method in java returns the last occurrence of a specific
        //character or a specific substring in the string; if the occurrence is not found
        //in the original string, it returns -1.)
        //return (str.lastIndexOf('y') >str.lastIndexOf('x')) ||
        //       (str.lastIndexOf('y')==str.lastIndexOf('x')) ;

        //solution6(merge two side of || logic operator)
        return (str.lastIndexOf('y') >= str.lastIndexOf('x'));
    }

}

