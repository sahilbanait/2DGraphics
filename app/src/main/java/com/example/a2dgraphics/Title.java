package com.example.a2dgraphics;

import android.graphics.Color;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a2dgraphics.databinding.TitleBinding;


public class Title extends Fragment {
    private TitleBinding titleBinding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        titleBinding = DataBindingUtil.inflate(inflater, R.layout.title, container, false);
        titleBinding.firstActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_title_to_first_Activity);
            }
        });
        titleBinding.secondActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Navigation.findNavController(view).navigate(R.id.action_title_to_second_Activity);



            }
        });

        return titleBinding.getRoot();
    }


}