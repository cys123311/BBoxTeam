package com.example.boxteam.ui.adapter;


import android.content.Context;

import com.example.boxteam.R;
import com.example.boxteam.base.BaseAdapter;
import com.example.boxteam.ui.home.bean.OneBean;

import java.util.List;

public class OneAdapter extends BaseAdapter {

    public OneAdapter(Context context, List<OneBean> data) {
        super(context, data);
    }

    @Override
    protected int getLayout(int type) {
        return R.layout.adapter_one_item;
    }

    @Override
    protected void bindData(Object data, VH vh) {

    }
}
