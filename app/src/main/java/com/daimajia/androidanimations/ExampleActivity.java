package com.daimajia.androidanimations;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.daimajia.androidanimations.library.attention.TadaAnimator;

/**
 * Created by daimajia on 14-6-22.
 */
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
                new TadaAnimator().setDuration(700).anime(findViewById(R.id.edit_area));
                t.setText("Wrong password!");
            }
        });
    }
}
