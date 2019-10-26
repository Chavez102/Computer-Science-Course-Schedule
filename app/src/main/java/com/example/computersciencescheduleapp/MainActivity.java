package com.example.computersciencescheduleapp;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setItemIconTintList(null);
        //android.R.layout.simple_list_item_1

//        int[][] states={
//            //    new int[]{android.R.attr.state_pressed},
//           //     new int[]{-android.R.attr.state_pressed}
//        };
//        int colors[]={
//        //        Color.GREEN
//                //,
//            //    Color.TRANSPARENT
//        };
//        ColorStateList mylist=new ColorStateList(states,colors);
//
//
//
//        navView.setItemIconTintList(mylist);

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home,
                R.id.navigation_degree,
                R.id.navigation_degreeTemplate,
                R.id.navigation_whatsnext
        )
                .build();

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);





















    }

}
