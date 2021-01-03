package com.example.boxteam.cysboss.adapter;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.boxteam.R;
import com.example.boxteam.base.BaseAdapter;

import java.util.List;

public class LiveOneAdapter extends BaseAdapter {

    public LiveOneAdapter(Context context, List Data) {
        super(context, Data);
    }

    @Override
    protected int getLayout(int type) {
        return R.layout.xiaoyu_layout_liveone_rlv_item;
    }

    @Override
    protected void bindData(Object data, VH vh) {

        ImageView liveone_rlv_img = (ImageView) vh.getViewById(R.id.liveone_rlv_img);

        Glide.with(context).load(R.drawable.drawable_ratingbar).into(liveone_rlv_img);
    }
}
