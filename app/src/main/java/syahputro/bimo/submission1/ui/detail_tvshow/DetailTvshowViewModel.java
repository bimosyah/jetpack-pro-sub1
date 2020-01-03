package syahputro.bimo.submission1.ui.detail_tvshow;

import android.app.Activity;

import androidx.lifecycle.ViewModel;

import syahputro.bimo.submission1.data.MovieEntity;
import syahputro.bimo.submission1.data.TvshowEntity;
import syahputro.bimo.submission1.utils.DataDummy;

public class DetailTvshowViewModel extends ViewModel {
    DataDummy dataDummy = new DataDummy();
    private TvshowEntity mTvshow;
    private int id;

    public TvshowEntity geTvshow(Activity activity){
        TvshowEntity tvshowEntity = dataDummy.generateDummyTvshow(activity).get(id);
        mTvshow = tvshowEntity;
        return mTvshow;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
