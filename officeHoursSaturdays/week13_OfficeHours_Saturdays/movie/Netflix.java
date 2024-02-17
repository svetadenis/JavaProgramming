package week13_OfficeHours_Saturdays.movie;

public final class Netflix extends StreamingSite {
    public Netflix(String url, double subscriptionAmount, int moviesAvailable) {
        super(url, subscriptionAmount, moviesAvailable);
    }

    @Override
    public void subscribe() {
        System.out.println("Subscribe to Netflix for " +  getSubscriptionAmount());
    }

    @Override
    public void playMovie(Movie movie) {
        System.out.println(movie.getTitle() + " is playing on " + getUrl());
    }

    @Override
    public void pause() {
        System.out.println("Paused on Netflix");
    }
}
/*
    - Create a final class Netflix
        inherit the StreamingSite class and implement all the methods
 */