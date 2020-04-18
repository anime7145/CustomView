package com.example.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public class CustomView extends View implements View.OnClickListener {

    public Rect rect;
    private Paint p;

    public CustomView(Context context) {
        super(context);

        init(null);

    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);
    }

    private void init(@Nullable AttributeSet set){
        setOnClickListener(this);
        rect = new Rect();
        p = new Paint(Paint.ANTI_ALIAS_FLAG);
        p.setColor(Color.GREEN);
    }

    public void swapColor(){
        p.setColor(p.getColor() == Color.GREEN ? Color.RED : Color.GREEN);
        postInvalidate();
    }


    @Override
    protected void onDraw(Canvas canvas) {

        rect.left = 10;
        rect.top = 10;
        rect.right = rect.left + 100;
        rect.bottom = rect.top + 100;

        canvas.drawRect(rect,p);
    }

    @Override
    public void onClick(View view) {
        swapColor();
//        postInvalidate();
    }
}
