package com.blankj.androidutilcode.feature.animation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.blankj.androidutilcode.R;
import com.blankj.androidutilcode.base.BaseBackActivity;
import com.blankj.androidutilcode.feature.animation.BasePropertyAnimation.BasePropertyAnimationActivity;

/**
 * Created by sam on 2018/2/2.
 */

public class AnimationActivity extends BaseBackActivity {

    public static void start(Context context) {
        Intent starter = new Intent(context, AnimationActivity.class);
        context.startActivity(starter);
    }

    @Override
    public void initData(Bundle bundle) {

    }

    @Override
    public int bindLayout() {
        return R.layout.activity_util_animation;
    }

    @Override
    public void initView(Bundle savedInstanceState, View view) {
        getToolBar().setTitle(getString(R.string.animation_util));
    }

    @Override
    public void doBusiness() {

    }

    @Override
    public void onWidgetClick(View view) {

    }

    public void basePropertyAnimation(View view) {
        BasePropertyAnimationActivity.start(this);
    }
}
