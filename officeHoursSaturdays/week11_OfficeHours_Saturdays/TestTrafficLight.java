package week11_OfficeHours_Saturdays;

public class TestTrafficLight {
    public static void main(String[] args) {

        TrafficLight light1 = new TrafficLight("");
        System.out.println(light1);

        TrafficLight light2 = new TrafficLight("green");
        System.out.println(light2);
        System.out.println(light2.getColor());
        light2.setColor("red");
        System.out.println(light2.getColor());
        light2.setColor("hello world");
        System.out.println(light2.getColor());

    }
}
