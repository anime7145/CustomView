package com.example.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatButton;
import androidx.core.content.res.ResourcesCompat;

public class CustomButton extends AppCompatButton {
    public CustomButton(Context context) {
        super(context);
    }

    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray ta = context.obtainStyledAttributes(attrs,R.styleable.CustomButton);
        try{
            setText(ta.getString(R.styleable.CustomButton_setText));
            setBackgroundColor(ta.getColor(R.styleable.CustomButton_setBackgroundColor,Color.CYAN));
            setTextColor(ta.getColor(R.styleable.CustomButton_setTextColor,Color.WHITE));
            setBackgroundDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.btn_bg,null));
        } finally{
            ta.recycle();
        }
    }
}
