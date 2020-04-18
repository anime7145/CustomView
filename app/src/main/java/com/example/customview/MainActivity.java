package com.example.customview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button sendBtn;
    RadioGroup rg;
    RadioButton rb;

    CustomCheckBox c,cpp,java,python;

    String platform;

    ArrayList<String> languageArray;

    TextView os,lang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        languageArray = new ArrayList<>();

        os = findViewById(R.id.os);
        lang = findViewById(R.id.lang);

        c = findViewById(R.id.checkbox_c);
        cpp = findViewById(R.id.checkbox_cpp);
        java = findViewById(R.id.checkbox_java);
        python = findViewById(R.id.checkbox_python);

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c.isChecked())
                    languageArray.add("C");
                else
                    languageArray.remove("C");
            }
        });
        cpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cpp.isChecked())
                    languageArray.add("C++");
                else
                    languageArray.remove("C++");
            }
        });
        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(java.isChecked())
                    languageArray.add("Java");
                else
                    languageArray.remove("Java");
            }
        });
        python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(python.isChecked())
                    languageArray.add("Python");
                else
                    languageArray.remove("Python");
            }
        });

        rg = findViewById(R.id.rg);

        sendBtn = findViewById(R.id.send_btn);
        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder languages = new StringBuilder();

                int radioId = rg.getCheckedRadioButtonId();
                rb = findViewById(radioId);
                platform = rb.getText().toString();
                os.setText("Operating System: "+platform);

                for(String l : languageArray)
                    languages.append(l).append(" ");
                lang.setText("Languages: "+languages.toString());
            }
        });
    }
}
