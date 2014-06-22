package com.daimajia.androidanimations.library.bouncing_entrances;

import android.view.View;

import com.daimajia.androidanimations.library.BaseViewAnimator;
import com.nineoldandroids.animation.ObjectAnimator;

/**
 * Created by daimajia on 14-6-21.
 */
public class BounceInRightAnimator extends BaseViewAnimator{
    @Override
    public void prepare(View target) {
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target,"translationX",target.getMeasuredWidth()+target.getWidth(),-30,10,0),
                ObjectAnimator.ofFloat(target,"alpha",0,1,1,1)
        );
    }
}
