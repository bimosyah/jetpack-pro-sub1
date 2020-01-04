package syahputro.bimo.submission1.ui.detail_movie;

import android.content.Context;
import android.content.Intent;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import syahputro.bimo.submission1.R;
import syahputro.bimo.submission1.data.MovieEntity;
import syahputro.bimo.submission1.utils.FakeDataDummy;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class DetailMovieActivityTest {
    @Rule
    public ActivityTestRule<DetailMovieActivity> activityRule = new ActivityTestRule<DetailMovieActivity>(DetailMovieActivity.class) {
        @Override
        protected Intent getActivityIntent() {
            Context targetContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
            Intent result = new Intent(targetContext, DetailMovieActivity.class);
            result.putExtra(DetailMovieActivity.ID_MOVIE, 0);
            return result;
        }
    };
    private MovieEntity dummyCourse = FakeDataDummy.generateDummyMovie().get(0);

    @Test
    public void loadCourse() {
        onView(withId(R.id.image_view_detail)).check(matches(isDisplayed()));
        onView(withId(R.id.image_view_banner)).check(matches(isDisplayed()));
        onView(withId(R.id.text_view_movie_title_detail)).check(matches(isDisplayed()));
        onView(withId(R.id.text_view_movie_title_detail)).check(matches(withText(dummyCourse.getMovieTitle())));
        onView(withId(R.id.text_view_movie_genre_detail)).check(matches(isDisplayed()));
        onView(withId(R.id.text_view_movie_genre_detail)).check(matches(withText(dummyCourse.getGenre())));
        onView(withId(R.id.text_view_movie_score_detail)).check(matches(isDisplayed()));
        onView(withId(R.id.text_view_movie_score_detail)).check(matches(withText(dummyCourse.getMovieRating())));
        onView(withId(R.id.text_view_movie_synopsis_detail)).check(matches(isDisplayed()));
        onView(withId(R.id.text_view_movie_synopsis_detail)).check(matches(withText(dummyCourse.getMovieSynopsis())));

    }

}