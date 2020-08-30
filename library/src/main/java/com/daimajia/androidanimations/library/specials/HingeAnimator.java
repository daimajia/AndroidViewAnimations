/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 daimajia
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.daimajia.androidanimations.library.specials;

import android.animation.ObjectAnimator;
import android.view.View;

import com.daimajia.androidanimations.library.BaseViewAnimator;
import com.daimajia.easing.Glider;
import com.daimajia.easing.Skill;

public class HingeAnimator extends BaseViewAnimator {
    @Override
    public void prepare(View target) {
        float x = target.getPaddingLeft();
        float y = target.getPaddingTop();
        getAnimatorAgent().playTogether(
                Glider.glide(Skill.SineEaseInOut, 1300, ObjectAnimator.ofFloat(target, "rotation", 0, 80, 60, 80, 60, 60)),
                ObjectAnimator.ofFloat(target, "translationY", 0, 0, 0, 0, 0, 700),
                ObjectAnimator.ofFloat(target, "alpha", 1, 1, 1, 1, 1, 0),
                ObjectAnimator.ofFloat(target, "pivotX", x, x, x, x, x, x),
                ObjectAnimator.ofFloat(target, "pivotY", y, y, y, y, y, y)
        );

        setDuration(1300);
    }
}

