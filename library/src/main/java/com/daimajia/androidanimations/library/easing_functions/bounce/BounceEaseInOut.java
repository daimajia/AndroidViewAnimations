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

package com.daimajia.androidanimations.library.easing_functions.bounce;

import com.daimajia.androidanimations.library.easing_functions.BaseEasingMethod;

public class BounceEaseInOut extends BaseEasingMethod{

    private BounceEaseOut mBounceEaseOut;
    private BounceEaseIn mBounceEaseIn;

    public BounceEaseInOut(float duration){
        super(duration);
        mBounceEaseIn = new BounceEaseIn(duration);
        mBounceEaseOut = new BounceEaseOut(duration);
    }

    @Override
    public float getInterpolation(float input) {
        return input;
    }

    @Override
    public Float evaluate(float fraction, Number startValue, Number endValue) {
        float d = mDuration;
        float t = mDuration * fraction;
        float b = startValue.floatValue();
        float c = endValue.floatValue() - startValue.floatValue();

        if(2*fraction < 1){
            return mBounceEaseIn.evaluate(t * 2 / d, 0, c) * .5f + b;
        }else{
            return mBounceEaseOut.evaluate((t*2-d)/d, 0, c) * .5f + c*.5f + b;
        }
    }
}
