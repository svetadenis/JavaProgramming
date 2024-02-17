package week10_OfficeHours_Saturdays.Show;

import week10_OfficeHours_Saturdays.Show.Show;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestShow {
    public static void main(String[] args) {
        //the last of us - 1 - January 15, 2023 - false - english, spanish

        Show lastOfUs = new Show(
                "The Last Of Us",
                1,
                LocalDate.of(2023, 1, 15),
                false,
                new ArrayList<>(Arrays.asList("English", "Spanish"))
        );

        System.out.println(lastOfUs.releaseDate); // this is a LocalDate;
        System.out.println(lastOfUs.audioLanguages); // this is an ArrayList

        // game of thrones - 8 - April 17, 2011 - true - english, spanish, german

        Show got = new Show(
                "Game of Thrones",
                8,
                LocalDate.of(2011, 4, 17),
                true,
                new ArrayList<>(Arrays.asList("English", "Spanish", "German"))
        );
        System.out.println();
        System.out.println(lastOfUs);
        System.out.println();
        System.out.println(got);

    }
}