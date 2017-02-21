
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

import android.animation.Animator;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.animation.Interpolator;


import java.util.ArrayList;
import java.util.List;

public class YoYo {

    private static final long DURATION = BaseViewAnimator.DURATION;
    private static final long NO_DELAY = 0;
    public static final int INFINITE = -1;
    public static final float CENTER_PIVOT = Float.MAX_VALUE;

    private BaseViewAnimator animator;
    private long duration;
    private long delay;
    private boolean repeat;
    private long repeatTimes;
    private Interpolator interpolator;
    private float pivotX, pivotY;
    private List<Animator.AnimatorListener> callbacks;
    private View target;

    private YoYo(AnimationComposer animationComposer) {
        animator = animationComposer.animator;
        duration = animationComposer.duration;
        delay = animationComposer.delay;
        repeat = animationComposer.repeat;
        repeatTimes = animationComposer.repeatTimes;
        interpolator = animationComposer.interpolator;
        pivotX = animationComposer.pivotX;
        pivotY = animationComposer.pivotY;
        callbacks = animationComposer.callbacks;
        target = animationComposer.target;
    }

    public static AnimationComposer with(Techniques techniques) {
        return new AnimationComposer(techniques);
    }

    public static AnimationComposer with(BaseViewAnimator animator) {
        return new AnimationComposer(animator);
    }

    public interface AnimatorCallback {
        public void call(Animator animator);
    }

    private static class EmptyAnimatorListener implements Animator.AnimatorListener {
        @Override
        public void onAnimationStart(Animator animation) {
        }

        @Override
        public void onAnimationEnd(Animator animation) {
        }

        @Override
        public void onAnimationCancel(Animator animation) {
        }

        @Override
        public void onAnimationRepeat(Animator animation) {
        }
    }

    public static final class AnimationComposer {


        private List<Animator.AnimatorListener> callbacks = new ArrayList<>();

        private BaseViewAnimator animator;
        private long duration = DURATION;

        private long delay = NO_DELAY;
        private boolean repeat = false;
        private long repeatTimes = 0;
        private float pivotX = YoYo.CENTER_PIVOT, pivotY = YoYo.CENTER_PIVOT;
        private Interpolator interpolator;
        private View target;

        private AnimationComposer(Techniques techniques) {
            this.animator = techniques.getAnimator();
        }

        private AnimationComposer(BaseViewAnimator animator) {
            this.animator = animator;
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

        public AnimationComposer pivot(float pivotX, float pivotY) {
            this.pivotX = pivotX;
            this.pivotY = pivotY;
            return this;
        }

        public AnimationComposer pivotX(float pivotX) {
            this.pivotX = pivotX;
            return this;
        }

        public AnimationComposer pivotY(float pivotY) {
            this.pivotY = pivotY;
            return this;
        }


        public AnimationComposer repeat(int times) {
            if (times < INFINITE) {
                throw new RuntimeException("Can not be less than -1, -1 is infinite loop");
            }
            repeat = times != 0;
            repeatTimes = times;
            return this;
        }


        public AnimationComposer withListener(Animator.AnimatorListener listener) {
            callbacks.add(listener);
            return this;
        }

        public AnimationComposer onStart(final AnimatorCallback callback) {
            callbacks.add(new EmptyAnimatorListener() {
                @Override
                public void onAnimationStart(Animator animation) {
                    callback.call(animation);
                }
            });
            return this;
        }

        public AnimationComposer onEnd(final AnimatorCallback callback) {
            callbacks.add(new EmptyAnimatorListener() {
                @Override
                public void onAnimationEnd(Animator animation) {
                    callback.call(animation);
                }
            });
            return this;
        }

        public AnimationComposer onCancel(final AnimatorCallback callback) {
            callbacks.add(new EmptyAnimatorListener() {
                @Override
                public void onAnimationCancel(Animator animation) {
                    callback.call(animation);
                }
            });
            return this;
        }

        public AnimationComposer onRepeat(final AnimatorCallback callback) {
            callbacks.add(new EmptyAnimatorListener() {
                @Override
                public void onAnimationRepeat(Animator animation) {
                    callback.call(animation);
                }
            });
            return this;
        }

        public YoYoString playOn(View target) {
            this.target = target;
            return new YoYoString(new YoYo(this).play(), this.target);
        }

    }

    /**
     * YoYo string, you can use this string to control your YoYo.
     */
    public static final class YoYoString {

        private BaseViewAnimator animator;
        private View target;

        private YoYoString(BaseViewAnimator animator, View target) {
            this.target = target;
            this.animator = animator;
        }

        public boolean isStarted() {
            return animator.isStarted();
        }

        public boolean isRunning() {
            return animator.isRunning();
        }

        public void stop() {
            stop(true);
        }

        public void stop(boolean reset) {
            animator.cancel();

            if (reset)
                animator.reset(target);
        }

    }


    private BaseViewAnimator play() {
        animator.setTarget(target);

        if (pivotX == YoYo.CENTER_PIVOT) {
            ViewCompat.setPivotX(target, target.getMeasuredWidth() / 2.0f);
        } else {
            target.setPivotX(pivotX);
        }
        if (pivotY == YoYo.CENTER_PIVOT) {
            ViewCompat.setPivotY(target, target.getMeasuredHeight() / 2.0f);
        } else {
            target.setPivotY(pivotY);
        }

        animator.setDuration(duration)
                .setInterpolator(interpolator)
                .setStartDelay(delay);

        if (callbacks.size() > 0) {
            for (Animator.AnimatorListener callback : callbacks) {
                animator.addAnimatorListener(callback);
            }
        }

        if (repeat) {
            animator.addAnimatorListener(new Animator.AnimatorListener() {

                private long currentTimes = 0;

                @Override
                public void onAnimationStart(Animator animation) {
                    currentTimes++;
                }

                @Override
                public void onAnimationEnd(Animator animation) {
                    if (!repeat) {
                        return;
                    }
                    if (repeatTimes == INFINITE || currentTimes < repeatTimes) {
                        animator.restart();
                    }
                }

                @Override
                public void onAnimationCancel(Animator animation) {
                    repeatTimes = 0;
                    repeat = false;
                }

                @Override
                public void onAnimationRepeat(Animator animation) {
                }
            });
        }

        animator.animate();
        return animator;
    }

}
