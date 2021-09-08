package com.example.a2dgraphics;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

public class MyView extends View {
    private float ballRadius = 80;
    private float ballX = ballRadius + 20;
    private float ballY = ballRadius + 40;
    private RectF frame;
    private Paint paint;

    public MyView(Context context) {
        super(context);
        frame = new RectF();
        paint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
      frame.set(ballX-ballRadius, ballY-ballRadius, ballX+ballRadius, ballY+ballRadius);
        paint.setColor(Color.RED);
        canvas.drawOval(frame, paint);
    }
}
