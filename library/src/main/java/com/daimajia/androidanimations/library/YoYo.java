
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

package com.daimajia.androidanimations.library;

import android.view.View;
import android.view.animation.Interpolator;

import com.nineoldandroids.animation.Animator;

import java.util.ArrayList;
import java.util.List;

public class YoYo {

    private static final long DURATION = BaseViewAnimator.DURATION;
    private static final long NO_DELAY = 0;

    private Techniques techniques;
    private long duration;
    private long delay;
    private Interpolator interpolator;
    private List<Animator.AnimatorListener> callbacks;
    private View target;

    private YoYo(AnimationComposer animationComposer) {
        techniques = animationComposer.techniques;
        duration = animationComposer.duration;
        delay = animationComposer.delay;
        interpolator = animationComposer.interpolator;
        callbacks = animationComposer.callbacks;
        target = animationComposer.target;
    }

    public static AnimationComposer with(Techniques techniques) {
        return new AnimationComposer(techniques);
    }

    public static final class AnimationComposer {

        private List<Animator.AnimatorListener> callbacks = new ArrayList<Animator.AnimatorListener>();

        private Techniques techniques;
        private long duration = DURATION;
        private long delay = NO_DELAY;
        private Interpolator interpolator;
        private View target;

        private AnimationComposer(Techniques techniques) {
            this.techniques = techniques;
        }

        public AnimationComposer duration(long duration) {
            this.duration = duration;
            return this;
        }

        public AnimationComposer delay(long delay) {
            this.delay = delay;
            return this;
        }

        public AnimationComposer interpolate(Interpolator interpolator) {
            this.interpolator = interpolator;
            return this;
        }


        public AnimationComposer withListener(Animator.AnimatorListener listener) {
            callbacks.add(listener);
            return this;
        }

        public void playOn(View target) {
            this.target = target;
            new YoYo(this).play();
        }

    }

    private void play() {
        final BaseViewAnimator animator = techniques.getAnimator();

        animator.setDuration(duration)
                .setInterpolator(interpolator)
                .setStartDelay(delay);

        if (callbacks.size() > 0) {
            for (Animator.AnimatorListener callback : callbacks) {
                animator.addAnimatorListener(callback);
            }
        }

        animator.animate(target);
    }

}
