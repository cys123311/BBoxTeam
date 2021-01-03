package com.example.boxteam.wsqboss.home.main;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.boxteam.R;
import com.example.boxteam.wsqboss.adapter.home.DetailsAdapter;
import com.example.boxteam.wsqboss.base.BaseActivity;
import com.example.boxteam.wsqboss.bean.home.DetailsBean;
import com.example.boxteam.wsqboss.interfases.IBasePresenter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailsActivity extends BaseActivity {


    @BindView(R.id.tabMode)
    TabLayout tabMode;
    @BindView(R.id.rv_txt)
    RecyclerView rvTxt;

    @Override
    protected int getLayout() {
        return R.layout.activity_details;
    }

    @Override
    protected IBasePresenter createPrenter() {
        return null;
    }

    @Override
    protected void initView() {
        tabMode.addTab(tabMode.newTab().setText("课程介绍"));
        tabMode.addTab(tabMode.newTab().setText("课程目录"));

        List<DetailsBean> list=new ArrayList<>();

        list.add(new DetailsBean(R.mipmap.mianfei));
        list.add(new DetailsBean(R.mipmap.fufei));
        list.add(new DetailsBean(R.mipmap.fufei));
        list.add(new DetailsBean(R.mipmap.fufei));
        list.add(new DetailsBean(R.mipmap.fufei));

        rvTxt.setLayoutManager(new LinearLayoutManager(this));
        DetailsAdapter detailsAdapter = new DetailsAdapter(this,list);
        rvTxt.setAdapter(detailsAdapter);
    }

    @Override
    protected void initData() {

    }

}