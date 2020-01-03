package syahputro.bimo.submission1.ui.detail_movie;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import com.bumptech.glide.Glide;

import syahputro.bimo.submission1.R;
import syahputro.bimo.submission1.data.MovieEntity;

public class DetailMovieActivity extends AppCompatActivity {
    ImageView imageViewBanner;
    ImageView imageViewDetail;
    TextView textViewTitle, textViewGenre, textViewScore, textViewSynopsis;

    public static final String ID_MOVIE = "id_movie";
    DetailMovieViewModel viewModel;
    MovieEntity movie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie);

        imageViewDetail = findViewById(R.id.image_view_detail);
        imageViewBanner = findViewById(R.id.image_view_banner);
        textViewTitle = findViewById(R.id.text_view_movie_title_detail);
        textViewGenre = findViewById(R.id.text_view_movie_genre_detail);
        textViewScore = findViewById(R.id.text_view_movie_score_detail);
        textViewSynopsis = findViewById(R.id.text_view_movie_synopsis_detail);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        viewModel = ViewModelProviders.of(this).get(DetailMovieViewModel.class);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int id = extras.getInt(ID_MOVIE);
            viewModel.setId(id);
            movie = viewModel.getMovie();
        }

        if (viewModel != null) {
            Glide.with(this).load(movie.getMovieImage()).into(imageViewBanner);
            Glide.with(this).load(movie.getMovieImage()).into(imageViewDetail);
            textViewTitle.setText(movie.getMovieTitle());
            textViewGenre.setText(movie.getGenre());
            textViewScore.setText(movie.getMovieRating());
            textViewSynopsis.setText(movie.getMovieSynopsis());
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}
