package com.example.g2app.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.g2app.R;
import com.example.g2app.adapters.CourseAdapter;
import com.example.g2app.struct.Course;

import java.util.List;


public class ListFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = view.findViewById(R.id.list_course);

        List<Course> courses = List.of(
                new Course("Math", 90.0, 3.0, 1.5),
                new Course("Science", 80.0, 4.0, 2.0),
                new Course("English", 85.0, 2.0, 1.0),
                new Course("History", 75.0, 3.0, 1.5),
                new Course("Art", 95.0, 2.0, 1.0),
                new Course("PE", 100.0, 1.0, 0.5),
                new Course("Music", 90.0, 2.0, 1.0),
                new Course("Computer", 85.0, 3.0, 1.5),
                new Course("Biology", 80.0, 4.0, 2.0),
                new Course("Chemistry", 75.0, 3.0, 1.5)
        );

        CourseAdapter courseAdapter = new CourseAdapter(courses, (CourseAdapter.OnItemClickListener) this.getActivity());
        recyclerView.setAdapter(courseAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
    }
}