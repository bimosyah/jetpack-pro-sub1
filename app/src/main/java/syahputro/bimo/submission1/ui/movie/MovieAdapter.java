package syahputro.bimo.submission1.ui.movie;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import syahputro.bimo.submission1.R;
import syahputro.bimo.submission1.data.MovieEntity;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {
    private final Activity activity;
    private List<MovieEntity> mMovie = new ArrayList<>();

    MovieAdapter(Activity activity) {
        this.activity = activity;
    }

    void setListMovies(List<MovieEntity> listMovie) {
        if (listMovie == null) return;
        this.mMovie.clear();
        this.mMovie.addAll(listMovie);
    }

    private List<MovieEntity> getListMovie() {
        return mMovie;
    }

    @NonNull
    @Override
    public MovieAdapter.MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(activity).inflate(R.layout.item_list, parent, false);
        final MovieAdapter.MovieViewHolder viewHolder = new MovieAdapter.MovieViewHolder(view);

//        viewHolder.movie_card.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                listener.onItemClick(mData.get(viewHolder.getAdapterPosition()),viewHolder.getAdapterPosition());
//            }
//        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.MovieViewHolder holder, int position) {
        holder.movieTitle.setText(getListMovie().get(position).getMovieTitle());
        Glide.with(activity).load(getListMovie().get(position).getMovieImage()).into(holder.movieImage);
        holder.movieGenre.setText(getListMovie().get(position).getGenre());
        holder.movieRating.setText(getListMovie().get(position).getMovieRating());
        holder.movieSynopsis.setText(getListMovie().get(position).getMovieSynopsis().substring(0,60)+"...");

    }

    @Override
    public int getItemCount() {
        return mMovie.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder {
        private TextView movieTitle;
        private ImageView movieImage;
        private TextView movieGenre;
        private TextView movieRating;
        private TextView movieSynopsis;
        private ConstraintLayout movie_card;

        public MovieViewHolder(View view) {
            super(view);
            movie_card = view.findViewById(R.id.movie_card);
            movieTitle = view.findViewById(R.id.text_view_movie_title);
            movieImage = view.findViewById(R.id.image_view_poster);
            movieGenre = view.findViewById(R.id.text_view_movie_genre);
            movieRating = view.findViewById(R.id.text_view_movie_score);
            movieSynopsis = view.findViewById(R.id.text_view_movie_synopsis);
        }
    }
}
