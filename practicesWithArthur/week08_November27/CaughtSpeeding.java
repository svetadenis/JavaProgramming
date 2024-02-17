package week08_November27;

public class CaughtSpeeding {
    public static void main(String[] args) {
        System.out.println(caughtSpeeding(84, true));
    }

    public static int caughtSpeeding(int speed, boolean isBirthday) {


//Solution1
//   int min = 60;
//   int max = 81;

//   if(isBirthday){
//     min += 5;
//     max += 5;
//   }

//   if(speed>min && speed<max){
//   return 1;
// }else if(speed>=max) {
//   return 2;
// } return 0;

//Solution2
// int min = isBirthday? 65:60;
// int max = isBirthday? 86:81;
// if(speed>min && speed<max){
//   return 1;
// }else if(speed>=max) {
//   return 2;
// } return 0;

//solution3
// if (isBirthday) speed -= 5;

//   if(speed>60 && speed<81){
//   return 1;
// }else if(speed>=81) {
//   return 2;
// } return 0;

//solution4
// if(isBirthday) speed -= 5;
// if(speed<61) return 0;
// if(speed>80) return 2;
// return 1;

//solution5('isBirthday' is nested within the outer parenthesis,
//therefore, that is evaluated first. If 'isBirthday' is true,
//it returns 5 and 5 gets subtracted with speed, otherwise it's 0.)
        return (speed - ((isBirthday) ? 5 : 0) > 60) ? (speed - ((isBirthday) ? 5 : 0) > 80) ? 2 : 1 : 0;




    }

}

