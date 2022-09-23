
@Component
public class BestMovieService {
//  @Autowired
//  private Movie movie;

//@Autowired
//  public void setMovie(Movie movie) {
//    this.movie = movie;
//  }

  @Autowired
  public String BestMovieService(Movie movie){
    this.Movie = movie;
  }

  @Autowired
  public BestMovieService(@Qualifier(titanicMovie) Movie movie) {
    this.movie = movie;
  }


}