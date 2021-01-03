package com.example.boxteam.ui.adapter;


import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.boxteam.R;
import com.example.boxteam.base.BaseAdapter;
import com.example.boxteam.ui.home.bean.DetailsBean;

import java.util.List;

public class DetailsAdapter extends BaseAdapter<DetailsBean> {
    public DetailsAdapter(Context context, List<DetailsBean> data) {
        super(context, data);
    }

    @Override
    protected int getLayout(int type) {
        return R.layout.adapter_main_details;
    }

    @Override
    protected void bindData(DetailsBean data, VH vh) {
        ImageView img = (ImageView) vh.getViewById(R.id.img);
        Glide.with(context).load(data.getImage()).into(img);
    }
}
