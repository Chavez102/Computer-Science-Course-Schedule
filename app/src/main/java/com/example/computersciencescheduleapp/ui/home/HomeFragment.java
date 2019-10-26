package com.example.computersciencescheduleapp.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.computersciencescheduleapp.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    public ListView ListView;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        homeViewModel =  ViewModelProviders.of(this).get(HomeViewModel.class);


        View root = inflater.inflate(R.layout.fragment_home, container, false);




        ListView=(ListView)root.findViewById(R.id.homelistview);

        ArrayList<String> array=new ArrayList<>();

        array.add("name1                                   Credit");
        array.add("name2                         credit");
        array.add("name3                          credit");
        array.add("name4                          credit");
        array.add("name5                      credit ");
        array.add("name1");
        array.add("name2");
        array.add("name3");
        array.add("name4");
        array.add("name5");
        array.add("name1");
        array.add("name2");
        array.add("name3");
        array.add("name4");
        array.add("name5");
        array.add("name1");
        array.add("name2");
        array.add("name3");
        array.add("name4");
        array.add("name5");
        array.add("name1");
        array.add("name2");
        array.add("name3");
        array.add("name4");
        array.add("name5"); array.add("name1");
        array.add("name2");
        array.add("name3");
        array.add("name4");
        array.add("name5");



        ArrayAdapter adapter=new ArrayAdapter(root.getContext(),android.R.layout.simple_list_item_1,array);

        ListView.setAdapter(adapter);


















 //       TextView Current_Semester_textview=root.findViewById(R.id.current_semester_TextView);
//        Current_Semester_textview.setPaintFlags(Current_Semester_textview.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
//        Current_Semester_textview.setText("This text will be underlined");

//
//        final TextView textView = root.findViewById(R.id.text_home);
//
//
//
//
//        TextView mytextview=root.findViewById(R.id.mytextView);
//        mytextview.setText("hola amigo");
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