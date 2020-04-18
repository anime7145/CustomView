package com.example.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.content.res.ResourcesCompat;

public class CustomRadioButton extends AppCompatRadioButton {
    public CustomRadioButton(Context context) {
        super(context);
    }

    public CustomRadioButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray ta = context.obtainStyledAttributes(attrs,R.styleable.CustomRadioButton);
        try{
            setText(ta.getString(R.styleable.CustomRadioButton_setRadioText));
            setTextSize(18);

            setTextColor(ta.getColor(R.styleable.CustomRadioButton_setRadioTextColor,Color.BLACK));

            setButtonDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.radio_check,null));
        } finally{
            ta.recycle();
        }
    }

    public CustomRadioButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

}
