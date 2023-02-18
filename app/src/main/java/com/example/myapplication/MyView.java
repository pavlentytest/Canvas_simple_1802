package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

public class MyView extends View {

    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.RED);// цвет маркера
        //paint.setColor(Color.rgb(255,1,2));
        //paint.setColor(Color.parseColor("#00ff00"));
        paint.setStyle(Paint.Style.FILL); // заливка
        paint.setAntiAlias(true); // сглаживание
        paint.setTextSize(100); // размер
        paint.setStrokeWidth(10); // толщина маркера
        int y = getHeight()/2;
        int x = getWidth()/2;
        canvas.drawColor(Color.BLUE);
        canvas.drawCircle(x, y, 300, paint);
        RectF rectF = new RectF(100,100,1000,200);
        canvas.drawOval(rectF, paint);

        canvas.drawText("Test message!", 100, 300, paint);

        float rotate_center_x = 200;
        float rotate_center_y = 200;
        float rotate_angle = 45;

        canvas.rotate(-rotate_angle, rotate_center_x, rotate_center_y);
        canvas.drawText("Hello!!!", 100, 700, paint);
        canvas.rotate(rotate_angle, rotate_center_x, rotate_center_y);

        Path path = new Path();
        path.moveTo(100,100);
        path.lineTo(500,500);
        path.lineTo(100,400);
        paint.setColor(Color.WHITE);
        canvas.drawPath(path, paint);

    }
}
