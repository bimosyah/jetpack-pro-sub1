package syahputro.bimo.submission1.ui.movie;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Context;

import androidx.fragment.app.FragmentActivity;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import syahputro.bimo.submission1.HomeActivity;
import syahputro.bimo.submission1.data.MovieEntity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MovieViewModelTest  {
    private MovieViewModel viewModel;

    @Before
    public void setUp() {
        viewModel = new MovieViewModel();
    }

    @Test
    public void getMovies() {
        List<MovieEntity> movieEntities = viewModel.getMovies();
        assertNotNull(movieEntities);
        assertEquals(10, movieEntities.size());
    }

}