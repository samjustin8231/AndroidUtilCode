package com.blankj.androidutilcode.feature.animation.BasePropertyAnimation;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.blankj.androidutilcode.R;
import com.blankj.androidutilcode.base.BaseBackActivity;

/**
 * Created by sam on 2018/2/2.
 */

public class BasePropertyAnimationActivity extends BaseBackActivity {

    private ImageView mImg;

    public static void start(Context context) {
        Intent starter = new Intent(context, BasePropertyAnimationActivity.class);
        context.startActivity(starter);
    }

    @Override
    public void initData(Bundle bundle) {

    }

    @Override
    public int bindLayout() {
        return R.layout.activity_base_property_animation;
    }

    @Override
    public void initView(Bundle savedInstanceState, View view) {
        getToolBar().setTitle("基础属性动画");
        mImg = findViewById(R.id.iv_img);
    }

    @Override
    public void doBusiness() {

    }

    @Override
    public void onWidgetClick(View view) {

    }

    public void alphaClick(View view) {

    }

    public void rotateClick(View view) {
        ObjectAnimator objectAnimatorScale = ObjectAnimator.ofFloat(mImg, "rotation", 0f, 360f);
        objectAnimatorScale.setDuration(1000);
        objectAnimatorScale.setRepeatCount(-1);
        objectAnimatorScale.start();
    }

    public void transClick(View view) {

    }

    public void scaleClick(View view) {
        /**动画组合**/
        PropertyValuesHolder objectAnimatorScaleX = PropertyValuesHolder.ofFloat("scaleX", 0f, 1f);
        PropertyValuesHolder objectAnimatorScaleY = PropertyValuesHolder.ofFloat("scaleY", 0f, 1f);
        /**同时播放两个动画**/
        ObjectAnimator.ofPropertyValuesHolder(mImg, objectAnimatorScaleX, objectAnimatorScaleY).setDuration(1000).start();
    }

    public void animationSetClick(View view) {
    }
}
