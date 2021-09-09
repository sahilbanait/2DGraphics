package com.example.a2dgraphics;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MyView extends View {

    public MyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

    }
    @Override
    public void onDraw(Canvas canvas){

        canvas.drawColor(Color.rgb(32,32,32));

        Paint redPaint = new Paint();
        redPaint.setColor(Color.rgb(255, 0, 0));

        Paint greenPaint = new Paint();
        greenPaint.setColor(Color.rgb(0, 255, 0));

        Paint bluePaint = new Paint();
        bluePaint.setColor(Color.rgb(0, 0, 255));

        canvas.drawCircle(800, 500, 200, redPaint);
        canvas.drawCircle(325, 900, 300, greenPaint);
        canvas.drawCircle(900, 1600, 400, bluePaint);
    }





}



