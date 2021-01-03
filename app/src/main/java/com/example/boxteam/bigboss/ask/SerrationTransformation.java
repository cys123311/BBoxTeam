package com.example.boxteam.bigboss.ask;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

import androidx.annotation.NonNull;

import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapTransformation;

import java.security.MessageDigest;
import java.text.DecimalFormat;

public class SerrationTransformation extends BitmapTransformation {

    float radius = 0f;
    float count = 120;
    String TAG = "Transform";

    public SerrationTransformation(Context context) {
    }

    @Override
    protected Bitmap transform(@NonNull BitmapPool pool, @NonNull Bitmap toTransform, int outWidth, int outHeight) {

        return biteBitmap( pool, toTransform );
    }

    private Bitmap biteBitmap(BitmapPool pool, Bitmap source) {
        if (source == null)
            return null;

        Bitmap result = pool.get( source.getWidth(), source.getHeight(), Bitmap.Config.ARGB_8888 );
        if (result == null) {
            result = Bitmap.createBitmap( source.getWidth(), source.getHeight(), Bitmap.Config.ARGB_8888 );
        }
        Canvas canvas = new Canvas( result );
        Paint newPaint = new Paint();
        //设置画笔图层为原图
        newPaint.setShader( new BitmapShader( source, BitmapShader.TileMode.CLAMP, BitmapShader.TileMode.CLAMP ) );
        newPaint.setAntiAlias( true );
        RectF rectF = new RectF( 0, 0, source.getWidth(), source.getHeight() );
        //把原图画到画布上
        canvas.drawRect( rectF, newPaint );
        DecimalFormat decimalFormat = new DecimalFormat( ".00" );//设置精度为小数点后两位
        radius = result.getWidth() / count;//获取圆的半径
        String s_radius = decimalFormat.format( radius );
        radius = Float.valueOf( s_radius );
        Bitmap layerUnit = getLayerUnit( radius );
        Paint paint = new Paint();
        paint.setAntiAlias( true );
        canvas.drawBitmap( result, 0, 0, paint );
        //从左到右画100
        for (int i = 0; i < count / 3; i++) {
            canvas.drawBitmap( layerUnit, i * 3 * radius, 0, paint );
        }
        return result;

    }

    //画图层单元
    public Bitmap getLayerUnit(float radius) {
        int width = Math.round( 5 * radius );
        int height = Math.round( 2 * radius );
        Bitmap temp = Bitmap.createBitmap( width, height, Bitmap.Config.ARGB_8888 );
        Canvas canvas = new Canvas( temp );
        Paint circlePaint = new Paint();
        circlePaint.setAntiAlias( true );
        circlePaint.setColor( Color.WHITE );//设置颜色为白色
        canvas.clipRect( radius, radius, 4 * radius, 2 * radius );
        canvas.drawCircle( radius, radius, radius, circlePaint );//画左侧圆
        canvas.drawCircle( 4 * radius, radius, radius, circlePaint );//画右侧圆
        Bitmap result = Bitmap.createBitmap( temp, Math.round( radius ), Math.round( radius ), Math.round( 3 * radius ), Math.round( radius ) );//裁剪需要的部分
        return result;
    }

    @Override
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {

    }
}
