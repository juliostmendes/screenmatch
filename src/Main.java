import com.jmds.screenmatch.calculator.RecomendationFilter;
import com.jmds.screenmatch.calculator.TimeCalculator;
import com.jmds.screenmatch.model.Movie;
import com.jmds.screenmatch.model.TVShow;

public class Main {
    public static void main(String[] args) {
        
        Movie myMovie = new Movie();
        myMovie.setName("Star Wars");
        myMovie.setInPlan(true);
        myMovie.setDurationMinutes(145);
        myMovie.setReleaseYear(1977);
        myMovie.rate(8);
        myMovie.rate(9.4);
        myMovie.rate(9.2);

        TVShow tvShow = new TVShow();
        tvShow.setName("Lost");
        tvShow.setReleaseYear(2000);
        tvShow.setSeasons(3);
        tvShow.setEpsPerSeason(12);
        tvShow.setMinutesPerEp(20);
        System.out.println("Lost has " + tvShow.getDurationMinutes() + " minutes");
        myMovie.showData();
        System.out.println(myMovie.getAverageRate());
        System.out.println("Quantity of ratings: " + myMovie.getDurationMinutes());;


        Movie myMovie2 = new Movie();
        myMovie2.setName("The Hobbit");
        myMovie2.setInPlan(true);
        myMovie2.setDurationMinutes(150);
        myMovie2.setReleaseYear(2012);
        myMovie2.rate(10);
        myMovie2.rate(9.4);
        myMovie2.rate(9.2);


        Movie myMovie3 = new Movie();
        myMovie3.setName("Zohan");
        myMovie3.setInPlan(true);
        myMovie3.setDurationMinutes(145);
        myMovie3.setReleaseYear(2009);
        myMovie3.rate(6);
        myMovie3.rate(8);

        TimeCalculator calculator = new TimeCalculator();
        calculator.insert(myMovie);
        calculator.insert(myMovie2);

        System.out.println("Total time:"+calculator.getTotalTimeMinutes());

        RecomendationFilter filter = new RecomendationFilter();
        filter.filter(myMovie);
        filter.filter(myMovie2);
        filter.filter(myMovie3);
    }
}