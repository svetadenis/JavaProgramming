package day08_ternary_switch;

public class TernaryNameOfTheMonth {
    public static void main(String[] args) {

        int month = 10;
        String result = (month==1)?"Jan":(month==2)?"Feb":(month==3)?"March"
                :(month==4)?"April":(month==5)?"May":(month==6)?"June"
                :(month==7)?"July":(month==8)?"August":(month==9)?"September"
                :(month==10)?"October":(month==11)?"November":"December";
        System.out.println(result);


        /*
        int number = 10;
        String result = "";

        if (number == 1){result = "January"; }
        if (number ==2) {result = "February";}
        if (number ==3) {result = "March";}
        if (number ==4) {result = "April";}
        if (number ==5) {result = "May";}
        if (number ==6) {result = "June";}
        if (number ==7) {result = "July";}
        if (number ==8) {result = "August";}
        if (number ==9) {result = "September";}
        if (number ==10) {result = "October";}
        if (number ==11) {result = "November";}
        if (number ==12) {result = "December";}

        System.out.println(result);
         */
    }
}
