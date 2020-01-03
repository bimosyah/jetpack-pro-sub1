package syahputro.bimo.submission1.ui.tvshow;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import java.util.List;

import syahputro.bimo.submission1.R;
import syahputro.bimo.submission1.data.MovieEntity;
import syahputro.bimo.submission1.data.TvshowEntity;
import syahputro.bimo.submission1.ui.movie.MovieAdapter;
import syahputro.bimo.submission1.ui.movie.MovieViewModel;

/**
 * A simple {@link Fragment} subclass.
 */
public class TvshowFragment extends Fragment {

    private RecyclerView rvCourse;
    private ProgressBar progressBar;
    private TvshowViewModel viewModel;
    private List<TvshowEntity> tvshow;
    private TvshowAdapter adapter;

    public TvshowFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tvshow, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvCourse = view.findViewById(R.id.rv_tvshow);
        progressBar = view.findViewById(R.id.progress_bar);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (getActivity() != null) {
            viewModel = ViewModelProviders.of(this).get(TvshowViewModel.class);
            tvshow = viewModel.getTvshow();

            adapter = new TvshowAdapter(getActivity());
            adapter.setListTv(tvshow);
            rvCourse.setLayoutManager(new LinearLayoutManager(getContext()));
            rvCourse.setHasFixedSize(true);
            rvCourse.setAdapter(adapter);
        }
    }

}
