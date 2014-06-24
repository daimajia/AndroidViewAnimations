# Android View Animations [![Build Status](https://travis-ci.org/daimajia/AndroidViewAnimations.svg)](https://travis-ci.org/daimajia/AndroidAnimations)

One day, I saw [an iOS library](https://github.com/ArtFeel/AFViewShaker), which is a view shaker, it's very beautiful. I think Android also need one, and should be better.

So, I started to collect animation effects... and in two days, this project born.

# Demo

![](http://ww3.sinaimg.cn/mw690/610dc034jw1ehnv2r93jpg20bx0kokjl.gif)

[Download Demo](https://github.com/daimajia/AndroidViewAnimations/releases/download/v1.0.0/Demo-v1.0.0.apk)
# Usage

## Step 1

```groovy
dependencies {
    compile 'com.nineoldandroids:library:2.4.0'
    compile 'com.daimajia.androidanimations:library:1.0.1@aar'
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
    <version>1.0.1</version>
    <type>apklib</type>
</dependency>
```

## Step2

Just like play Yo-yo.

```java
YoYo.play(YoYo.Techniques.Shake,findViewById(R.id.eidtor));
```

### Effects
#### attension
`Flash`, `Pulse`, `RubberBand`, `Shake`, `Swing`, `Wobble`, `Bounce`, `Tada`

#### Special
`Hinge`, `RollIn`, `RollOut`

#### Bounce
`BounceIn`, `BounceInDown`, `BounceInLeft`, `BounceInRight`, `BounceInUp`

#### Fade
`FadeIn`, `FadeInDown`, `FadeInLeft`, `FadeInRight`
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

#About me

A student in mainland China. 

Welcome to [offer me an internship](mailto:daimajia@gmail.com).
If you have any new idea about this project, feel free to [contact me](mailto:daimajia@gmail.com).
