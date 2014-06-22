package com.daimajia.androidanimations.library.specials;

import android.view.View;

import com.daimajia.androidanimations.library.BaseViewAnimator;
import com.nineoldandroids.animation.ObjectAnimator;

/**
 * Created by daimajia on 14-6-22.
 */
public class RollOutAnimator extends BaseViewAnimator {
    @Override
    protected void prepare(View target) {
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target,"alpha",1,0),
                ObjectAnimator.ofFloat(target,"translationX",0, target.getWidth()),
                ObjectAnimator.ofFloat(target,"rotation",0,120)
        );
    }
}
