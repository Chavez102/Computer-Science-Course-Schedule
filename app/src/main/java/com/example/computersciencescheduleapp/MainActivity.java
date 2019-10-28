package com.example.computersciencescheduleapp;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.computersciencescheduleapp.ui.DataManagement.AllCoursesNeededMap;
import com.example.computersciencescheduleapp.ui.DataManagement.AllcoursesinCollege;
import com.example.computersciencescheduleapp.ui.DataManagement.CoursesTakenByUser;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.computersciencescheduleapp.ui.home.HomeFragment;

import java.io.IOException;

import static com.example.computersciencescheduleapp.ui.home.HomeFragment.ShowAddPopup;
import static com.example.computersciencescheduleapp.ui.home.HomeFragment.addbtnPressed;
import static com.example.computersciencescheduleapp.ui.home.HomeFragment.myDialog;

public class MainActivity extends AppCompatActivity {
    public final String TAG="IM in Main Activity";
    public static AllcoursesinCollege Main_allcourses=null;
    public static AllCoursesNeededMap Main_CScourses=null;
    public static CoursesTakenByUser  Main_CoursesTaken=new CoursesTakenByUser();




    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);


        try {
            Main_allcourses = new AllcoursesinCollege(MainActivity.this);
            Main_CScourses=new AllCoursesNeededMap(Main_allcourses.Allcoursesmap);
        } catch (IOException e) {
            e.printStackTrace();
        }






        navView.setItemIconTintList(null);



        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home,
        //        R.id.navigation_degree,
                R.id.navigation_degreeTemplate,
                R.id.navigation_whatsnext
        )
                .build();

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);

    }
//Addbutton from the HOMEFragment
    public void Home_addbtnPressed(View v){

        ShowAddPopup(v);
    }
//Addbutton from PopUP
    public void Home_addpopup_addbtnPressed(View v){
      //  Log.d(TAG,"inside popup and btn pressed");
        addbtnPressed();

    }




}
