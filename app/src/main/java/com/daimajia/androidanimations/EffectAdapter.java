package com.daimajia.androidanimations;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

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
import com.daimajia.androidanimations.library.flippers.FlipAnimator;
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

/**
 * Created by daimajia on 14-6-21.
 */
public class EffectAdapter extends BaseAdapter {

    private Context mContext;


    public EffectAdapter(Context context){
        mContext = context;
    }

    private Class[] effects = new Class[]{
            FlashAnimator.class,
            PulseAnimator.class,
            RubberBandAnimator.class,
            ShakeAnimator.class,
            SwingAnimator.class,
            WobbleAnimator.class,
            BounceAnimator.class,
            TadaAnimator.class,


            HingeAnimator.class,
            RollInAnimator.class,
            RollOutAnimator.class,

            BounceInAnimator.class,
            BounceInDownAnimator.class,
            BounceInLeftAnimator.class,
            BounceInRightAnimator.class,
            BounceInUpAnimator.class,

            FadeInAnimator.class,
            FadeInDownAnimator.class,
            FadeInLeftAnimator.class,
            FadeInRightAnimator.class,

            FadeOutAnimator.class,
            FadeOutDownAnimator.class,
            FadeOutLeftAnimator.class,
            FadeOutRightAnimator.class,
            FadeOutUpAnimator.class,

            FlipAnimator.class,
            FlipInXAnimator.class,
            FlipOutXAnimator.class,

            FlipOutYAnimator.class,
            RotateInAnimator.class,
            RotateInDownLeftAnimator.class,
            RotateInDownRightAnimator.class,
            RotateInUpLeftAnimator.class,
            RotateInUpRightAnimator.class,

            RotateOutAnimator.class,
            RotateOutDownLeftAnimator.class,
            RotateOutDownRightAnimator.class,
            RotateOutUpLeftAnimator.class,
            RotateOutUpRightAnimator.class,

            SlideInLeftAnimator.class,
            SlideInRightAnimator.class,
            SlideInUpAnimator.class,
            SlideInDownAnimator.class,

            SlideOutLeftAnimator.class,
            SlideOutRightAnimator.class,
            SlideOutUpAnimator.class,
            SlideOutDownAnimator.class,

            ZoomInAnimator.class,
            ZoomInDownAnimator.class,
            ZoomInLeftAnimator.class,
            ZoomInRightAnimator.class,
            ZoomInUpAnimator.class,

            ZoomOutAnimator.class,
            ZoomOutDownAnimator.class,
            ZoomOutLeftAnimator.class,
            ZoomOutRightAnimator.class,
            ZoomOutUpAnimator.class
    };

    @Override
    public int getCount() {
        return effects.length;
    }

    @Override
    public Object getItem(int position) {
        try {
            return effects[position].newInstance();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.item,null,false);
        TextView t = (TextView)v.findViewById(R.id.list_item_text);
        int start = effects[position].getName().lastIndexOf(".") + 1;
        String name = effects[position].getName().substring(start);
        t.setText(name);
        v.setTag(getItem(position));
        return v;
    }
}
