package com.daimajia.androidanimations.library.specials;

import android.util.Log;
import android.view.View;
import android.view.animation.Interpolator;

import com.daimajia.androidanimations.library.BaseViewAnimator;
import com.nineoldandroids.animation.ObjectAnimator;

/**
 * Created by daimajia on 14-6-21.
 */
public class HingeAnimator extends BaseViewAnimator{
    @Override
    protected void prepare(View target) {
        float x = target.getPaddingLeft();
        float y = target.getPaddingTop();
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target,"rotation",0,80,60,80,60,60),
                ObjectAnimator.ofFloat(target,"translationY",0,0,0,0,0,700),
                ObjectAnimator.ofFloat(target,"alpha",1,1,1,1,1,0),
                ObjectAnimator.ofFloat(target,"pivotX",x,x,x,x,x,x),
                ObjectAnimator.ofFloat(target,"pivotY",y,y,y,y,y,y)
        );
        setDuration(1300);
//        setInterpolator(new HesitateInterpolator(1300,690000,0));
    }
    public class HesitateInterpolator implements Interpolator {
        private float mDuration;
        private float mChange;
        private float mBegin;
        public HesitateInterpolator(float d,float c, float b) {
            mBegin = b;
            mDuration = d;
            mChange = c;
        }
        public float getInterpolation(float t) {
            float v = (float)(-mChange/2 * (Math.cos(Math.PI*t/mDuration) - 1) + mBegin);
            Log.e("Value",v+ "");
            return v;
        }
    }
}

