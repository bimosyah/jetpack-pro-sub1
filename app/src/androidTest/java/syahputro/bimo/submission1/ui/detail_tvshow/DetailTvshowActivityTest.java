package syahputro.bimo.submission1.ui.detail_tvshow;

import android.content.Context;
import android.content.Intent;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import syahputro.bimo.submission1.R;
import syahputro.bimo.submission1.data.TvshowEntity;
import syahputro.bimo.submission1.utils.FakeDataDummy;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class DetailTvshowActivityTest {
    @Rule
    public ActivityTestRule<DetailTvshowActivity> activityRule = new ActivityTestRule<DetailTvshowActivity>(DetailTvshowActivity.class) {
        @Override
        protected Intent getActivityIntent() {
            Context targetContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
            Intent result = new Intent(targetContext, DetailTvshowActivity.class);
            result.putExtra(DetailTvshowActivity.ID_MOVIE, 0);
            return result;
        }
    };
    private TvshowEntity dummyCourse = FakeDataDummy.generateDummyTvshow().get(0);

    @Test
    public void loadTv() {
        onView(withId(R.id.image_view_detail)).check(matches(isDisplayed()));
        onView(withId(R.id.image_view_banner)).check(matches(isDisplayed()));
        onView(withId(R.id.text_view_movie_title_detail)).check(matches(isDisplayed()));
        onView(withId(R.id.text_view_movie_title_detail)).check(matches(withText(dummyCourse.getTvTitle())));
        onView(withId(R.id.text_view_movie_genre_detail)).check(matches(isDisplayed()));
        onView(withId(R.id.text_view_movie_genre_detail)).check(matches(withText(dummyCourse.getgenre())));
        onView(withId(R.id.text_view_movie_score_detail)).check(matches(isDisplayed()));
        onView(withId(R.id.text_view_movie_score_detail)).check(matches(withText(dummyCourse.getTvRating())));
        onView(withId(R.id.text_view_movie_synopsis_detail)).check(matches(isDisplayed()));
        onView(withId(R.id.text_view_movie_synopsis_detail)).check(matches(withText(dummyCourse.getTvSynopsis())));

    }
}