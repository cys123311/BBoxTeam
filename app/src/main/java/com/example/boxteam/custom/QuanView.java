package com.example.boxteam.custom;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/**
 * 自定义 View 实现优惠券效果 锯齿效果
 */
public class QuanView extends RelativeLayout {

    private Paint mPaint;

    private float mGap=20;    //圆和圆之间的间距
    private float mRadius=15; //圆的半径
    private float mRemain;    //画完圆和圆间距后多出来的距离
    private int mCircleNum;   //圆圈的数量

    public QuanView(Context context) {
        super(context);
        initPaint();
    }

    public QuanView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    private void initPaint(){
        mPaint=new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setColor(Color.WHITE);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if (mRemain == 0) {
            //计算不整除的剩余部分
            mRemain = (int) (w - mGap) % (2 * mRadius + mGap);
        }
        mCircleNum = (int) ((w - mGap) / (2 * mRadius + mGap));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i = 0; i < mCircleNum; i++) {
            //计算出要画的圆圈的x轴位置
            float x = mGap + mRadius + mRemain / 2 + ((mGap + mRadius * 2) * i);
            //从x位置开始画上面的圆圈
            canvas.drawCircle(x, 0, mRadius, mPaint);
            //从x位置开始画下面的圆圈
            canvas.drawCircle(x, getHeight(), mRadius, mPaint);
        }
    }
}
