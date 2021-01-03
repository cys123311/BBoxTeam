package com.example.boxteam.wsqboss.adapter.home;

import android.content.Context;

import com.example.boxteam.base.BaseAdapter;
import com.example.boxteam.wsqboss.bean.home.CourseBean;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.example.boxteam.R;

import com.example.boxteam.wsqboss.bean.home.CourseBean;
import com.example.boxteam.wsqboss.bean.home.IntroduceBean;
import com.example.boxteam.wsqboss.bean.home.LiveBean;

import java.util.List;

public class CourseAdapter extends BaseAdapter {

    public CourseAdapter(Context context, List<CourseBean> data) {
        super(context, data);
    }

    @Override
    protected int getLayout(int type) {
        return R.layout.adapter_item_course;
    }

    @Override
    protected void bindData(Object data, VH vh) {
        ImageView img = (ImageView) vh.getViewById(R.id.img_live);
        TextView name = (TextView) vh.getViewById(R.id.txt_style);
        TextView txt = (TextView) vh.getViewById(R.id.txt);

        CourseBean liveBean= (CourseBean) data;

        Glide.with(context).load( liveBean.getImage()).apply(new RequestOptions().transform(new RoundedCorners(10))).into(img);


        name.setText(liveBean.getName()+"\t"+liveBean.getSum());
        txt.setText(liveBean.getText());
    }
}
