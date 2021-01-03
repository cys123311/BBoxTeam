package com.example.boxteam.ui.adapter;


import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.example.boxteam.R;
import com.example.boxteam.base.BaseAdapter;
import com.example.boxteam.ui.home.bean.LiveBean;

import java.util.List;

public class CollectAdapter extends BaseAdapter {

    public CollectAdapter(Context context, List<LiveBean> data) {
        super(context, data);
    }

    @Override
    protected int getLayout(int type) {
        return R.layout.adapter_main_collect;
    }

    @Override
    protected void bindData(Object data, VH vh) {
        ImageView img = (ImageView) vh.getViewById(R.id.img);
        TextView text = (TextView) vh.getViewById(R.id.text_liv);
        TextView name = (TextView) vh.getViewById(R.id.teacher_name);
        TextView time = (TextView) vh.getViewById(R.id.time);

        LiveBean liveBean= (LiveBean) data;

        Glide.with(context).load( liveBean.getImage()).apply(new RequestOptions().transform(new RoundedCorners(10))).into(img);

        text.setText(liveBean.getText());
        name.setText(liveBean.getName());
        time.setText(liveBean.getImage());

    }
}
