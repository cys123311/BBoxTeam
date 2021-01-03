package com.example.boxteam.lc;

import android.os.Bundle;
import android.util.Log;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.boxteam.R;
import com.example.boxteam.base.BaseActivity;
import com.example.boxteam.interfases.IBasePresenter;
import com.example.boxteam.lc.adapter.ClassAdapter;
import com.example.boxteam.lc.bean.ClassBean;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ClasssActivity extends BaseActivity {
    @BindView(R.id.class_tab)
    TabLayout classTab;
    @BindView(R.id.class_rlv)
    RecyclerView classRlv;
    private ArrayList<ClassBean> list;

    @Override
    protected int getLayout() {
        return R.layout.activity_class;
    }

    @Override
    protected IBasePresenter createPresenter() {
        return null;
    }


    @Override
    protected void initView() {
        list = new ArrayList<>();
        for(int i=0;i<5;i++){
            ClassBean c = new ClassBean();
            c.setName("吉娜·爱丽丝");
            c.setPic(R.drawable.girl);
            list.add(c);
        }
        Log.i("111", "initView: ");
    }

    @Override
    protected void initData() {
        classTab.addTab(classTab.newTab().setText("综合排序"));
        classTab.addTab(classTab.newTab().setText("级别排序"));
        classTab.addTab(classTab.newTab().setText("收藏排序"));

        classRlv.setLayoutManager(new LinearLayoutManager(this));
        ClassAdapter classAdapter = new ClassAdapter(this, list);
        classRlv.setAdapter(classAdapter);
    }

}
