package com.example.boxteam.wsqboss.home.main;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.boxteam.R;
import com.example.boxteam.base.BaseActivity;
import com.example.boxteam.interfases.IBasePresenter;
import com.example.boxteam.ui.adapter.CollectAdapter;
import com.example.boxteam.ui.home.bean.LiveBean;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class CollectActivity extends BaseActivity {

    @BindView(R.id.tabMode)
    TabLayout tabMode;
    @BindView(R.id.rv_collect)
    RecyclerView rvCollect;

    String[] arr={"全部","课程","活动","商品"};
    private CollectAdapter collectAdapter;

    @Override
    protected int getLayout() {
        return R.layout.activity_collect;
    }

    @Override
    protected IBasePresenter createPresenter() {
        return null;
    }

    @Override
    protected void initView() {
        for (int i = 0; i < arr.length; i++) {
            tabMode.addTab(tabMode.newTab().setText(arr[i]));
        }

        List<LiveBean> liveBeans=new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            liveBeans.add(new LiveBean(R.mipmap.jifeng_shengyue,"声乐教学-免费60讲","给你来一段巴赫小步舞曲","钢琴一对一陪练课程","金悦悦老师","200/小时"));
        }

        rvCollect.setLayoutManager(new LinearLayoutManager(this));
        collectAdapter = new CollectAdapter(this,liveBeans);
        rvCollect.setAdapter(collectAdapter);

    }

    @Override
    protected void initData() {

    }
}