import java.util.ArrayList;
import java.util.List;

public class Problem17 {

    private  String title;
    private  String director;
    private List<String> actor;
    private  List<String> reviews;

    public Problem17(String title,String director,List<String> actor){
        this.title=title;
        this.director=director;
        this.actor=actor;
        this.reviews=new ArrayList<>();
    }

    public  String getTitle(){
        return  title;
    }
    public String getDirector(){
        return  director;
    }

    public List<String> getActor(){
        return  actor;
    }

    public List<String>getReviews(){
        return reviews;
    }

    public  void addevies(String problem17){
        reviews.add(problem17);
    }

    public void displayMovieInfo() {
        System.out.println("Movie Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Actors: " + String.join(", ", actor));
        System.out.println("Reviews:");
        for (String review : reviews) {
            System.out.println("- " + review);
        }
    }
}

 class MovieApp {
    public static void main(String[] args) {
        List<String> actors = new ArrayList<>();
        actors.add("Actor1");
        actors.add("Actor2");
        actors.add("Actor3");

       Problem17 movie = new Problem17("Sample Movie", "Sample Director", actors);

        movie.addevies("Great movie, highly recommended!");
        movie.addevies("Enjoyed it a lot, good storyline.");
        movie.addevies("Not my cup of tea.");

        // Display movie information
        movie.displayMovieInfo();
    }
}
