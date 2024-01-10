package com.eightbit.blog.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.eightbit.blog.R;
import com.eightbit.blog.adapter.movie.MovieRecyclerViewAdapter;

import java.util.List;


public class MovieListFragment extends Fragment {

    RecyclerView recyclerView;

    public MovieListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.movieListRecyclerView);

        List<String> strings = List.of("The Shawshank Redemption", "The Godfather", "The Dark Knight", "Pulp Fiction", "Forrest Gump", "Inception", "The Matrix", "Schindler's List", "Jurassic Park", "Avatar");

        MovieRecyclerViewAdapter adapter = new MovieRecyclerViewAdapter(getContext(), strings);
        recyclerView.setAdapter(adapter);

    }
}