package com.daimajia.androidanimations.library.zooming_exits;

import android.view.View;

import com.daimajia.androidanimations.library.BaseViewAnimator;
import com.nineoldandroids.animation.ObjectAnimator;

/**
 * Created by daimajia on 14-6-22.
 */
public class ZoomOutAnimator extends BaseViewAnimator{
    @Override
    protected void prepare(View target) {
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target,"alpha",1,0,0),
                ObjectAnimator.ofFloat(target,"scaleX",1,0.3f,0),
                ObjectAnimator.ofFloat(target,"scaleY",1,0.3f,0)
        );
    }
}
