package com.blankj.androidutilcode.feature.customerview.olympicrings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.blankj.androidutilcode.R;
import com.blankj.androidutilcode.base.BaseBackActivity;

/**
 * Created by sam on 2018/2/2.
 */

public class OlympicRingsActivity extends BaseBackActivity {
    public static void start(Context context) {
        Intent starter = new Intent(context, OlympicRingsActivity.class);
        context.startActivity(starter);
    }

    @Override
    public void initData(Bundle bundle) {

    }

    @Override
    public int bindLayout() {
        return R.layout.activity_olympic_rings;
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

}
