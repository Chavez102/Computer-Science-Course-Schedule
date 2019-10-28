package com.example.computersciencescheduleapp.ui.DataManagement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CoursesTakenByUser {

    public static HashMap<String,Course> CourseTakenMap;

    public CoursesTakenByUser(){
        CourseTakenMap=new HashMap<>(50);
    }


    public void addCourse(Course newcourse){
        CourseTakenMap.put(newcourse.getId(),newcourse);
    }



        public static void printMap() {
            // Getting an iterator
            Iterator hmIterator = CourseTakenMap.entrySet().iterator();

            while (hmIterator.hasNext()) {
                Map.Entry mapElement = (Map.Entry)hmIterator.next();
                Course currentcourse = (Course)mapElement.getValue();



                System.out.println("id:"+currentcourse.getId()+
                        "                name:"+currentcourse.getName()+
                        "                Prereq:"+currentcourse.getPrereq()+
                        "                Credit:"+currentcourse.getCredit()
                );
            }

        }






}
