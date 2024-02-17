package week12_OfficeHours;

public class TestWorkout {
    public static void main(String[] args) {
        Workout running = new Workout("Running", 60, 200);

        running.setName("jumping");
        System.out.println(running.getName());
//        String str = null;
//        str.charAt(0);

        //System.out.println(5/0);
        System.out.println(true || 5/0 == 0);
        //System.out.println(true | 5/0 == 0);

    }
}
