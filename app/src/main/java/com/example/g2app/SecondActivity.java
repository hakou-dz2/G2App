package com.example.g2app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        RecyclerView recyclerView = findViewById(R.id.list_course);

        List<Course> courses = List.of(
                new Course("Math", 90.0),
                new Course("Science", 80.0),
                new Course("Englishssssss", 85.0),
                new Course("History", 75.0),
                new Course("Art", 95.0),
                new Course("PE", 100.0),
                new Course("Music", 90.0),
                new Course("Computer", 85.0),
                new Course("Biology", 80.0),
                new Course("Chemistry", 75.0)
        );

        CourseAdapter courseAdapter = new CourseAdapter(courses);
        recyclerView.setAdapter(courseAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}