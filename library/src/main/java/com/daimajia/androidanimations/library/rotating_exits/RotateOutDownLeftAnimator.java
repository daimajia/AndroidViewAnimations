package com.daimajia.androidanimations.library.rotating_exits;

import android.view.View;

import com.daimajia.androidanimations.library.BaseViewAnimator;
import com.nineoldandroids.animation.ObjectAnimator;

/**
 * Created by daimajia on 14-6-22.
 */
public class RotateOutDownLeftAnimator extends BaseViewAnimator {
    @Override
    protected void prepare(View target) {
        float x = target.getPaddingLeft();
        float y = target.getHeight() - target.getPaddingBottom();
        getAnimatorAgent().playTogether(
                ObjectAnimator.ofFloat(target, "alpha", 1, 0),
                ObjectAnimator.ofFloat(target,"rotation",0,90),
                ObjectAnimator.ofFloat(target,"pivotX",x,x),
                ObjectAnimator.ofFloat(target,"pivotY",y,y)
        );
    }
}
