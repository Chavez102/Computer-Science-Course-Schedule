package com.example.computersciencescheduleapp.ui.WhatsNext;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.computersciencescheduleapp.MainActivity;
import com.example.computersciencescheduleapp.R;
import com.example.computersciencescheduleapp.ui.DataManagement.Course;
import com.example.computersciencescheduleapp.ui.home.CourseListAdapter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import static com.example.computersciencescheduleapp.MainActivity.Main_CScourses;
import static com.example.computersciencescheduleapp.MainActivity.Main_CoursesTaken;


public class WhatsNextFragment extends Fragment {

    public static ArrayList<Course> AvailableCourseslist=new ArrayList<>();

    CourseListAdapter AvailableCourseadapter;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_whatsnext, container, false);


        ListView WhatsNext_ListView=(ListView)root.findViewById(R.id.SdSemesterListView);




        AvailableCourseslist.clear();












//List should only be for courses that are in CScourses and NOT CoursesTakenByUser
        Iterator hmIterator = Main_CScourses.AllCoursesNeeded_map.entrySet().iterator();

        while (hmIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry)hmIterator.next();
            Course currentcourse = (Course)mapElement.getValue();
            String courseNeededId=currentcourse.getId();



            //if current courseID is in Main_CourseTaken then
            if(!Main_CoursesTaken.CourseTakenMap.containsKey(courseNeededId)){


                AvailableCourseslist.add(currentcourse);
            }


        }







        AvailableCourseadapter=new CourseListAdapter(root.getContext(),R.layout.adapter_home,AvailableCourseslist);


        WhatsNext_ListView.setAdapter(AvailableCourseadapter);






//FOOTER

        int totalcredits=0;
        for(int i=0;i<AvailableCourseslist.size();i++){
            totalcredits=totalcredits+AvailableCourseslist.get(i).getCredit();
        }

        View footerview = ((LayoutInflater)root.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE))
                .inflate(R.layout.footer_homefragment, null);
        WhatsNext_ListView.addFooterView(footerview);

        TextView totalcredits_tx=(TextView)root.findViewById(R.id.int_TotalCredits_Textview);
        totalcredits_tx.setText(String.valueOf(totalcredits));



        return root;
    }
}
