package syahputro.bimo.submission1.data;

public class TvshowEntity {
    private String TvTitle;
    private int TvImage;
    private String genre;
    private String TvRating;
    private String TvSynopsis;

    public TvshowEntity(String tvTitle, int tvImage, String genre, String tvRating, String tvSynopsis) {
        TvTitle = tvTitle;
        TvImage = tvImage;
        genre = genre;
        TvRating = tvRating;
        TvSynopsis = tvSynopsis;
    }

    public String getTvTitle() {
        return TvTitle;
    }

    public void setTvTitle(String tvTitle) {
        TvTitle = tvTitle;
    }

    public int getTvImage() {
        return TvImage;
    }

    public void setTvImage(int tvImage) {
        TvImage = tvImage;
    }

    public String getgenre() {
        return genre;
    }

    public void setgenre(String genre) {
        genre = genre;
    }

    public String getTvRating() {
        return TvRating;
    }

    public void setTvRating(String tvRating) {
        TvRating = tvRating;
    }

    public String getTvSynopsis() {
        return TvSynopsis;
    }

    public void setTvSynopsis(String tvSynopsis) {
        TvSynopsis = tvSynopsis;
    }
}
