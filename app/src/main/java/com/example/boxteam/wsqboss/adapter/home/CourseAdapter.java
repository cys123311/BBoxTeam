package com.example.boxteam.wsqboss.adapter.home;

import android.content.Context;

import com.example.boxteam.wsqboss.base.BaseAdapter;
import com.example.boxteam.wsqboss.bean.home.CourseBean;
import com.example.boxteam.wsqboss.bean.home.IntroduceBean;

import java.util.List;

public class CourseAdapter extends BaseAdapter {

    public CourseAdapter(Context context, List<CourseBean> data) {
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
