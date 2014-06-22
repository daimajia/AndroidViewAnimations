package com.daimajia.androidanimations.library.zooming_entrances;

import android.view.View;

import com.daimajia.androidanimations.library.BaseViewAnimator;
import com.nineoldandroids.animation.ObjectAnimator;

/**
 * Created by daimajia on 14-6-21.
 */
public class ZoomInAnimator extends BaseViewAnimator {
    @Override
    protected void prepare(View target) {
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target,"scaleX",0.3f,1),
                ObjectAnimator.ofFloat(target,"scaleY",0.3f,1),
                ObjectAnimator.ofFloat(target,"alpha",0,1)
        );
    }
}
