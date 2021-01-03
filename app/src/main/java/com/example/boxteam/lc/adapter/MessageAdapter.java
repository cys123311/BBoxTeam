package com.example.boxteam.lc.adapter;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

import com.example.boxteam.R;
import com.example.boxteam.base.BaseAdapter;
import com.example.boxteam.lc.bean.GiftMessage;

import java.util.List;

public class MessageAdapter extends BaseAdapter {
    public MessageAdapter(Context context, List<GiftMessage> data) {
        super(context, data);
    }

    @Override
    protected int getLayout(int type) {
        return R.layout.item_message;
    }

    @Override
    protected void bindData(Object data, VH vh) {
        GiftMessage bean = (GiftMessage) data;

        TextView txt_name = (TextView) vh.getViewById(R.id.txt_name);
        TextView txt_gift = (TextView) vh.getViewById(R.id.txt_gift);
        TextView txt_can = (TextView) vh.getViewById(R.id.txt_can);
        TextView txt_time = (TextView) vh.getViewById(R.id.txt_time);
        int a = R.mipmap.gift;
        txt_name.setText(bean.getName());
        txt_gift.setText(bean.getGift());
        txt_time.setText(bean.getTime());
        String can = bean.getCan();
        SpannableStringBuilder builder = new SpannableStringBuilder(can);
        builder.setSpan(new ForegroundColorSpan(Color.GREEN),0,can.length(), Spanned.SPAN_INCLUSIVE_INCLUSIVE);
        txt_can.setText(builder);

    }
}
