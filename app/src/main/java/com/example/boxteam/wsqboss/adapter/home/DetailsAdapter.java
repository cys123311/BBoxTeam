package com.example.boxteam.wsqboss.adapter.home;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.boxteam.R;
import com.example.boxteam.wsqboss.base.BaseAdapter;
import com.example.boxteam.wsqboss.bean.home.DetailsBean;

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
