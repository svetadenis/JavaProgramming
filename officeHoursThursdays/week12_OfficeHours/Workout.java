package week12_OfficeHours;

public class Workout {
    private String name;
    private int duration;
    private double caloriesBurned;

    public Workout(String name, int duration, double caloriesBurned) {
        this.name = name;
        setDuration(duration);
        setCaloriesBurned(caloriesBurned);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(isValidName(name)){
            this.name = name;
        }
    }

    private boolean isValidName(String name){
        if(name == null || name.isEmpty()){
            return false;
        }

        for(char each : name.replace(" ", "").toCharArray()){
            if(!Character.isLetter(each)){
                return false;
            }
        }

        return true;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if(duration > 0){
            this.duration = duration;
        }
    }

    public double getCaloriesBurned() {
        return caloriesBurned;
    }

    public void setCaloriesBurned(double caloriesBurned) {
        if(caloriesBurned > 0 && caloriesBurned < 1000){
            this.caloriesBurned = caloriesBurned;
        }
    }
}
/*

Workout [Encapsulation, access modifiers, classes, objects, methods]

    Create a class Workout
    define and encapsulate these instance variables:
        name, duration, calories burned

    create a constructor to initialize the variables. Call the setters in the constructor

    in the setters only set the values if they are valid data based on these requirements:
        name: should have only letters and spaces, no other characters type. The name cannot be empty either

        duration: should be more than 0

        calories burned: should be more than 0 and less than 1000

    create another class to test the Workout objects
 */

