package com.example.boxteam.wsqboss.adapter.home;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.example.boxteam.R;
import com.example.boxteam.wsqboss.base.BaseAdapter;
import com.example.boxteam.wsqboss.bean.home.LiveBean;

import org.w3c.dom.Text;

import java.util.List;

import butterknife.BindView;

public class LiveAdapter extends BaseAdapter {

    @BindView(R.id.img_live)
    ImageView imgLive;
    @BindView(R.id.txt_style)
    TextView txtStyle;
    @BindView(R.id.txt)
    TextView txt;

    public LiveAdapter(Context context, List<LiveBean> data) {
        super(context, data);
    }

    @Override
    protected int getLayout(int type) {
        return R.layout.adapter_item_live;
    }

    @Override
    protected void bindData(Object data, VH vh) {
        ImageView img = (ImageView) vh.getViewById(R.id.img_live);
        TextView name = (TextView) vh.getViewById(R.id.txt_style);
        TextView txt = (TextView) vh.getViewById(R.id.txt);

        LiveBean liveBean= (LiveBean) data;

        Glide.with(context).load(liveBean.getImage()).apply(new RequestOptions().transform(new RoundedCorners(10))).into(img);


        name.setText(liveBean.getName());
        txt.setText(liveBean.getText());
    }
}
