package syahputro.bimo.submission1.ui.detail_movie;

import org.junit.Before;
import org.junit.Test;

import syahputro.bimo.submission1.R;
import syahputro.bimo.submission1.data.MovieEntity;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class DetailMovieViewModelTest {
    private DetailMovieViewModel viewModel;
    private MovieEntity movieEntity;

    @Before
    public void setUp() {
        viewModel = new DetailMovieViewModel();
        movieEntity = new MovieEntity(
                "Avengers: Infinity War (2018)",
                R.drawable.movie_poster_infinity_war,
                "Petualangan | Aksi | Fantasi",
                "83",
                "Ketika Avengers dan sekutu mereka terus melindungi dunia dari ancaman yang terlalu besar untuk ditangani oleh satu pahlawan, bahaya baru telah muncul dari bayang-bayang kosmik: Thanos. Seorang lalim penghinaan intergalaksi, tujuannya adalah untuk mengumpulkan semua enam Batu Infinity, artefak kekuatan tak terbayangkan, dan menggunakannya untuk menimbulkan keinginannya yang terpelintir pada semua kenyataan. Segala yang Avengers telah perjuangkan telah mengarah ke saat ini - nasib Bumi dan keberadaannya sendiri tidak pernah lebih pasti"
        );
    }

    @Test
    public void getMovie() {
        viewModel.setId(0);
        MovieEntity movie = viewModel.getMovie();
        assertNotNull(movie);
        assertEquals(movieEntity.getMovieTitle(),movie.getMovieTitle());
        assertEquals(movieEntity.getMovieImage(),movie.getMovieImage());
        assertEquals(movieEntity.getGenre(),movie.getGenre());
        assertEquals(movieEntity.getMovieRating(),movie.getMovieRating());
        assertEquals(movieEntity.getMovieSynopsis(),movie.getMovieSynopsis());
    }
}