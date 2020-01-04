package syahputro.bimo.submission1.ui.tvshow;

import androidx.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import syahputro.bimo.submission1.R;
import syahputro.bimo.submission1.testing.SingleFragmentActivity;
import syahputro.bimo.submission1.ui.movie.MovieFragment;
import syahputro.bimo.submission1.utils.RecyclerViewItemCountAssertion;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class TvshowFragmentTest {
    @Rule
    public ActivityTestRule<SingleFragmentActivity> activityRule = new ActivityTestRule<>(SingleFragmentActivity.class);
    private TvshowFragment tvshowFragment = new TvshowFragment();

    @Before
    public void setUp() {
        activityRule.getActivity().setFragment(tvshowFragment);
    }

    @Test
    public void loadTvshow() {
        onView(withId(R.id.rv_tvshow)).check(matches(isDisplayed()));
        onView(withId(R.id.rv_tvshow)).check(new RecyclerViewItemCountAssertion(10));
    }
}