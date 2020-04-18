package com.example.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.content.res.ResourcesCompat;

public class CustomCheckBox extends AppCompatCheckBox {
    public CustomCheckBox(Context context) {
        super(context);
    }

    public CustomCheckBox(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray ta = context.obtainStyledAttributes(attrs,R.styleable.CustomCheckBox);
        try{
            setText(ta.getString(R.styleable.CustomCheckBox_setCheckboxText));
            setTextSize(18);
            setTextColor(ta.getColor(R.styleable.CustomCheckBox_setCheckboxTextColor, Color.BLACK));

            setButtonDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.checkbox_check,null));
        } finally{
            ta.recycle();
        }
    }

    public CustomCheckBox(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


}
