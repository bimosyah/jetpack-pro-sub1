package syahputro.bimo.submission1.ui.detail_movie;

import android.app.Activity;

import androidx.lifecycle.ViewModel;

import syahputro.bimo.submission1.data.MovieEntity;
import syahputro.bimo.submission1.utils.DataDummy;

public class DetailMovieViewModel extends ViewModel {
    DataDummy dataDummy = new DataDummy();
    private MovieEntity mMovie;
    private int id;

    public MovieEntity getMovie(){
        MovieEntity movieEntity = dataDummy.generateDummyMovie().get(id);
        mMovie = movieEntity;
        return mMovie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
