package week10_OfficeHours_Saturdays.Show;

import week10_OfficeHours_Saturdays.Show.Show;

import java.util.ArrayList;

public class ShowTracker {
    public String username;
    public String password;
    public ArrayList<Show> trackedShows;

    public ShowTracker(String username, String password) {
        this.username = username;
        this.password = password;
        trackedShows = new ArrayList<>();
    }

    public ShowTracker(String username, String password, ArrayList<Show> trackedShows) {
        this(username, password);
        this.trackedShows.addAll(trackedShows);
    }

    public boolean trackShow(Show newShow){
        for(Show eachShow : trackedShows){
            if(eachShow.name.equals(newShow.name)){
                return false;
            }
        }

        return trackedShows.add(newShow);
    }

    public ArrayList<Show> filter(String language){
        ArrayList<Show> filtered = new ArrayList<>(trackedShows);
        filtered.removeIf(p -> !p.audioLanguages.contains(language));
        return filtered;
    }

}
/*

    Create a class ShowTracker

        define these instance variables:
            username
            password
            tracked shows (ArrayList of Show objects)

    create a constructor that will initialize all the variables

    create method trackShow(Show)
        this method will accept a Show object. Check if the show is already tracked and if it is not add it to the list of shows

    create a method filter(String)
        return all the shows that are available in the defined language
            ex: filter("english") -> returns all the shows that can be viewed in English

    overload the method to accept a boolean argument filter(boolean)
        if the boolean is true return the list of shows that are complete
        if the boolean is false return the list of shows that are ongoing
            ex: filter(true) -> return all the shows that are complete

    overload the method to accept a LocalDate argument filter(LocalDate)
        return all the shows after the defined date

    create a toString to display the show tracker information
 */