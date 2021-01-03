package com.example.boxteam.wsqboss.home.main;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.boxteam.R;
import com.example.boxteam.base.BaseActivity;
import com.example.boxteam.interfases.IBasePresenter;
import com.example.boxteam.ui.adapter.DetailsAdapter;
import com.example.boxteam.ui.home.bean.DetailsBean;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

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
    protected IBasePresenter createPresenter() {
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