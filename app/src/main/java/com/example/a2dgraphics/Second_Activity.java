package com.example.a2dgraphics;

import android.graphics.Color;
import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a2dgraphics.databinding.SecondActivityBinding;

public class Second_Activity extends Fragment {
    private SecondActivityBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = DataBindingUtil.inflate(inflater,R.layout.second__activity,container,false);
       View myView = new MyView(requireActivity());

        myView.setBackgroundColor(Color.WHITE);
        return binding.getRoot();
    }
}