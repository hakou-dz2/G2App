package com.example.g2app.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.g2app.R;
import com.example.g2app.struct.Course;


public class InfoFragment extends Fragment {
    TextView name,grade,credit,coefficient;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_info, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

         name = view.findViewById(R.id.tv_info_name);
         grade = view.findViewById(R.id.tv_info_grade);
         credit = view.findViewById(R.id.tv_info_cred);
         coefficient = view.findViewById(R.id.tv_info_coeff);

        Bundle bundle = this.getArguments();
        if(bundle != null) {
            name.setText(bundle.getString("name"));
            grade.setText(String.valueOf(bundle.getDouble("grade")));
            credit.setText(String.valueOf(bundle.getDouble("credit")));
            coefficient.setText(String.valueOf(bundle.getDouble("coefficient")));
        }
    }

    public void dispalyInfo(Course course){
        name.setText(course.getName());
        grade.setText(String.valueOf(course.getGrade()));
        credit.setText(String.valueOf(course.getCredit()));
        coefficient.setText(String.valueOf(course.getCoefficient()));

    }
}