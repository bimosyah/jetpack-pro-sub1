package syahputro.bimo.submission1.ui.tvshow;

import android.app.Activity;
import android.content.Intent;
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
import syahputro.bimo.submission1.data.TvshowEntity;
import syahputro.bimo.submission1.ui.detail_tvshow.DetailTvshowActivity;

public class TvshowAdapter extends RecyclerView.Adapter<TvshowAdapter.TvshowViewHolder> {
    private final Activity activity;
    private List<TvshowEntity> mTvshow = new ArrayList<>();

    TvshowAdapter(Activity activity) {
        this.activity = activity;
    }

    void setListTv(List<TvshowEntity> listMovie) {
        if (listMovie == null) return;
        this.mTvshow.clear();
        this.mTvshow.addAll(listMovie);
    }

    private List<TvshowEntity> getListMovie() {
        return mTvshow;
    }

    @NonNull
    @Override
    public TvshowAdapter.TvshowViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(activity).inflate(R.layout.item_list, parent, false);
        final TvshowAdapter.TvshowViewHolder viewHolder = new TvshowAdapter.TvshowViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TvshowAdapter.TvshowViewHolder holder, final int position) {
        holder.movieTitle.setText(getListMovie().get(position).getTvTitle());
        Glide.with(activity).load(getListMovie().get(position).getTvImage()).into(holder.movieImage);
        holder.movieGenre.setText(getListMovie().get(position).getgenre());
        holder.movieRating.setText(getListMovie().get(position).getTvRating());
        holder.movieSynopsis.setText(getListMovie().get(position).getTvSynopsis().substring(0, 60) + "...");
        holder.movie_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, DetailTvshowActivity.class);
                intent.putExtra(DetailTvshowActivity.ID_MOVIE, position);
                activity.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mTvshow.size();
    }

    public class TvshowViewHolder extends RecyclerView.ViewHolder {
        private TextView movieTitle;
        private ImageView movieImage;
        private TextView movieGenre;
        private TextView movieRating;
        private TextView movieSynopsis;
        private ConstraintLayout movie_card;

        public TvshowViewHolder(View view) {
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
