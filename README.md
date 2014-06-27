# Android View Animations [![Build Status](https://travis-ci.org/daimajia/AndroidViewAnimations.svg)](https://travis-ci.org/daimajia/AndroidAnimations)

One day, I saw [an iOS library](https://github.com/ArtFeel/AFViewShaker), which is a view shaker, it's very beautiful. I think Android also need one, and should be better.

So, I started to collect animation effects... and in two days, this project born.


2014-06-27

I have implemented [Animation Easing](http://easings.net/) [functions](https://github.com/daimajia/AndroidViewAnimations/tree/master/library/src/main/java/com/daimajia/androidanimations/library/easing_functions), based on [Rober Penner's Easing functions](http://www.robertpenner.com/easing/).
You can use easing functions to make your animation more real! It's pretty complex, but don't worrr, I'll add some examples later. :-D
# Demo

![](http://ww3.sinaimg.cn/mw690/610dc034jw1ehnv2r93jpg20bx0kokjl.gif)

[Download Demo](https://github.com/daimajia/AndroidViewAnimations/releases/download/v1.0.5/demo-v1.0.5.apk)
# Usage

## Step 1

```groovy
dependencies {
    compile 'com.nineoldandroids:library:2.4.0'
    compile 'com.daimajia.androidanimations:library:1.0.5@aar'
}
```
or Maven

```xml
<dependency>
    <groupId>com.nineoldandroids</groupId>
    <artifactId>library</artifactId>
    <version>2.4.0</version>
</dependency>
<dependency>
    <groupId>com.daimajia.androidanimation</groupId>
    <artifactId>library</artifactId>
    <version>1.0.5</version>
    <type>apklib</type>
</dependency>
```

## Step 2

Just like play Yo-yo.

```java
YoYo.with(Techniques.Tada)
    .duration(700)
    .playOn(findViewById(R.id.edit_area));
```

### Effects
#### Attension
`Flash`, `Pulse`, `RubberBand`, `Shake`, `Swing`, `Wobble`, `Bounce`, `Tada`, `StandUp`, `Wave`

#### Special
`Hinge`, `RollIn`, `RollOut`

#### Bounce
`BounceIn`, `BounceInDown`, `BounceInLeft`, `BounceInRight`, `BounceInUp`

#### Fade
`FadeIn`, `FadeInUp`, `FadeInDown`, `FadeInLeft`, `FadeInRight`

`FadeOut`, `FadeOutDown`, `FadeOutLeft`, `FadeOutRight`, `FadeOutUp`

#### Flip
`FlipInX`, `FlipOutX`, `FlipOutY`

#### Rotate
`RotateIn`, `RotateInDownLeft`, `RotateInDownRight`, `RotateInUpLeft`, `RotateInUpRight`

`RotateOut`, `RotateOutDownLeft`, `RotateOutDownRight`, `RotateOutUpLeft`, `RotateOutUpRight`

#### Slide
`SlideInLeft`, `SlideInRight`, `SlideInUp`, `SlideInDown`

`SlideOutLeft`, `SlideOutRight`, `SlideOutUp`, `SlideOutDown`

#### Zoom
`ZoomIn`, `ZoomInDown`, `ZoomInLeft`, `ZoomInRight`, `ZoomInUp`

`ZoomOut`, `ZoomOutDown`, `ZoomOutLeft`, `ZoomOutRight`, `ZoomOutUp`

Welcome contribute your amazing animation effect. :-D

#Thanks

- [AFViewShaker](https://github.com/ArtFeel/AFViewShaker)
- [Animate.css](https://github.com/daneden/animate.css)

#About me

A student in mainland China. 

Welcome to [offer me an internship](mailto:daimajia@gmail.com).
If you have any new idea about this project, feel free to [contact me](mailto:daimajia@gmail.com).
