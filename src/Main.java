import com.jmds.screenmatch.model.Movie;

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


        myMovie.showData();
        System.out.println(myMovie.getAverageRate());
        System.out.println("Quantity of ratings: " + myMovie.getDurationMinutes());;
    }
}