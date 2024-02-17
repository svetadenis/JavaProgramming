package week10_OfficeHours_Saturdays.Show;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestShowTracker {
    public static void main(String[] args) {

        Show lastOfUs = new Show(
                "The Last Of Us",
                1,
                LocalDate.of(2023, 1, 15),
                false,
                new ArrayList<>(Arrays.asList("English", "Spanish"))
        );
        Show got = new Show(
                "Game of Thrones",
                8,
                LocalDate.of(2011, 4, 17),
                true,
                new ArrayList<>(Arrays.asList("English", "Spanish", "German"))
        );

        ShowTracker myAccount = new ShowTracker("jBond7", "secretagent7");
        System.out.println(myAccount.trackedShows); // this gives me an empty ArrayList
        System.out.println(myAccount.trackedShows.size());

        ShowTracker secondAccount = new ShowTracker("javalover", "java", new ArrayList<>(Arrays.asList(lastOfUs, got)));
        System.out.println(secondAccount.trackedShows);
        System.out.println(secondAccount.trackedShows.size());

        secondAccount.trackShow(got);

        System.out.println("===============");
        Show sh4 = new Show("squid game",1, LocalDate.of(2021,9,17),false, new ArrayList<>(Arrays.asList("Korean","English", "French", "Spanish", "German")));
        secondAccount.trackShow(sh4);
        System.out.println(secondAccount.trackedShows);

        System.out.println("===============");
        System.out.println(secondAccount.filter("Korean"));

    }
}