package syahputro.bimo.submission1.ui.movie;

import android.app.Activity;

import androidx.lifecycle.ViewModel;

import java.util.List;

import syahputro.bimo.submission1.data.MovieEntity;
import syahputro.bimo.submission1.utils.DataDummy;

public class MovieViewModel extends ViewModel {

    public List<MovieEntity> getMovies() {
        return DataDummy.generateDummyMovie();
    }
}
