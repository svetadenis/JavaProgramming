package Week3_OfficeHours_Saturdays;

public class TemperatureCheck {
    public static void main(String[] args) {

    int temperature = 90;
    if (temperature>=-20 && temperature <=120){// valid temps

        if (temperature <=100 && temperature >=70){
            System.out.println("Go outside");
        } else if (temperature <=50 && temperature >=30){
            System.out.println("Stay inside");
        } else {
            System.out.println("Up to you");
        }

    }else{
        System.out.println(temperature + "is not valid");
    }

    //if (temperature <= -20 || temperature > 120)//invalid temps
    }
}
/*
check for valid temps: -20-120
100-70: go outside
30-50: stay inside
all other: up to you
 */