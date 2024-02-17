package week13_OfficeHours_Saturdays.movie;

    public class Amazon extends StreamingSite{
        public Amazon(String url, double subscriptionAmount, int moviesAvailable) {
            super(url, subscriptionAmount, moviesAvailable);
        }

        @Override
        public void subscribe() {
            System.out.println("Amazon Video comes with a prime subscription");
        }

        @Override
        public void playMovie(Movie movie) {
            System.out.println("Playing " + movie.getTitle() + " on amazon video");
        }

        @Override
        public void pause() {
            System.out.println("Paused. displaying suggested amazon purchases on screen");
        }
    }

