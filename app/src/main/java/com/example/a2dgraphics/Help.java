package com.example.a2dgraphics;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a2dgraphics.databinding.HelpBinding;

public class Help extends Fragment {
    private HelpBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
     binding = DataBindingUtil.inflate(inflater, R.layout.help, container,false);
     return binding.getRoot();
    }
}