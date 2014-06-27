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

package com.daimajia.androidanimations.library.easing_functions;

import com.daimajia.androidanimations.library.easing_functions.back.BackEaseIn;
import com.daimajia.androidanimations.library.easing_functions.back.BackEaseInOut;
import com.daimajia.androidanimations.library.easing_functions.back.BackEaseOut;
import com.daimajia.androidanimations.library.easing_functions.bounce.BounceEaseIn;
import com.daimajia.androidanimations.library.easing_functions.bounce.BounceEaseInOut;
import com.daimajia.androidanimations.library.easing_functions.bounce.BounceEaseOut;
import com.daimajia.androidanimations.library.easing_functions.circ.CircEaseIn;
import com.daimajia.androidanimations.library.easing_functions.circ.CircEaseInOut;
import com.daimajia.androidanimations.library.easing_functions.circ.CircEaseOut;
import com.daimajia.androidanimations.library.easing_functions.cubic.CubicEaseIn;
import com.daimajia.androidanimations.library.easing_functions.cubic.CubicEaseInOut;
import com.daimajia.androidanimations.library.easing_functions.cubic.CubicEaseOut;
import com.daimajia.androidanimations.library.easing_functions.elastic.ElasticEaseIn;
import com.daimajia.androidanimations.library.easing_functions.elastic.ElasticEaseOut;
import com.daimajia.androidanimations.library.easing_functions.expo.ExpoEaseIn;
import com.daimajia.androidanimations.library.easing_functions.expo.ExpoEaseInOut;
import com.daimajia.androidanimations.library.easing_functions.expo.ExpoEaseOut;
import com.daimajia.androidanimations.library.easing_functions.quad.QuadEaseIn;
import com.daimajia.androidanimations.library.easing_functions.quad.QuadEaseInOut;
import com.daimajia.androidanimations.library.easing_functions.quad.QuadEaseOut;
import com.daimajia.androidanimations.library.easing_functions.quint.QuintEaseIn;
import com.daimajia.androidanimations.library.easing_functions.quint.QuintEaseInOut;
import com.daimajia.androidanimations.library.easing_functions.quint.QuintEaseOut;
import com.daimajia.androidanimations.library.easing_functions.sine.SineEaseIn;
import com.daimajia.androidanimations.library.easing_functions.sine.SineEaseInOut;
import com.daimajia.androidanimations.library.easing_functions.sine.SineEaseOut;

public enum  Skill {

    BackEaseIn(BackEaseIn.class),
    BackEaseOut(BackEaseOut.class),
    BackEaseInOut(BackEaseInOut.class),

    BounceEaseIn(BounceEaseIn.class),
    BounceEaseOut(BounceEaseOut.class),
    BounceEaseInOut(BounceEaseInOut.class),

    CircEaseIn(CircEaseIn.class),
    CircEaseOut(CircEaseOut.class),
    CircEaseInOut(CircEaseInOut.class),

    CubicEaseIn(CubicEaseIn.class),
    CubicEaseOut(CubicEaseOut.class),
    CubicEaseInOut(CubicEaseInOut.class),

    ElasticEaseIn(ElasticEaseIn.class),
    ElasticEaseOut(ElasticEaseOut.class),

    ExpoEaseIn(ExpoEaseIn.class),
    ExpoEaseOut(ExpoEaseOut.class),
    ExpoEaseInOut(ExpoEaseInOut.class),

    QuadEaseIn(QuadEaseIn.class),
    QuadEaseOut(QuadEaseOut.class),
    QuadEaseInOut(QuadEaseInOut.class),

    QuintEaseIn(QuintEaseIn.class),
    QuintEaseOut(QuintEaseOut.class),
    QuintEaseInOut(QuintEaseInOut.class),

    SineEaseIn(SineEaseIn.class),
    SineEaseOut(SineEaseOut.class),
    SineEaseInOut(SineEaseInOut.class);


    private Class easingMethod;

    private Skill(Class clazz) {
        easingMethod = clazz;
    }

    public BaseEasingMethod getMethod(float duration) {
        try {
            return (BaseEasingMethod)easingMethod.getConstructor(float.class).newInstance(duration);
        } catch (Exception e) {
            e.printStackTrace();
            throw new Error("Can not init easingMethod instance");
        }
    }
}
