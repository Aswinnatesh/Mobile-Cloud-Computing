package com.example.myclass.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myclass.R;
import com.example.myclass.data.Class;

public class Class1DetailFragment extends Fragment {
  int position = 0;
  TextView tvTitle;
  TextView tvDetails;

  @Override
  public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    if(savedInstanceState == null){
      // Get back arguments
      if(getArguments() != null) {
        position = getArguments().getInt("position", 0);
      }
    }
  }

  @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable Bundle savedInstanceState) {

    // Inflate the xml file for the fragment
    return inflater.inflate(R.layout.fragment_class_detail, parent, false);
  }

  @Override
  public void onViewCreated(View view, Bundle savedInstanceState) {
    // Set values for view here
    tvTitle = (TextView) view.findViewById(R.id.tvTitle);
    tvDetails = (TextView) view.findViewById(R.id.tvDetails);

    // update view
    tvTitle.setText(Class.classMenu[position]);
    tvDetails.setText(Class.classDetails[position]);
  }

  // Activity is calling this to update view on Fragment
  public void updateView(int position){
    tvTitle.setText(Class.classMenu[position]);
    tvDetails.setText(Class.classDetails[position]);
  }
}
