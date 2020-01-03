package syahputro.bimo.submission1.utils;

import android.app.Activity;

import java.util.ArrayList;

import syahputro.bimo.submission1.R;
import syahputro.bimo.submission1.data.MovieEntity;
import syahputro.bimo.submission1.data.TvshowEntity;

public class DataDummy {
    public ArrayList<MovieEntity> generateDummyMovie(Activity activity) {
        ArrayList<MovieEntity> movies = new ArrayList<>();
        movies.add(new MovieEntity("Avengers: Infinity War (2018)", R.drawable.movie_poster_infinity_war, activity.getResources().getString(R.string.genre_avenger), "83", activity.getResources().getString(R.string.synopsis_avenger)));
        movies.add(new MovieEntity("Aquaman (2018)", R.drawable.movie_poster_aquaman, activity.getResources().getString(R.string.genre_aquaman), "68", activity.getResources().getString(R.string.synopsis_aquaman)));
        movies.add(new MovieEntity("Bohemian Rhapsody (2018)", R.drawable.movie_poster_bohemian, activity.getResources().getString(R.string.genre_bohemian), "81", activity.getResources().getString(R.string.synopsis_bohemian)));
        movies.add(new MovieEntity("Bumblebee (2018)", R.drawable.movie_poster_bumblebee, activity.getResources().getString(R.string.genre_bumblebee), "81", activity.getResources().getString(R.string.synopsis_bumblebee)));
        movies.add(new MovieEntity("Creed (2018)", R.drawable.movie_poster_creed, activity.getResources().getString(R.string.genre_creed), "81", activity.getResources().getString(R.string.synopsis_bumblebee)));
        movies.add(new MovieEntity("Once Upon a Deadpool (2018)", R.drawable.movie_poster_deadpool, activity.getResources().getString(R.string.genre_deadpool), "69", activity.getResources().getString(R.string.synopsis_deadpool)));
        movies.add(new MovieEntity("Glass (2019)", R.drawable.movie_poster_glass, activity.getResources().getString(R.string.genre_glass), "65", activity.getResources().getString(R.string.synopsis_glass)));
        movies.add(new MovieEntity("Hunter Killer (2018)", R.drawable.movie_poster_hunterkiller, activity.getResources().getString(R.string.genre_hunterkiller), "63", activity.getResources().getString(R.string.synopsis_hunterkiller)));
        movies.add(new MovieEntity("The Mule (2018)", R.drawable.movie_poster_themule, activity.getResources().getString(R.string.genre_themule), "65", activity.getResources().getString(R.string.synopsis_themule)));
        movies.add(new MovieEntity("Venom (2018)", R.drawable.movie_poster_venom, activity.getResources().getString(R.string.genre_venom), "66", activity.getResources().getString(R.string.synopsis_venom)));
        return movies;
    }

    public ArrayList<TvshowEntity> generateDummyTvshow(Activity activity) {
        ArrayList<TvshowEntity> tvshows = new ArrayList<>();
        tvshows.add(new TvshowEntity("Arrow", R.drawable.tv_poster_arrow, activity.getResources().getString(R.string.genre_arrow), "58", activity.getResources().getString(R.string.synopsis_arrow)));
        tvshows.add(new TvshowEntity("Doom Patrol", R.drawable.tv_poster_doom_patrol, activity.getResources().getString(R.string.genre_doom_patrol), "63", activity.getResources().getString(R.string.synopsis_doom_patrol)));
        tvshows.add(new TvshowEntity("Dragon Ball", R.drawable.tv_poster_dragon_ball, activity.getResources().getString(R.string.genre_dragon_ball), "70", activity.getResources().getString(R.string.synopsis_dragon_ball)));
        tvshows.add(new TvshowEntity("Family Guy", R.drawable.tv_poster_family_guy, activity.getResources().getString(R.string.genre_family_guy), "65", activity.getResources().getString(R.string.synopsis_family_guy)));
        tvshows.add(new TvshowEntity("The Flash", R.drawable.tv_poster_flash, activity.getResources().getString(R.string.genre_flash), "66", activity.getResources().getString(R.string.synopsis_flash)));
        tvshows.add(new TvshowEntity("Gotham", R.drawable.tv_poster_gotham, activity.getResources().getString(R.string.genre_gotham), "69", activity.getResources().getString(R.string.synopsis_gotham)));
        tvshows.add(new TvshowEntity("Hanna", R.drawable.tv_poster_hanna, activity.getResources().getString(R.string.genre_hanna), "66", activity.getResources().getString(R.string.synopsis_hanna)));
        tvshows.add(new TvshowEntity("Naruto Shippuden", R.drawable.tv_poster_naruto_shipudden, activity.getResources().getString(R.string.genre_naruto), "76", activity.getResources().getString(R.string.synopsis_naruto)));
        tvshows.add(new TvshowEntity("NCIS", R.drawable.tv_poster_ncis, activity.getResources().getString(R.string.genre_ncis), "67", activity.getResources().getString(R.string.synopsis_ncis)));
        tvshows.add(new TvshowEntity("Riverdale", R.drawable.tv_poster_riverdale, activity.getResources().getString(R.string.genre_riverdale), "70", activity.getResources().getString(R.string.synopsis_riverdale)));
        return tvshows;
    }
}
