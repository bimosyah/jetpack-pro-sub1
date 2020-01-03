package syahputro.bimo.submission1.data;

public class MovieEntity {
    private String movieTitle;
    private int movieImage;
    private String genre;
    private String movieRating;
    private String movieSynopsis;

    public MovieEntity(String movieTitle, int movieImage, String genre, String movieRating, String movieSynopsis) {
        this.movieTitle = movieTitle;
        this.movieImage = movieImage;
        this.genre = genre;
        this.movieRating = movieRating;
        this.movieSynopsis = movieSynopsis;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public int getMovieImage() {
        return movieImage;
    }

    public void setMovieImage(int movieImage) {
        this.movieImage = movieImage;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(String movieRating) {
        this.movieRating = movieRating;
    }

    public String getMovieSynopsis() {
        return movieSynopsis;
    }

    public void setMovieSynopsis(String movieSynopsis) {
        this.movieSynopsis = movieSynopsis;
    }
}
