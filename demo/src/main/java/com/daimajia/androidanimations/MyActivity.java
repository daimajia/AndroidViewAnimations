package com.daimajia.androidanimations;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.nineoldandroids.animation.Animator;

public class MyActivity extends Activity {

    private ListView mListView;
    private EffectAdapter mAdapter;
    private View mTarget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        mListView = (ListView)findViewById(R.id.list_items);
        mTarget = findViewById(R.id.hello_world);
        mAdapter = new EffectAdapter(this);
        mListView.setAdapter(mAdapter);
        rope = YoYo.with(Techniques.FadeIn).duration(1000).playOn(mTarget);// after start,just click mTarget view, rope is not init 
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Techniques technique = (Techniques)view.getTag();
                rope =  YoYo.with(technique)
                            .duration(1200)
                            .interpolate(new AccelerateDecelerateInterpolator())
                            .withListener(new Animator.AnimatorListener() {
                                @Override
                                public void onAnimationStart(Animator animation) {

                                }

                                @Override
                                public void onAnimationEnd(Animator animation) {

                                }

                                @Override
                                public void onAnimationCancel(Animator animation) {
                                    Toast.makeText(MyActivity.this, "canceled", Toast.LENGTH_SHORT).show();
                                }

                                @Override
                                public void onAnimationRepeat(Animator animation) {

                                }
                            })
                            .playOn(mTarget);
            }
        });
        findViewById(R.id.hello_world).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rope != null) {
                    rope.stop(true);   
                }
            }
        });
    }
    private YoYo.YoYoString rope;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            startActivity(new Intent(this,ExampleActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
