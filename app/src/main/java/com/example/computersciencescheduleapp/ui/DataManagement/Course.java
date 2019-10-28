package com.example.computersciencescheduleapp.ui.DataManagement;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Course {
    String description;
    String name;
    String id;
    int credit;
    String prereq="No Prerequisite";

    public String getPrereq() {
        return prereq;
    }
    public void setPrereq(String prereq) {
        this.prereq = prereq;
    }
    public Course(String id, String name, int credit) {
        this.name = name;
        this.id = id;
        this.credit = credit;
    }
    public Course(String id, String name,String description, int credit,String prereq) {
        this.name = name;
        this.id = id;
        this.credit = credit;
        this.description=description;
        this.prereq=prereq;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals( Object o) {

        if(! (o instanceof Course)) return false; //a Person can't be equal to a non-person

        Course othercourse = (Course) o;
        if(id.equals(othercourse.getId())) {
            return true;
        }
        else {
            return false;
        }
    }
}
