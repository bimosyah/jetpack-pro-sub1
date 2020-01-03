package syahputro.bimo.submission1.ui.detail_tvshow;

import org.junit.Before;
import org.junit.Test;

import syahputro.bimo.submission1.R;
import syahputro.bimo.submission1.data.TvshowEntity;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNotNull;

public class DetailTvshowViewModelTest {
    private DetailTvshowViewModel viewModel;
    private TvshowEntity tvshowEntity;

    @Before
    public void setUp() {
        viewModel = new DetailTvshowViewModel();
        tvshowEntity = new TvshowEntity("Arrow",
                R.drawable.tv_poster_arrow,
                "Petualangan | Aksi | Fantasi",
                "58",
                "Playboy miliarder manja, Oliver Queen, hilang dan diduga tewas ketika kapal pesiarnya hilang di laut. Dia kembali lima tahun kemudian seorang pria yang berubah, bertekad untuk membersihkan kota sebagai main hakim sendiri bersenjatakan busur");
    }

    @Test
    public void geTvshow() {
        viewModel.setId(0);
        TvshowEntity tvshow = viewModel.geTvshow();
        assertNotNull(tvshow);
        assertEquals(tvshowEntity.getTvTitle(),tvshow.getTvTitle());
        assertEquals(tvshowEntity.getTvImage(),tvshow.getTvImage());
        assertEquals(tvshowEntity.getgenre(),tvshow.getgenre());
        assertEquals(tvshowEntity.getTvRating(),tvshow.getTvRating());
        assertEquals(tvshowEntity.getTvSynopsis(),tvshow.getTvSynopsis());

    }
}