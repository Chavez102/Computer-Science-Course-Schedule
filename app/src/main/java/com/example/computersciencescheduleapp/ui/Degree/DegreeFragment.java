package com.example.computersciencescheduleapp.ui.Degree;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.computersciencescheduleapp.R;

public class DegreeFragment extends Fragment {
    private DegreeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        homeViewModel =  ViewModelProviders.of(this).get(DegreeViewModel.class);


        View root = inflater.inflate(R.layout.fragment_degree, container, false);


//        final TextView textView = root.findViewById(R.id.text_home);
//
//
//
//
        final TextView mytextview=root.findViewById(R.id.mytext);
        mytextview.setText("Hello from DegreeFragment");
//
//
//
//
//
//
//
//        homeViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });


        return root;
    }
}
