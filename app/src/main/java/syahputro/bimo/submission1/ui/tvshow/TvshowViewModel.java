package syahputro.bimo.submission1.ui.tvshow;

import android.app.Activity;

import androidx.lifecycle.ViewModel;

import java.util.List;

import syahputro.bimo.submission1.data.TvshowEntity;
import syahputro.bimo.submission1.utils.DataDummy;

public class TvshowViewModel extends ViewModel {
    DataDummy dataDummy = new DataDummy();

    public List<TvshowEntity> getTvshow(Activity activity) {
        return dataDummy.generateDummyTvshow(activity);
    }
}
