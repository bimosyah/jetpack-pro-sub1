package syahputro.bimo.submission1.ui.tvshow;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import syahputro.bimo.submission1.data.MovieEntity;
import syahputro.bimo.submission1.data.TvshowEntity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TvshowViewModelTest {
    private TvshowViewModel viewModel;

    @Before
    public void setUp() throws Exception {
        viewModel = new TvshowViewModel();
    }

    @Test
    public void getMovies() {
        List<TvshowEntity> tvshowEntities = viewModel.getTvshow();
        assertNotNull(tvshowEntities);
        assertEquals(10, tvshowEntities.size());
    }
}