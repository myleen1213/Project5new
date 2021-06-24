public class TvShows extends ServiceCommunicator {

        public static void main (String[]args) {
            System.out.println(new TvShows("SpongeBob").get());
            System.out.println(new TvShows("Stranger Things").get());
            System.out.println(new TvShows("Shark tank").get());
            System.out.println(new TvShows("Ozark").get());
        }
            TvShows(String tvShowName){
            super("http://api.tvmaze.com/singlesearch/shows?q=" + tvShowName);
        }

    }