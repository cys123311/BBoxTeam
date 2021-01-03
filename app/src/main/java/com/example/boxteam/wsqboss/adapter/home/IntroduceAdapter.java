package com.example.boxteam.wsqboss.adapter.home;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.boxteam.R;
import com.example.boxteam.wsqboss.base.BaseAdapter;
import com.example.boxteam.wsqboss.bean.home.IntroduceBean;

import java.util.List;

import butterknife.BindView;

public class IntroduceAdapter extends BaseAdapter {

    @BindView(R.id.img_introduce)
    ImageView imgIntroduce;
    @BindView(R.id.txt_musical)
    TextView txtMusical;
    @BindView(R.id.txt_style)
    TextView txtStyle;
    @BindView(R.id.txt_name)
    TextView txtName;

    public IntroduceAdapter(Context context, List<IntroduceBean> data) {
        super(context, data);
    }

    @Override
    protected int getLayout(int type) {
        return R.layout.adapter_item_introduce;
    }

    @Override
    protected void bindData(Object data, VH vh) {
        ImageView imgIntroduce = (ImageView) vh.getViewById(R.id.img_introduce);
        TextView txtMusical = (TextView) vh.getViewById(R.id.txt_musical);
        TextView txtStyle = (TextView) vh.getViewById(R.id.txt_style);
        TextView txtName = (TextView) vh.getViewById(R.id.txt_name);

        IntroduceBean introduceBean= (IntroduceBean) data;

        Glide.with(context).load(introduceBean.getImage()).into(imgIntroduce);
        txtMusical.setText(introduceBean.getMusical());
        txtStyle.setText(introduceBean.getType());
        txtName.setText(introduceBean.getName());

    }
}
