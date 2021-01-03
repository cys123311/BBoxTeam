package com.example.boxteam.cysboss.adapter;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.boxteam.R;
import com.example.boxteam.base.BaseAdapter;

import java.util.List;

/**
 * 优惠券 适配器
 */
public class CouponAdapter extends BaseAdapter {

    private int idext=1;
    private int[] color;

    {
        color = new int[]{
                R.color.purple_200,
                R.color.colorB,
                R.color.colorC
        };
    }

    public CouponAdapter(Context context, List data) {
        super(context, data);
    }

    @Override
    protected int getLayout(int type) {
        return R.layout.adapter_coupon_item;
    }

    @Override
    protected void bindData(Object data, VH vh) {
        RelativeLayout mColor = (RelativeLayout) vh.getViewById(R.id.mColor);

        mColor.setBackgroundColor(color[idext]);
        idext++;
        if (idext>=3){
            idext=1;
        }
    }
}
