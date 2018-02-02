package com.blankj.androidutilcode.feature.customerview.customertitlebar;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.blankj.androidutilcode.R;
import com.blankj.androidutilcode.base.BaseBackActivity;

/**
 * Created by sam on 2018/2/2.
 */

public class CustomTitleBarActivity extends BaseBackActivity {

    public static void start(Context context) {
        Intent starter = new Intent(context, CustomTitleBarActivity.class);
        context.startActivity(starter);
    }

    @Override
    public void initData(Bundle bundle) {

    }

    @Override
    public int bindLayout() {
        return R.layout.activity_custom_title_bar;
    }

    @Override
    public void initView(Bundle savedInstanceState, View view) {
        getToolBar().setTitle("自定义titlebar");
    }

    @Override
    public void doBusiness() {

    }

    @Override
    public void onWidgetClick(View view) {

    }
}
