package com.example.computersciencescheduleapp.ui.WhatsNext;

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


public class WhatsNextFragment extends Fragment {
    private WhatsNextViewModel WhatsNextViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
//        WhatsNextViewModel =
//                ViewModelProviders.of(this).get(WhatsNextViewModel.class);

               // ViewModelProviders.of(this).get(WhatsNextViewModel.class);

        View root = inflater.inflate(R.layout.fragment_whatsnext, container, false);

//        final TextView textView = root.findViewById(R.id.mytextView);
//


//        WhatsNextViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });



//        textView.setText("Second one");
        return root;
    }
}
