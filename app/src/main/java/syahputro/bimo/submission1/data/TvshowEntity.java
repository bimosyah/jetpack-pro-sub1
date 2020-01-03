package syahputro.bimo.submission1.data;

public class TvshowEntity {
    private String TvTitle;
    private int TvImage;
    private String TvImageBackdrop;
    private String TvRating;
    private String TvSynopsis;

    public TvshowEntity(String tvTitle, int tvImage, String tvImageBackdrop, String tvRating, String tvSynopsis) {
        TvTitle = tvTitle;
        TvImage = tvImage;
        TvImageBackdrop = tvImageBackdrop;
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

    public String getTvImageBackdrop() {
        return TvImageBackdrop;
    }

    public void setTvImageBackdrop(String tvImageBackdrop) {
        TvImageBackdrop = tvImageBackdrop;
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
