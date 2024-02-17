package week12_OfficeHours_Saturdays.olympic;

public class TestSpots {
    public static void main(String[] args) {

        Surfing surfing = new Surfing(20);
        System.out.println(surfing);
        surfing.compete();

        Soccer soccer = new Soccer();
        soccer.compete();
        System.out.println(soccer);

        Soccer.yearOfFirstOlympics = 10;
        soccer.yearOfFirstOlympics = 5;
        System.out.println(OlympicSport.yearOfFirstOlympics);
        System.out.println(Soccer.yearOfFirstOlympics);
        System.out.println(Surfing.yearOfFirstOlympics);

        System.out.println("---------------");
        OlympicSport.getNextYear();
        Surfing.getNextYear();
        Soccer.getNextYear();

    }
}

