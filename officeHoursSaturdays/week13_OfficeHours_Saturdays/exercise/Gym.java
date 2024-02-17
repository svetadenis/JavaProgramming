package week13_OfficeHours_Saturdays.exercise;

public class Gym {
    public static void main(String[] args) {

        // we cannot create objects from an abstract class
        //Exercise exercise = new Exercise();
        //Lifting lifting = new Lifting();

        Running running = new Running();
        running.perform();
        System.out.println(running.getCaloriesBurned(60));

        Bench bench = new Bench();
        bench.perform();
        bench.rackWeight();
        System.out.println(bench.getCaloriesBurned(20));

    }
}

