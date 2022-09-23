
public static void main(string[] args){
  @ComponentScan
  public class MovieApp {
    AnnotationConfigApplicationContext applicationContext =
      new AnnotationConfigApplicationContext(MovieApp.class);

      BestMovieService bestMovieService = applicationContext.getBean("bestMovieService", BestMovieService.class);

      Movie bestMovie = bestMovieService.getBestMovie();

      System.out.println("Title: " + bestMovie.getTitle());
      System.out.println("Maturity Rating: " + bestMovie.getRating());
      System.out.println("Genre: " + bestMovie.getGenre());

  }

}