package com.example.boxteam.wsqboss.adapter.home;

import android.content.Context;

import com.example.boxteam.base.BaseAdapter;
import com.example.boxteam.wsqboss.bean.home.OneBean;

import java.util.List;

public class OneAdapter extends BaseAdapter {

    public OneAdapter(Context context, List<OneBean> data) {
        super(context, data);
    }

    @Override
    protected int getLayout(int type) {
        return 0;
    }

    @Override
    protected void bindData(Object data, VH vh) {

    }
}
