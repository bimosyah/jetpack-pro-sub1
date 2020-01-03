package syahputro.bimo.submission1.ui.detail_tvshow;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import com.bumptech.glide.Glide;

import syahputro.bimo.submission1.R;
import syahputro.bimo.submission1.data.MovieEntity;
import syahputro.bimo.submission1.data.TvshowEntity;
import syahputro.bimo.submission1.ui.detail_movie.DetailMovieViewModel;

public class DetailTvshowActivity extends AppCompatActivity {
    ImageView imageViewBanner;
    ImageView imageViewDetail;
    TextView textViewTitle, textViewGenre, textViewScore, textViewSynopsis;

    public static final String ID_MOVIE = "id_movie";
    DetailTvshowViewModel viewModel;
    TvshowEntity tvshow;

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

        viewModel = ViewModelProviders.of(this).get(DetailTvshowViewModel.class);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int id = extras.getInt(ID_MOVIE);
            viewModel.setId(id);
            tvshow = viewModel.geTvshow();
        }

        if (viewModel != null) {
            Glide.with(this).load(tvshow.getTvImage()).into(imageViewBanner);
            Glide.with(this).load(tvshow.getTvImage()).into(imageViewDetail);
            textViewTitle.setText(tvshow.getTvTitle());
            textViewGenre.setText(tvshow.getgenre());
            textViewScore.setText(tvshow.getTvRating());
            textViewSynopsis.setText(tvshow.getTvSynopsis());
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}
