package com.blankj.androidutilcode.feature.customerview.randomtextview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.blankj.androidutilcode.R;
import com.blankj.androidutilcode.base.BaseBackActivity;

/**
 * Created by sam on 2018/2/2.
 */

public class MyRandomTextViewActivity extends BaseBackActivity {
    public static void start(Context context) {
        Intent starter = new Intent(context, MyRandomTextViewActivity.class);
        context.startActivity(starter);
    }

    @Override
    public void initData(Bundle bundle) {

    }

    @Override
    public int bindLayout() {
        return R.layout.activity_random_textview;
    }

    @Override
    public void initView(Bundle savedInstanceState, View view) {
        getToolBar().setTitle("random textview");

    }

    @Override
    public void doBusiness() {

    }

    @Override
    public void onWidgetClick(View view) {

    }

}
