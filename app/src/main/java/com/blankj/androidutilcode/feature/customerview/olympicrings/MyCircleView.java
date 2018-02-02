package com.blankj.androidutilcode.feature.customerview.olympicrings;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by sam on 2018/2/2.
 */

public class MyCircleView extends View{

    public MyCircleView(Context context) {
        super(context);
    }

    public MyCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
//        super.onDraw(canvas);

        //定义一个默认的画笔
        Paint paint = new Paint();
        //绘制画布为白色
        canvas.drawColor(Color.WHITE);
        //设置抗锯齿功能
        paint.setAntiAlias(true);
        //设置画笔的宽度
        paint.setStrokeWidth(3);
        //设置画笔填充的样式
        paint.setStyle(Paint.Style.STROKE);

        //绘制蓝色圆环
        paint.setColor(Color.BLUE);
        canvas.drawCircle(250, 250, 150, paint);

        //绘制黄色圆环
        paint.setColor(Color.YELLOW);
        canvas.drawCircle(500, 250, 150, paint);

        //绘制黑色圆环
        paint.setColor(Color.BLACK);
        canvas.drawCircle(750, 250, 150, paint);

        //绘制绿色圆环
        paint.setColor(Color.GREEN);
        canvas.drawCircle(375, 450, 150, paint);

        //绘制红色圆环
        paint.setColor(Color.BLUE);
        canvas.drawCircle(625, 450, 150, paint);
    }
}
