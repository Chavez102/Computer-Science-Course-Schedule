package com.example.computersciencescheduleapp.ui.DegreeTemplate;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.computersciencescheduleapp.MainActivity;
import com.example.computersciencescheduleapp.R;
import com.example.computersciencescheduleapp.ui.DataManagement.AllCoursesNeededMap;
import com.example.computersciencescheduleapp.ui.DataManagement.AllcoursesinCollege;
import com.example.computersciencescheduleapp.ui.DataManagement.Course;
import com.example.computersciencescheduleapp.ui.home.CourseListAdapter;

import java.io.IOException;
import java.util.ArrayList;

import static com.example.computersciencescheduleapp.MainActivity.Main_allcourses;


public class DegreeTemplateFragment extends Fragment {

   // public static ArrayList<Course> TemplateArraylist=new ArrayList<>();
        public static ArrayList<Course> list=new ArrayList<>();
    CourseListAdapter firstSemesterTemplateCourseadapter;
    public final String Tag="IM here in degree";




    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View root = inflater.inflate(R.layout.fragment_degreetemplate, container, false);

        ListView firstSemesterListVIew=(ListView)root.findViewById(R.id.FirstSemesterListView);
        ListView SecondSemesterListView=(ListView)root.findViewById(R.id.SecondSemesterListView);
        ListView thirdSemesterListView=(ListView)root.findViewById(R.id.ThirdSemesterListView);
        ListView fourthSemesterListView=(ListView)root.findViewById(R.id.FourthSemesterListView);

        //First Semester ListItems
        ArrayList<Course> FirstSemester_Arraylist=new ArrayList<>(10);
        AllcoursesinCollege  myallcourses=null;

//First Semester
        int firstSemesterCreditSum=0;
        Course course = Main_allcourses.Allcoursesmap.get("CSE110");
        FirstSemester_Arraylist.add(course);
        firstSemesterCreditSum=firstSemesterCreditSum+course.getCredit();

        course=Main_allcourses.Allcoursesmap.get("CSE118");
        FirstSemester_Arraylist.add(course);
        firstSemesterCreditSum=firstSemesterCreditSum+course.getCredit();

        course=Main_allcourses.Allcoursesmap.get("ENG101");
        FirstSemester_Arraylist.add(course);
        firstSemesterCreditSum=firstSemesterCreditSum+course.getCredit();

        course=Main_allcourses.Allcoursesmap.get("MAT141");
        FirstSemester_Arraylist.add(course);
        firstSemesterCreditSum=firstSemesterCreditSum+course.getCredit();
        Log.d("Total credits:","////////////////////"+firstSemesterCreditSum);

         firstSemesterTemplateCourseadapter=new CourseListAdapter(root.getContext(),
                                                                 R.layout.adapter_home,
                 FirstSemester_Arraylist);
        firstSemesterListVIew.setAdapter(firstSemesterTemplateCourseadapter);




//Second Semester ListItems
        int secondSemesterCreditSum=0;
        ArrayList<Course> SecondSemester_Arraylist=new ArrayList<>(10);

        course=Main_allcourses.Allcoursesmap.get("CSE148");
        SecondSemester_Arraylist.add(course);
        secondSemesterCreditSum=secondSemesterCreditSum+course.getCredit();

        course=Main_allcourses.Allcoursesmap.get("ENG102");
        SecondSemester_Arraylist.add(course);
        secondSemesterCreditSum=secondSemesterCreditSum+course.getCredit();

        course=Main_allcourses.Allcoursesmap.get("MAT142");
        SecondSemester_Arraylist.add(course);
        secondSemesterCreditSum=secondSemesterCreditSum+course.getCredit();


        CourseListAdapter secondSemesterTemplateCourseadapter=new CourseListAdapter(root.getContext(),
                                                        R.layout.adapter_home,SecondSemester_Arraylist);
        SecondSemesterListView.setAdapter(secondSemesterTemplateCourseadapter);


//Third Semester ListItems
        ArrayList<Course> thirdSemester_Arraylist=new ArrayList<>(10);
        course=Main_allcourses.Allcoursesmap.get("CSE110");
        thirdSemester_Arraylist.add(course);
        course=Main_allcourses.Allcoursesmap.get("CSE118");
        thirdSemester_Arraylist.add(course);
        course=Main_allcourses.Allcoursesmap.get("ENG101");
        thirdSemester_Arraylist.add(course);
        course=Main_allcourses.Allcoursesmap.get("MAT141");
        thirdSemester_Arraylist.add(course);

        CourseListAdapter thirdSemesterTemplateCourseadapter=new CourseListAdapter(root.getContext(),
                R.layout.adapter_home,thirdSemester_Arraylist);
        thirdSemesterListView.setAdapter(thirdSemesterTemplateCourseadapter);





//Fourth Semester ListItems
        ArrayList<Course> fourthSemester_Arraylist=new ArrayList<>(10);
        course=Main_allcourses.Allcoursesmap.get("CSE110");
        fourthSemester_Arraylist.add(course);
        course=Main_allcourses.Allcoursesmap.get("CSE118");
        fourthSemester_Arraylist.add(course);
        course=Main_allcourses.Allcoursesmap.get("ENG101");
        fourthSemester_Arraylist.add(course);
        course=Main_allcourses.Allcoursesmap.get("MAT141");
        fourthSemester_Arraylist.add(course);

        CourseListAdapter fourthSemesterTemplateCourseadapter=new CourseListAdapter(root.getContext(),
                R.layout.adapter_home,fourthSemester_Arraylist);
        fourthSemesterListView.setAdapter(fourthSemesterTemplateCourseadapter);




//footer
        View footerview = ((LayoutInflater)root.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE))
                .inflate(R.layout.footer_homefragment, null);

        TextView firstSemester_total_Credits=(TextView)footerview.findViewById(R.id.int_TotalCredits_Textview);
        firstSemester_total_Credits.setText(String.valueOf(firstSemesterCreditSum));
        firstSemesterListVIew.addFooterView(footerview);


        TextView secondSemester_total_Credits=(TextView)footerview.findViewById(R.id.int_TotalCredits_Textview);
        secondSemester_total_Credits.setText(String.valueOf(secondSemesterCreditSum));
        SecondSemesterListView.addFooterView(footerview);





        SecondSemesterListView.addFooterView(footerview);
        thirdSemesterListView.addFooterView(footerview);
        fourthSemesterListView.addFooterView(footerview);








        return root;
    }

}
