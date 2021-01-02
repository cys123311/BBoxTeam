package com.example.boxteam.wsqboss.adapter.home;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.example.boxteam.R;
import com.example.boxteam.wsqboss.base.BaseAdapter;
import com.example.boxteam.wsqboss.bean.home.IntroduceBean;
import com.example.boxteam.wsqboss.bean.home.OneBean;

import java.util.List;

public class OneAdapter extends BaseAdapter {

    public OneAdapter(Context context, List<OneBean> data) {
        super(context, data);
    }

    @Override
    protected int getLayout(int type) {
        return R.layout.adapter_item_one;
    }

    @Override
    protected void bindData(Object data, VH vh) {
        ImageView img = (ImageView) vh.getViewById(R.id.img);
        OneBean oneBean = (OneBean) data;

        Glide.with(context).load(oneBean.getImage()).apply(new RequestOptions().transform(new RoundedCorners(10))).into(img);

    }
}
