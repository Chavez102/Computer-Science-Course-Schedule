package com.example.computersciencescheduleapp.ui.home;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.computersciencescheduleapp.R;
import com.example.computersciencescheduleapp.ui.DataManagement.Course;

import java.util.ArrayList;

import static com.example.computersciencescheduleapp.MainActivity.Main_CoursesTaken;
import static com.example.computersciencescheduleapp.MainActivity.Main_allcourses;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    public ListView ListView;
    private ContextMenu context = null;
    public static Dialog myDialog;

    public final String myTag="INside home Fragment";

    public static ArrayList<Course> CoursesTaken=new ArrayList<>();
    public static CourseListAdapter courseadapter;

    public static ListView mylistview;
    public static View root;
    public static View Mfooterview;
    public static int totalcredits=0;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        homeViewModel =  ViewModelProviders.of(this).get(HomeViewModel.class);


         root = inflater.inflate(R.layout.fragment_home, container, false);



        mylistview=(ListView)root.findViewById(R.id.homelistview);
        courseadapter=new CourseListAdapter(root.getContext(),R.layout.adapter_home,CoursesTaken);


        mylistview.setAdapter(courseadapter);


        Mfooterview = ((LayoutInflater)root.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE))
                .inflate(R.layout.footer_homefragment, null);



        mylistview.addFooterView(Mfooterview);
        TextView totalcredits_tx=(TextView)root.findViewById(R.id.int_TotalCredits_Textview);

        totalcredits_tx.setText(String.valueOf(totalcredits));




        myDialog=new Dialog(root.getContext());
        return root;
    }

    public  static void ShowAddPopup(View v){
        //Add btn has been assign an action thorough XML=addbtnPressed();
        myDialog.setContentView(R.layout.addpopup);
        ImageButton closeButton;



//closeButton
        closeButton=(ImageButton)myDialog.findViewById(R.id.close_imageButton);
        closeButton.setOnClickListener(new View.OnClickListener()   {
            public void onClick(View v)  {
                myDialog.dismiss();
            }
        });

//EditText

        myDialog.show();


    }

//WHen Popup Addbtn is pressed then
    public static void addbtnPressed(){
        totalcredits=0;

        TextView Warning_TextView=(TextView)myDialog.findViewById(R.id.Warningtext_TextView);
//get String from the EditText in the addpopup
        EditText courseinput=(EditText)myDialog.findViewById(R.id.Course_Id_input);
        String courseid=courseinput.getText().toString();


        //check if courseid is a Course in all college courses
        String warningstr="Course Not Found";

        if(Main_allcourses.Allcoursesmap.containsKey(courseid)) {

            String courseprereq = Main_allcourses.Allcoursesmap.get(courseid).getPrereq();
            Course newcourse = Main_allcourses.Allcoursesmap.get(courseid);


            if (CoursesTaken.contains(newcourse)) {
                warningstr = "Course already Taken";

            }else {

                //String id, String name,String description, int credit,String prereq
                Course temp = new Course(courseprereq, "name", "descriiption", 0, "per");

                if (courseprereq.equals("No Prerequisite") || (CoursesTaken.contains(temp)==true)     ) {

                    //if (no prequests) AND (not in list) then add
                    CoursesTaken.add(newcourse);
                    Main_CoursesTaken.addCourse(newcourse);
                    courseadapter.notifyDataSetChanged();
                    for (int i = 0; i < CoursesTaken.size(); i++) {
                        totalcredits = totalcredits + CoursesTaken.get(i).getCredit();
                    }


                    TextView totalcredits_tx = (TextView) root.findViewById(R.id.int_TotalCredits_Textview);

                    totalcredits_tx.setText(String.valueOf(totalcredits));


                    myDialog.dismiss();

                } else {

                    courseprereq = Main_allcourses.Allcoursesmap.get(courseid).getPrereq();
                    warningstr = "Need " + courseprereq;

                }
            }


            Warning_TextView.setText(warningstr);
            Warning_TextView.setVisibility(View.VISIBLE);


        }





    }





}