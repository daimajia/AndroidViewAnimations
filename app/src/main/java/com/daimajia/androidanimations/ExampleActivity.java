package com.daimajia.androidanimations;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.daimajia.androidanimations.library.YoYo;

public class ExampleActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example);
        final TextView t = (TextView)findViewById(R.id.notice);
        t.setText("Please input your Email and Password");
        findViewById(R.id.submit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.play(YoYo.Techniques.Tada,findViewById(R.id.edit_area),700);
                t.setText("Wrong password!");
            }
        });

        final TextView t2 = (TextView)findViewById(R.id.notice2);
        t2.setText("Please input your Email and Password");
        findViewById(R.id.submit2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.play(YoYo.Techniques.Shake,findViewById(R.id.edit_area2));
                t2.setText("Wrong password!");
            }
        });
    }
}
