package syahputro.bimo.submission1.ui.movie;

import android.app.Activity;

import androidx.lifecycle.ViewModel;

import java.util.List;

import syahputro.bimo.submission1.data.MovieEntity;
import syahputro.bimo.submission1.utils.DataDummy;

public class MovieViewModel extends ViewModel {
    DataDummy dataDummy = new DataDummy();

    public List<MovieEntity> getMovies(Activity activity) {
        return dataDummy.generateDummyMovie(activity);
    }
}
