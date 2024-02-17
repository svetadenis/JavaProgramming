package Week3_OfficeHours_Saturdays;

public class Diving {
    public static void main(String[] args) {

        int oxygenLevel = 80;
        String result = "";
        if (oxygenLevel >=90){
            result = "Your tank is full";

        }else if (oxygenLevel>=89){
            result = "A lot left to use";
        }else if (oxygenLevel >=70){

        result = "Don't go too far";
        }else if (oxygenLevel >=60){

            result = "Start to head back";
        }else if (oxygenLevel >=50){
            result = "Be careful now you at 50";
        } else
        {result = "Crirical";

    }
        System.out.println(result);
}}
/*
Declare and assign a oxygen tank level.
This level will be a whole number percentage, so 80 would represent 80% oxygen

	Check how much oxygen is left in the tank and output a corresponding message

		use these ranges:
			100 - 90: Your tank is full
			89 - 80: A lot left to use
			79 - 70: Don't go too far
			69 - 60: Start to head back
			59 - 50: Be careful now you at at 50%
			Less than 50: Critical

 */