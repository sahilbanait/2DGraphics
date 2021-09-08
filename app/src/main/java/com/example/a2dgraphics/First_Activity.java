package com.example.a2dgraphics;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.a2dgraphics.databinding.FirstActivityBinding;


public class First_Activity extends Fragment{
    private FirstActivityBinding binding;

    private ViewGroup mainLayout;
    private ImageView image;
    private ImageView imagetwo;
    private int xDelta;
    private int yDelta;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       binding = DataBindingUtil.inflate(inflater,R.layout.first__activity, container, false);

        mainLayout = binding.firstLayout;
        image = binding .image;
        imagetwo = binding.imagetwo;
        image.setOnTouchListener(onTouchListener());
        imagetwo.setOnTouchListener(onTouchListener());


       return binding.getRoot();
    }

    private View.OnTouchListener onTouchListener() {
        return new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                final int x = (int) event.getRawX();
                final int y = (int) event.getRawY();
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();

                switch (event.getAction() & MotionEvent.ACTION_MASK) {
                    case MotionEvent.ACTION_DOWN:
                        RelativeLayout.LayoutParams lParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
                        xDelta = x - lParams.leftMargin;
                        yDelta = y - lParams.topMargin;
                        break;
                    case MotionEvent.ACTION_UP:
                        Toast.makeText(getContext(), "x axis: " + layoutParams.leftMargin + " y axis: " + layoutParams.topMargin, Toast.LENGTH_SHORT).show();
                        break;
                    case MotionEvent.ACTION_MOVE:
                        layoutParams.leftMargin = x - xDelta;
                        layoutParams.topMargin = y - yDelta;
                        layoutParams.rightMargin = 0;
                        layoutParams.bottomMargin = 0;
                        view.setLayoutParams(layoutParams);
                        break;
                }
                mainLayout.invalidate();
                return true;
            }
        };
    }



}


