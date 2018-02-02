package com.blankj.androidutilcode.feature.customerview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.blankj.androidutilcode.R;
import com.blankj.androidutilcode.base.BaseBackActivity;
import com.blankj.androidutilcode.feature.customerview.CircleView.CircleViewActivity;
import com.blankj.androidutilcode.feature.customerview.olympicrings.OlympicRingsActivity;
import com.blankj.androidutilcode.feature.customerview.randomtextview.MyRandomTextViewActivity;

/**
 * Created by sam on 2018/2/2.
 */

public class CustomerViewActivity extends BaseBackActivity {

    public static void start(Context context) {
        Intent starter = new Intent(context, CustomerViewActivity.class);
        context.startActivity(starter);
    }

    @Override
    public void initData(Bundle bundle) {

    }

    @Override
    public int bindLayout() {
        return R.layout.activity_util_custom_view;
    }

    @Override
    public void initView(Bundle savedInstanceState, View view) {
        getToolBar().setTitle(getString(R.string.customer_util));
    }

    @Override
    public void doBusiness() {

    }

    @Override
    public void onWidgetClick(View view) {

    }

    public void olympicRingsClick(View view) {
        OlympicRingsActivity.start(this);
    }

    public void randomTextViewClick(View view) {
        MyRandomTextViewActivity.start(this);
    }

    public void circleViewClick(View view) {
        CircleViewActivity.start(this);
    }
}
