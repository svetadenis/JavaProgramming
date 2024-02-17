package week08_November27;

public class AlarmClock {
    public static void main(String[] args) {

        System.out.println(alarmClock(7, true));

    }

    public static String alarmClock(int day, boolean vacation) {

//Solution1
// boolean isWeekend= day==0||day==6;

// if(vacation && isWeekend){
//             return "off";
//         } else if(vacation && !isWeekend || !vacation && isWeekend){
//             return "10:00";
//         } else {
//             return "7:00";
//         }




// Solution2
// boolean isWeekend= day==0||day==6;

//   if (isWeekend){
//     return(vacation)? "off" : "10:00";
//   }return (vacation)? "10:00" : "7:00";


        // Solution3 (lets play devil's advocate)
        // boolean isWeekend= day==0||day==6;

        // if (!isWeekend){
        //   return(!vacation)? "7:00" : "10:00";
        // }return (!vacation)? "10:00" : "off";



// Solution4(Lets find the codingbat's bug-->Negative & Positive Testing)
        if (day <= 6 && day >= 0) {

            boolean isWeekend = day == 0 || day == 6;

            if (isWeekend) {
                return (vacation) ? "off" : "10:00";
            }
            return (vacation) ? "10:00" : "7:00";


        }

        return "Invalid Day";



    }


}

