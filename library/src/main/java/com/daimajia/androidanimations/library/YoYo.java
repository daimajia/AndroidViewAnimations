package com.daimajia.androidanimations.library;

import android.view.View;
import android.view.animation.Interpolator;

import com.daimajia.androidanimations.library.attention.BounceAnimator;
import com.daimajia.androidanimations.library.attention.FlashAnimator;
import com.daimajia.androidanimations.library.attention.PulseAnimator;
import com.daimajia.androidanimations.library.attention.RubberBandAnimator;
import com.daimajia.androidanimations.library.attention.ShakeAnimator;
import com.daimajia.androidanimations.library.attention.SwingAnimator;
import com.daimajia.androidanimations.library.attention.TadaAnimator;
import com.daimajia.androidanimations.library.attention.WobbleAnimator;
import com.daimajia.androidanimations.library.bouncing_entrances.BounceInAnimator;
import com.daimajia.androidanimations.library.bouncing_entrances.BounceInDownAnimator;
import com.daimajia.androidanimations.library.bouncing_entrances.BounceInLeftAnimator;
import com.daimajia.androidanimations.library.bouncing_entrances.BounceInRightAnimator;
import com.daimajia.androidanimations.library.bouncing_entrances.BounceInUpAnimator;
import com.daimajia.androidanimations.library.fading_entrances.FadeInAnimator;
import com.daimajia.androidanimations.library.fading_entrances.FadeInDownAnimator;
import com.daimajia.androidanimations.library.fading_entrances.FadeInLeftAnimator;
import com.daimajia.androidanimations.library.fading_entrances.FadeInRightAnimator;
import com.daimajia.androidanimations.library.fading_exits.FadeOutAnimator;
import com.daimajia.androidanimations.library.fading_exits.FadeOutDownAnimator;
import com.daimajia.androidanimations.library.fading_exits.FadeOutLeftAnimator;
import com.daimajia.androidanimations.library.fading_exits.FadeOutRightAnimator;
import com.daimajia.androidanimations.library.fading_exits.FadeOutUpAnimator;
import com.daimajia.androidanimations.library.flippers.FlipInXAnimator;
import com.daimajia.androidanimations.library.flippers.FlipOutXAnimator;
import com.daimajia.androidanimations.library.flippers.FlipOutYAnimator;
import com.daimajia.androidanimations.library.rotating_entrances.RotateInAnimator;
import com.daimajia.androidanimations.library.rotating_entrances.RotateInDownLeftAnimator;
import com.daimajia.androidanimations.library.rotating_entrances.RotateInDownRightAnimator;
import com.daimajia.androidanimations.library.rotating_entrances.RotateInUpLeftAnimator;
import com.daimajia.androidanimations.library.rotating_entrances.RotateInUpRightAnimator;
import com.daimajia.androidanimations.library.rotating_exits.RotateOutAnimator;
import com.daimajia.androidanimations.library.rotating_exits.RotateOutDownLeftAnimator;
import com.daimajia.androidanimations.library.rotating_exits.RotateOutDownRightAnimator;
import com.daimajia.androidanimations.library.rotating_exits.RotateOutUpLeftAnimator;
import com.daimajia.androidanimations.library.rotating_exits.RotateOutUpRightAnimator;
import com.daimajia.androidanimations.library.sliders.SlideInDownAnimator;
import com.daimajia.androidanimations.library.sliders.SlideInLeftAnimator;
import com.daimajia.androidanimations.library.sliders.SlideInRightAnimator;
import com.daimajia.androidanimations.library.sliders.SlideInUpAnimator;
import com.daimajia.androidanimations.library.sliders.SlideOutDownAnimator;
import com.daimajia.androidanimations.library.sliders.SlideOutLeftAnimator;
import com.daimajia.androidanimations.library.sliders.SlideOutRightAnimator;
import com.daimajia.androidanimations.library.sliders.SlideOutUpAnimator;
import com.daimajia.androidanimations.library.specials.HingeAnimator;
import com.daimajia.androidanimations.library.specials.RollInAnimator;
import com.daimajia.androidanimations.library.specials.RollOutAnimator;
import com.daimajia.androidanimations.library.zooming_entrances.ZoomInAnimator;
import com.daimajia.androidanimations.library.zooming_entrances.ZoomInDownAnimator;
import com.daimajia.androidanimations.library.zooming_entrances.ZoomInLeftAnimator;
import com.daimajia.androidanimations.library.zooming_entrances.ZoomInRightAnimator;
import com.daimajia.androidanimations.library.zooming_entrances.ZoomInUpAnimator;
import com.daimajia.androidanimations.library.zooming_exits.ZoomOutAnimator;
import com.daimajia.androidanimations.library.zooming_exits.ZoomOutDownAnimator;
import com.daimajia.androidanimations.library.zooming_exits.ZoomOutLeftAnimator;
import com.daimajia.androidanimations.library.zooming_exits.ZoomOutRightAnimator;
import com.daimajia.androidanimations.library.zooming_exits.ZoomOutUpAnimator;
import com.nineoldandroids.animation.Animator;

public class YoYo {
    public static enum Techniques {
        Flash(FlashAnimator.class),
        Pulse(PulseAnimator.class),
        RubberBand(RubberBandAnimator.class),
        Shake(ShakeAnimator.class),
        Swing(SwingAnimator.class),
        Wobble(WobbleAnimator.class),
        Bounce(BounceAnimator.class),
        Tada(TadaAnimator.class),


        Hinge(HingeAnimator.class),
        RollIn(RollInAnimator.class),
        RollOut(RollOutAnimator.class),

        BounceIn(BounceInAnimator.class),
        BounceInDown(BounceInDownAnimator.class),
        BounceInLeft(BounceInLeftAnimator.class),
        BounceInRight(BounceInRightAnimator.class),
        BounceInUp(BounceInUpAnimator.class),

        FadeIn(FadeInAnimator.class),
        FadeInDown(FadeInDownAnimator.class),
        FadeInLeft(FadeInLeftAnimator.class),
        FadeInRight(FadeInRightAnimator.class),

        FadeOut(FadeOutAnimator.class),
        FadeOutDown(FadeOutDownAnimator.class),
        FadeOutLeft(FadeOutLeftAnimator.class),
        FadeOutRight(FadeOutRightAnimator.class),
        FadeOutUp(FadeOutUpAnimator.class),

        FlipInX(FlipInXAnimator.class),
        FlipOutX(FlipOutXAnimator.class),

        FlipOutY(FlipOutYAnimator.class),
        RotateIn(RotateInAnimator.class),
        RotateInDownLeft(RotateInDownLeftAnimator.class),
        RotateInDownRight(RotateInDownRightAnimator.class),
        RotateInUpLeft(RotateInUpLeftAnimator.class),
        RotateInUpRight(RotateInUpRightAnimator.class),

        RotateOut(RotateOutAnimator.class),
        RotateOutDownLeft(RotateOutDownLeftAnimator.class),
        RotateOutDownRight(RotateOutDownRightAnimator.class),
        RotateOutUpLeft(RotateOutUpLeftAnimator.class),
        RotateOutUpRight(RotateOutUpRightAnimator.class),

        SlideInLeft(SlideInLeftAnimator.class),
        SlideInRight(SlideInRightAnimator.class),
        SlideInUp(SlideInUpAnimator.class),
        SlideInDown(SlideInDownAnimator.class),

        SlideOutLeft(SlideOutLeftAnimator.class),
        SlideOutRight(SlideOutRightAnimator.class),
        SlideOutUp(SlideOutUpAnimator.class),
        SlideOutDown(SlideOutDownAnimator.class),

        ZoomIn(ZoomInAnimator.class),
        ZoomInDown(ZoomInDownAnimator.class),
        ZoomInLeft(ZoomInLeftAnimator.class),
        ZoomInRight(ZoomInRightAnimator.class),
        ZoomInUp(ZoomInUpAnimator.class),

        ZoomOut(ZoomOutAnimator.class),
        ZoomOutDown(ZoomOutDownAnimator.class),
        ZoomOutLeft(ZoomOutLeftAnimator.class),
        ZoomOutRight(ZoomOutRightAnimator.class),
        ZoomOutUp(ZoomOutUpAnimator.class);

        private BaseViewAnimator animator;
        private Techniques(Class cls){
            try{
                animator = (BaseViewAnimator)cls.newInstance();
            }catch (Exception e){
                throw new Error("Error init new animation instance");
            }
        }
        public BaseViewAnimator getAnimator(){
            return animator;
        }
    };
    public static void play(Techniques name, View target){
        name.getAnimator().animate(target);
    }
    public static void play(Techniques name, View target,long duration){
        name.getAnimator().setDuration(duration).animate(target);
    }

    public static void play(Techniques name, View target, Interpolator interpolator){
        name.getAnimator().setInterpolator(interpolator).animate(target);
    }

    public static void play(Techniques name, View target, Animator.AnimatorListener... listeners){
        BaseViewAnimator animator = name.getAnimator();
        for(Animator.AnimatorListener l : listeners){
            animator.addAnimatorListener(l);
        }
        animator.animate(target);
    }

    public static void play(Techniques name, View target,long delay,long duration){
        name.getAnimator().setDuration(duration).setStartDeley(delay).animate(target);
    }

    public static void play(Techniques name, View target,long delay,long duration,Interpolator interpolator){
        name.getAnimator().setDuration(duration).setStartDeley(delay).setInterpolator(interpolator).animate(target);
    }

    public static void play(Techniques name, View target, long delay, long duration, Interpolator interpolator, Animator.AnimatorListener ... listeners){
        BaseViewAnimator animator = name.getAnimator();
        for(Animator.AnimatorListener l : listeners){
            animator.addAnimatorListener(l);
        }
        animator.setDuration(duration);
        animator.setInterpolator(interpolator);
        animator.setStartDeley(delay);
        animator.animate(target);
    }
}
