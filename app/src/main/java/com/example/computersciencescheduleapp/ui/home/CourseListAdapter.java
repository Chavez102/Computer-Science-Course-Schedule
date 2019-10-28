package com.example.computersciencescheduleapp.ui.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.computersciencescheduleapp.R;
import com.example.computersciencescheduleapp.ui.DataManagement.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseListAdapter extends ArrayAdapter<Course> {

    Context mcontext;
    int mResource;




    public CourseListAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Course> objects) {
        super(context, resource, objects);
        mcontext=context;
        mResource=resource;


    }




    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String id =getItem(position).getId();
        String name=getItem(position).getName();
        int credit=getItem(position).getCredit();

        Course c1=new Course(id,name,credit);

        LayoutInflater inflater =LayoutInflater.from(mcontext);

        convertView=inflater.inflate(mResource,parent,false);

        TextView tvid=(TextView)convertView.findViewById(R.id.id_Column_textview);
        TextView tvname=(TextView)convertView.findViewById(R.id.name_Column_textview);
        TextView tvcredit=(TextView)convertView.findViewById(R.id.credit_Column_textview);

        tvid.setText(id);
        tvname.setText(name);
        tvcredit.setText(String.valueOf(credit));



        return convertView;

    }
}
