package com.example.g2app.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentController;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.g2app.fragments.InfoFragment;
import com.example.g2app.struct.Course;
import com.example.g2app.adapters.CourseAdapter;
import com.example.g2app.R;

import java.util.List;

public class SecondActivity extends AppCompatActivity implements CourseAdapter.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



    }

    @Override
    public void onItemClick(Course course) {
        boolean Istablet = getResources().getBoolean(R.bool.IsTablet);

        if(Istablet){
            Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.tablet_frag_info);
            InfoFragment info = (InfoFragment) fragment;
            info.dispalyInfo(course);

        }else {
            FragmentTransaction fragmentController = getSupportFragmentManager().beginTransaction();

            Bundle bundle = new Bundle();
            bundle.putString("name", course.getName());
            bundle.putDouble("grade", course.getGrade());
            bundle.putDouble("credit", course.getCredit());
            bundle.putDouble("coefficient", course.getCoefficient());


            InfoFragment infoFragment = new InfoFragment();
            infoFragment.setArguments(bundle);


            fragmentController.replace(R.id.frag_cont, infoFragment);
            fragmentController.addToBackStack(null);
            fragmentController.commit();
        }
    }
}