package com.example.boxteam.ui.adapter;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.example.boxteam.R;
import com.example.boxteam.base.BaseAdapter;
import com.example.boxteam.ui.home.bean.SetBean;

import java.util.List;

import butterknife.BindView;

public class SetAdapter extends BaseAdapter<SetBean> {
    @BindView(R.id.img)
    ImageView img;
    @BindView(R.id.text_set)
    TextView textSet;
    @BindView(R.id.img_time)
    ImageView imgTime;
    @BindView(R.id.text_time)
    TextView textTime;
    @BindView(R.id.text_price)
    TextView textPrice;
    @BindView(R.id.text_name)
    TextView textName;

    public SetAdapter(Context context, List<SetBean> data) {
        super(context, data);
    }

    @Override
    protected int getLayout(int type) {
        return R.layout.adapter_item_set;
    }

    @Override
    protected void bindData(SetBean data, VH vh) {
        ImageView img = (ImageView) vh.getViewById(R.id.img);
        TextView set = (TextView) vh.getViewById(R.id.text_set);
        TextView time = (TextView) vh.getViewById(R.id.text_time);
        TextView price = (TextView) vh.getViewById(R.id.text_price);
        TextView text = (TextView) vh.getViewById(R.id.text_name);

        Glide.with(context).load(data.getImage()).apply(new RequestOptions().transform(new RoundedCorners(15))).into(img);

        set.setText(data.getSet());
        time.setText(data.getTime());
        price.setText(data.getPrice());
        text.setText(data.getTeacher_name());

    }
}
